package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Settings {

    @JsonProperty("add_stairs")
    public String addStairs;

    @JsonProperty("cell_size")
    public Long cellSize;

    @JsonProperty("corridor_layout")
    public String corridorLayout;

    @JsonProperty("door_set")
    public String doorSet;

    @JsonProperty("dungeon_layout")
    public String dungeonLayout;

    @JsonProperty("dungeon_size")
    public String dungeonSize;

    @JsonProperty("grid")
    public String grid;

    @JsonProperty("image_size")
    public String imageSize;

    @JsonProperty("infest")
    public String infest;

    @JsonProperty("last_room_id")
    public Long lastRoomId;

    @JsonProperty("level")
    public Long level;

    @JsonProperty("map_cols")
    public String mapCols;

    @JsonProperty("map_rows")
    public String mapRows;

    @JsonProperty("map_style")
    public String mapStyle;

    @JsonProperty("max_col")
    public Long maxCol;

    @JsonProperty("max_row")
    public Long maxRow;

    @JsonProperty("motif")
    public String motif;

    @JsonProperty("n_cols")
    public Long nCols;

    @JsonProperty("n_i")
    public Long nI;

    @JsonProperty("n_j")
    public Long nJ;

    @JsonProperty("n_pc")
    public Long nPc;

    @JsonProperty("n_rooms")
    public Long nRooms;

    @JsonProperty("n_rows")
    public Long nRows;

    @JsonProperty("name")
    public String name;

    @JsonProperty("peripheral_egress")
    public String peripheralEgress;

    @JsonProperty("remove_arcs")
    public String removeArcs;

    @JsonProperty("remove_deadends")
    public String removeDeadends;

    @JsonProperty("room_layout")
    public String roomLayout;

    @JsonProperty("room_polymorph")
    public String roomPolymorph;

    @JsonProperty("room_size")
    public String roomSize;

    @JsonProperty("seed")
    public Long seed;
}