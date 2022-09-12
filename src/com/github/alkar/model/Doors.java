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
public class Doors {

    @JsonProperty("north")
    private Door[] north;

    @JsonProperty("west")
    private Door[] west;

    @JsonProperty("east")
    private Door[] east;

    @JsonProperty("south")
    private Door[] south;
}
