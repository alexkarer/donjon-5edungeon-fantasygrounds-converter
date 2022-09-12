package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contents {

    @JsonProperty("detail")
    public RoomDetail detail;

    @JsonProperty("inhabited")
    public String inhabited;

    @JsonProperty("summary")
    public String summary;
}
