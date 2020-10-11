package com.ninetyone.mazetest;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("UnstableApiUsage")
public class Loader {
    static List<String> loadMaze(String filename) {
        try {
            URL url = Resources.getResource(filename);
            String text = Resources.toString(url, Charsets.UTF_8);
            String[] split = text.split(System.lineSeparator());
            return Arrays.asList(split);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
