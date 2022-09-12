package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoomDetail {

    @JsonProperty("monster")
    public String[] monsterAndLoot;

    @JsonProperty("hidden_treasure")
    public String[] hiddenTreasure;

    @JsonProperty("trap")
    public String[] trap;

    @JsonProperty("room_features")
    public String roomFeatures;
}
