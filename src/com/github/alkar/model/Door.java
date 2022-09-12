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
public class Door {

    @JsonProperty("col")
    private Long col;

    @JsonProperty("desc")
    private String desc;

    @JsonProperty("out_id")
    private Long outId;

    @JsonProperty("row")
    private Long row;

    @JsonProperty("secret")
    private String secret;

    @JsonProperty("trap")
    private String trap;

    @JsonProperty("type")
    private String type;
}
