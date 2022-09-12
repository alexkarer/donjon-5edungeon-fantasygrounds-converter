package com.github.alkar.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.alkar.model.Dungeon;

import java.io.File;
import java.io.IOException;

public class DungeonJsonParser {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Dungeon parseDungeon() {
        Dungeon dungeon;
        try {
            var file = new File("./example.json");
            dungeon = objectMapper.readValue(file, Dungeon.class);

            try (var parser = objectMapper.createParser(file)) {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dungeon;
    }
}
