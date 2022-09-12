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
public class Stair {

    @JsonProperty("col")
    private Long col;

    @JsonProperty("dir")
    private String dir;

    @JsonProperty("key")
    private String key;

    @JsonProperty("row")
    private Long row;
}
