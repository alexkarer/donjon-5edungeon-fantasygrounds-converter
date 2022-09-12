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
public class CorridorFeature {

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("key")
    private String key;

    @JsonProperty("marks")
    private Mark[] marks;

    @JsonProperty("summary")
    private String summary;
}
