package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CellBit {

    @JsonProperty("aperture")
    public Long aperture;

    @JsonProperty("arch")
    public Long arch;

    @JsonProperty("block")
    public Long block;

    @JsonProperty("corridor")
    public Long corridor;

    @JsonProperty("door")
    public Long door;

    @JsonProperty("label")
    public Long label;

    @JsonProperty("locked")
    public Long locked;

    @JsonProperty("nothing")
    public Long nothing;

    @JsonProperty("perimeter")
    public Long perimeter;

    @JsonProperty("portcullis")
    public Long portcullis;

    @JsonProperty("room")
    public Long room;

    @JsonProperty("room_id")
    public Long room_id;

    @JsonProperty("secret")
    public Long secret;

    @JsonProperty("stair_down")
    public Long stair_down;

    @JsonProperty("stair_up")
    public Long stair_up;

    @JsonProperty("trapped")
    public Long trapped;
}
