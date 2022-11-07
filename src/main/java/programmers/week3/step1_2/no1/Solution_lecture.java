package programmers.week3.step1_2.no1;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_lecture {

    static class Position {
        int x, y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isValid(int width, int height) {
            if (x < 0 || x >= width) {
                return false;
            }
            return y >= 0 && y < height;
        }

    }

    public int solution(int[][] maps) {
        int mapHeight = maps.length;
        int mapWidth = maps[0].length;

        Queue<Position> queue = new LinkedList<>();
        int[][] count = new int[mapHeight][mapWidth];
        boolean[][] visited = new boolean[mapHeight][mapWidth];

        queue.offer(new Position(0, 0));
        count[0][0] = 1;
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Position current = queue.poll();

            int currentCount = count[current.y][current.x];

            // 4가지 경우
            final int[][] moving = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
            for (int[] ints : moving) {
                Position moved = new Position(current.x + ints[0], current.y + ints[1]);
                if (!moved.isValid(mapWidth, mapHeight)) {
                    continue;
                }
                if (visited[moved.y][moved.x]) {
                    continue;
                }
                if (maps[moved.y][moved.x] == 0) { // 0: 벽, 1: 길
                    continue;
                }
                count[moved.y][moved.x] = currentCount + 1;
                visited[moved.y][moved.x] = true;
                queue.offer(moved);
            }
        }

        int answer = count[mapHeight - 1][mapWidth - 1];
        if (answer == 0) {
            return -1;
        }
        return answer;
    }
}
