package com.ninetyone.mazetest;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Pair {
    static Pair create(int x, int y) {
        return new AutoValue_Pair(x, y);
    }

    abstract int x();
    abstract int y();
}