package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dungeon {

    @JsonProperty("cell_bit")
    private CellBit cellBit;

    @JsonProperty("cells")
    private List<List<Integer>> cells;

    private List<CorridorFeature> corridorFeatures;

    @JsonProperty("details")
    private Details details;

    @JsonProperty("rooms")
    private List<Room> rooms;

    @JsonProperty("settings")
    private Settings settings;

    @JsonProperty("stairs")
    private List<Stair> stairs;

    private List<WanderingMonster> wanderingMonsters;
}
