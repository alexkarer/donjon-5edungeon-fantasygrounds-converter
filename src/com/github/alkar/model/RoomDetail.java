package com.github.alkar.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomDetail {

    @JsonProperty("monster")
    private String[] monsterAndLoot;

    @JsonProperty("hidden_treasure")
    private String[] hiddenTreasure;

    @JsonProperty("trap")
    private String[] trap;

    @JsonProperty("room_features")
    private String roomFeatures;
}
