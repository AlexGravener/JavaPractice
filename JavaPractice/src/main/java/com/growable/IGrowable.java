package com.growable;

public interface IGrowable {
    default String growing(String name){
        return name+ " has grown! yayayayay big boi";
    }

    String directionGrown();
}
