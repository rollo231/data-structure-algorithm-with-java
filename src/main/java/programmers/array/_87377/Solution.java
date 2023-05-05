package programmers.array._87377;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String[] solution(int[][] line) {
        // 1. 모든 직선 쌍에 대해 반복
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                // 1.1 교점 좌표 구하기
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);
                // 1.2 정수 좌표만 저장
                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }

        // 2. 저장된 정수들에 대해 x,y 좌표의 최대값 최솟값 구하기
        Point minimumPoint = getMinimumPoint(points);
        Point maximumPoint = getMaximumPoint(points);
        int width = (int) (maximumPoint.x - minimumPoint.x + 1);
        int height = (int) (maximumPoint.y - minimumPoint.y + 1);

        // 3. 구한 최대값, 최솟값을 이용하여 2차원 배열의 크기 결정
        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        // 4. 2차원 배열에 별 표시
        for (Point point : points) {
            int x = (int) (point.x - minimumPoint.x);
            int y = (int) (maximumPoint.y - point.y);
            arr[y][x] = '*';
        }

        // 5. 문자열 배열로 변환 후 반환
        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }
        return result;
    }

    private static class Point {
        private final long x;
        private final long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        // 교점 구해서 반환하기
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        // 정수 일때만
        return x % 1 != 0 || y % 1 != 0 ? null : new Point((long) x, (long) y);
    }

    private Point getMinimumPoint(List<Point> points) {
        // 가장 작은 좌표 찾기
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point point : points) {
            if (point.x < x) {
                x = point.x;
            }
            if (point.y < y) {
                y = point.y;
            }
        }
        return new Point(x, y);
    }

    private Point getMaximumPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point point : points) {
            if (point.x > x) {
                x = point.x;
            }
            if (point.y > y) {
                y = point.y;
            }
        }
        return new Point(x, y);
    }
}
