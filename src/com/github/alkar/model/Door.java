package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Door {

    @JsonProperty("col")
    public Long col;

    @JsonProperty("desc")
    public String desc;

    @JsonProperty("out_id")
    public Long outId;

    @JsonProperty("row")
    public Long row;

    @JsonProperty("secret")
    public String secret;

    @JsonProperty("trap")
    public String trap;

    @JsonProperty("type")
    public String type;
}
