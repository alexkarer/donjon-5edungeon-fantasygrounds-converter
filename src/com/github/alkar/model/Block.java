package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Block {
    @JsonProperty("area")
    public Long area;

    @JsonProperty("col")
    public Long col;

    @JsonProperty("east")
    public Long east;

    @JsonProperty("height")
    public Long height;

    @JsonProperty("id")
    public Long id;

    @JsonProperty("north")
    public Long north;

    @JsonProperty("offset")
    public Double offset;

    @JsonProperty("row")
    public Long row;

    @JsonProperty("size")
    public String size;

    @JsonProperty("south")
    public Long south;

    @JsonProperty("west")
    public Long west;

    @JsonProperty("width")
    public Long width;
}
