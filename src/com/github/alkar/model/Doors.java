package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Doors {

    @JsonProperty("north")
    public Door[] north;

    @JsonProperty("west")
    public Door[] west;

    @JsonProperty("east")
    public Door[] east;

    @JsonProperty("south")
    public Door[] south;
}
