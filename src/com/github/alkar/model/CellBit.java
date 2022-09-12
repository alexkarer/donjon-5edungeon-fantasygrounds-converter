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
public class CellBit {

    @JsonProperty("aperture")
    private Long aperture;

    @JsonProperty("arch")
    private Long arch;

    @JsonProperty("block")
    private Long block;

    @JsonProperty("corridor")
    private Long corridor;

    @JsonProperty("door")
    private Long door;

    @JsonProperty("label")
    private Long label;

    @JsonProperty("locked")
    private Long locked;

    @JsonProperty("nothing")
    private Long nothing;

    @JsonProperty("perimeter")
    private Long perimeter;

    @JsonProperty("portcullis")
    private Long portcullis;

    @JsonProperty("room")
    private Long room;

    @JsonProperty("room_id")
    private Long room_id;

    @JsonProperty("secret")
    private Long secret;

    @JsonProperty("stair_down")
    private Long stair_down;

    @JsonProperty("stair_up")
    private Long stair_up;

    @JsonProperty("trapped")
    private Long trapped;
}
