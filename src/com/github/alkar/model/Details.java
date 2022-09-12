package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Details {

    @JsonProperty("floor")
    public String floor;

    @JsonProperty("history")
    public String history;

    @JsonProperty("illumination")
    public String illumination;

    @JsonProperty("special")
    public String special;

    @JsonProperty("temperature")
    public String temperature;

    @JsonProperty("walls")
    public String walls;
}
