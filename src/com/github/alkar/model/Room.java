package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Room {

    @JsonProperty("area")
    public Long area;

    @JsonProperty("blocks")
    public List<Block> blocks;

    @JsonProperty("col")
    public Long col;

    @JsonProperty("composite")
    public Long composite;

    @JsonProperty("contents")
    public Contents contents;

    @JsonProperty("doors")
    public Doors doors;

    @JsonProperty("east")
    public Long east;

    @JsonProperty("height")
    public Long height;

    @JsonProperty("id")
    public Long id;

    @JsonProperty("north")
    public Long north;

    @JsonProperty("offset")
    public double offset;

    @JsonProperty("polygon")
    public Long polygon;

    @JsonProperty("row")
    public Long row;

    @JsonProperty("shape")
    public String shape;

    @JsonProperty("size")
    public String size;

    @JsonProperty("south")
    public Long south;

    @JsonProperty("west")
    public Long west;

    @JsonProperty("width")
    public Long width;
}
