package com.github.alkar.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WanderingMonster {

    public WanderingMonster(Long index, String monster) {
        this.index = index;
        var strings = monster.split(",");
        this.description = strings[strings.length - 1];
        this.encounter = String.join(",", Arrays.copyOfRange(strings, 0, strings.length - 1));
    }

    private Long index;

    private String encounter;

    private String description;
}
