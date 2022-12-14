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
public class Contents {

    @JsonProperty("detail")
    private RoomDetail detail;

    @JsonProperty("inhabited")
    private String inhabited;

    @JsonProperty("summary")
    private String summary;
}
