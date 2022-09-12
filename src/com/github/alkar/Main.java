package com.github.alkar;

import com.github.alkar.parser.DungeonJsonParser;

public class Main {

    public static void main(String[] args) {
        var dungeon = DungeonJsonParser.parseDungeon();
        System.out.println(dungeon.toString());
    }
}
