package com.github.alkar.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.alkar.model.CorridorFeature;
import com.github.alkar.model.Dungeon;
import com.github.alkar.model.Mark;
import com.github.alkar.model.WanderingMonster;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DungeonJsonParser {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Dungeon parseDungeon() {
        Dungeon dungeon;
        try {
            var file = new File("./example.json");
            dungeon = objectMapper.readValue(file, Dungeon.class);
            enrichWithWanderingMonsters(dungeon, file);
            enrichWithCorridorFeature(dungeon, file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dungeon;
    }

    private static void enrichWithWanderingMonsters(Dungeon dungeon, File file) {
        try (var parser = objectMapper.createParser(file)) {
            var tree = parser.readValueAsTree();
            var wanderingMonsters = tree.get("wandering_monsters");
            if (wanderingMonsters != null) {
                dungeon.setWanderingMonsters(new ArrayList<>());
                var iterator = wanderingMonsters.fieldNames();
                while (iterator.hasNext()) {
                    var node = iterator.next();
                    dungeon.getWanderingMonsters().add(new WanderingMonster(
                            Long.parseLong(node),
                            wanderingMonsters.get(node).toString()));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void enrichWithCorridorFeature(Dungeon dungeon, File file) {
        try (var parser = objectMapper.createParser(file)) {
            var tree = parser.readValueAsTree();
            var corridorFeatures = tree.get("corridor_features");
            if (corridorFeatures != null) {
                dungeon.setCorridorFeatures(new ArrayList<>());
                var iterator = corridorFeatures.fieldNames();
                while (iterator.hasNext()) {
                    var node = iterator.next();
                    var dungeonFeature = corridorFeatures.get(node);
                    var mark = dungeonFeature.get("marks");
                    var marks = new Mark[mark.size()];
                    for (int i = 0; i < mark.size(); i++) {
                        marks[i] = new Mark(
                                Long.valueOf(mark.get(i).get("col").toString()),
                                Long.valueOf(mark.get(i).get("row").toString()));
                    }
                    dungeon.getCorridorFeatures().add(CorridorFeature.builder()
                            .key(node)
                            .detail(dungeonFeature.get("detail").toString())
                            .summary(dungeonFeature.get("summary").toString())
                            .marks(marks).build());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
