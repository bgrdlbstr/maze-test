package com.ninetyone.mazetest;

import java.util.List;

public class MazeTest {

    private static final Pair actualExitCoords = Pair.create(10, 19);

    public static void main(String[] args) {
        List<String> maze = Loader.loadMaze("maze.txt");
        printMaze(maze);

        Pair exitCoords = solve(maze);
        if (exitCoords.x() == actualExitCoords.x() && exitCoords.y() == actualExitCoords.y()) {
            System.out.println("Solved the maze");
        } else {
            System.out.println("Failed to solve the maze");
        }
    }

    private static Pair solve(List<String> maze) {
        //
        // TODO Start your code here
        //
        return Pair.create(0, 0);
    }

    static void printMaze(List<String> maze) {
        maze.forEach(System.out::println);
    }

}
