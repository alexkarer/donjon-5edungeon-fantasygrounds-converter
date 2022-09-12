package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CorridorFeature {

    @JsonProperty("detail")
    public String detail;

    @JsonProperty("key")
    public String key;

    @JsonProperty("marks")
    public Mark[] marks;

    @JsonProperty("summary")
    public String summary;
}
