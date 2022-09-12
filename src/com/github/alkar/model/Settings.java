package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Settings {

    @JsonProperty("add_stairs")
    private String addStairs;

    @JsonProperty("cell_size")
    private Long cellSize;

    @JsonProperty("corridor_layout")
    private String corridorLayout;

    @JsonProperty("door_set")
    private String doorSet;

    @JsonProperty("dungeon_layout")
    private String dungeonLayout;

    @JsonProperty("dungeon_size")
    private String dungeonSize;

    @JsonProperty("grid")
    private String grid;

    @JsonProperty("image_size")
    private String imageSize;

    @JsonProperty("infest")
    private String infest;

    @JsonProperty("last_room_id")
    private Long lastRoomId;

    @JsonProperty("level")
    private Long level;

    @JsonProperty("map_cols")
    private String mapCols;

    @JsonProperty("map_rows")
    private String mapRows;

    @JsonProperty("map_style")
    private String mapStyle;

    @JsonProperty("max_col")
    private Long maxCol;

    @JsonProperty("max_row")
    private Long maxRow;

    @JsonProperty("motif")
    private String motif;

    @JsonProperty("n_cols")
    private Long nCols;

    @JsonProperty("n_i")
    private Long nI;

    @JsonProperty("n_j")
    private Long nJ;

    @JsonProperty("n_pc")
    private Long nPc;

    @JsonProperty("n_rooms")
    private Long nRooms;

    @JsonProperty("n_rows")
    private Long nRows;

    @JsonProperty("name")
    private String name;

    @JsonProperty("peripheral_egress")
    private String peripheralEgress;

    @JsonProperty("remove_arcs")
    private String removeArcs;

    @JsonProperty("remove_deadends")
    private String removeDeadends;

    @JsonProperty("room_layout")
    private String roomLayout;

    @JsonProperty("room_polymorph")
    private String roomPolymorph;

    @JsonProperty("room_size")
    private String roomSize;

    @JsonProperty("seed")
    private Long seed;
}