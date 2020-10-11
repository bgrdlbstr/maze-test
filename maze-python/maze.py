def readFile(fileName):
        f = open(fileName, "r")
        words = f.read().splitlines()
        f.close()
        return words


def solve(maze):
    #
    # TODO Put your code here
    # 
    return 0, 0


def print_maze(maze):
    print('\n'.join(maze))


def main():
    maze = readFile("maze.txt")
    print_maze(maze)
    exit_coords = solve(maze)
    if exit_coords == (10, 19):
        print("Solved the maze")
    else:
        print("Failed to solve maze")


main()

