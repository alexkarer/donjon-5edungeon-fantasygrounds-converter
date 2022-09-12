package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mark {

    @JsonProperty("col")
    public Long col;

    @JsonProperty("row")
    public Long row;
}
