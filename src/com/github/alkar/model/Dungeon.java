package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dungeon {

    @JsonProperty("cell_bit")
    public CellBit cellBit;

    @JsonProperty("details")
    public Details dungeon;

    @JsonProperty("settings")
    public Settings settings;

    @JsonProperty("rooms")
    public List<Room> rooms;
}
