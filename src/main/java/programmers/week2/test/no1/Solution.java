package programmers.week2.test.no1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] solution(String[][] booked, String[][] unbooked) {
        List<String> answer = new ArrayList<>();
        List<Customer> bookedList = new ArrayList<>();
        List<Customer> unbookedList = new ArrayList<>();

        int time;

        for (String[] b : booked) {
            bookedList.add(new Customer(b[0], b[1]));
        }

        for (String[] unb : unbooked) {
            unbookedList.add(new Customer(unb[0], unb[1]));
        }

        // 최초 가장 빠른 것 booked / unbooked
        List<Customer> totalList = new ArrayList<>();
        totalList.addAll(bookedList);
        totalList.addAll(unbookedList);
        totalList.sort((a,b) -> b.getArrivedAt() - a.getArrivedAt());

        Customer customer = totalList.get(0);

        answer.add(customer.getName());
        time = customer.getArrivedAt() + 10;

        // 이후 상담 종료 시간 + 10 booked 확인, unbooked 확인
        return null;
    }

    private static class Customer {
        int arrivedAt;
        String name;

        public Customer(String arrivedAt, String name) {
            this.arrivedAt = parseTime(arrivedAt);
            this.name = name;
        }

        public int getArrivedAt() {
            return arrivedAt;
        }

        public String getName() {
            return name;
        }

        private int parseTime(String time) {
            String[] split = time.split(":");
            return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
        }
    }
}
