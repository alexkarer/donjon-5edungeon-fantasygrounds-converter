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
public class Details {

    @JsonProperty("floor")
    private String floor;

    @JsonProperty("history")
    private String history;

    @JsonProperty("illumination")
    private String illumination;

    @JsonProperty("special")
    private String special;

    @JsonProperty("temperature")
    private String temperature;

    @JsonProperty("walls")
    private String walls;
}
