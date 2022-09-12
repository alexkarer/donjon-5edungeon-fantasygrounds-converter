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
public class Block {
    @JsonProperty("area")
    private Long area;

    @JsonProperty("col")
    private Long col;

    @JsonProperty("east")
    private Long east;

    @JsonProperty("height")
    private Long height;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("north")
    private Long north;

    @JsonProperty("offset")
    private Double offset;

    @JsonProperty("row")
    private Long row;

    @JsonProperty("size")
    private String size;

    @JsonProperty("south")
    private Long south;

    @JsonProperty("west")
    private Long west;

    @JsonProperty("width")
    private Long width;
}
