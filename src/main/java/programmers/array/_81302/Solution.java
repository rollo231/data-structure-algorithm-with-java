package programmers.array._81302;

// https://school.programmers.co.kr/learn/courses/30/lessons/81302
public class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int i = 0; i < answer.length; i++) {
            String[] place = places[i];
            char[][] room = new char[places.length][];
            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }
        }
        // 2. 모든 응시자의 위치를 검사했으나 거리두기를 지키지 않은 경우를 발견하지 못했으면 거리두기를 지킨 것
        return answer;
    }

    private boolean isDistanced(char[][ ] room) {
        // 1. 대기실의 모든 응시자 위치에 대해 반복
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[j].length; j++) {
                if (room[j][i] != 'P') continue;
            }
        }
        // 1.1 상하좌우 중 빈 테이블이 있는 방향에 대해 1.2로 진행
        // 1.2 빈 테이블과 인접한 위치 중 응시자가 있다면 거리두기를 지키지 않은 것
        return true;
    }
}
