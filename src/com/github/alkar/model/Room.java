package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    @JsonProperty("area")
    private Long area;

    @JsonProperty("blocks")
    private List<Block> blocks;

    @JsonProperty("col")
    private Long col;

    @JsonProperty("composite")
    private Long composite;

    @JsonProperty("contents")
    private Contents contents;

    @JsonProperty("doors")
    private Doors doors;

    @JsonProperty("east")
    private Long east;

    @JsonProperty("height")
    private Long height;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("north")
    private Long north;

    @JsonProperty("offset")
    private double offset;

    @JsonProperty("polygon")
    private Long polygon;

    @JsonProperty("row")
    private Long row;

    @JsonProperty("shape")
    private String shape;

    @JsonProperty("size")
    private String size;

    @JsonProperty("south")
    private Long south;

    @JsonProperty("west")
    private Long west;

    @JsonProperty("width")
    private Long width;
}
