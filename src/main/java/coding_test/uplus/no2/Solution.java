package coding_test.uplus.no2;

import java.util.HashMap;

public class Solution {

    public int solution(String[] ings, String[] menu, String[] sell) {

        int answer = 0;
        HashMap<String, Integer> menuMap = makeMenuMap(ings, menu);

        for (String s : sell) {
            String[] s1 = s.split(" ");
            Integer price = menuMap.get(s1[0]);
            answer = answer + price * Integer.parseInt(s1[1]);
        }

        return answer;
    }

    // 재료 맵
    public Integer calculateIngs(String[] ings, String materials) {
        int price = 0;
        HashMap<Character, Integer> ingsMap = new HashMap<>();

        for (String ing : ings) {
            String[] i = ing.split(" ");
            ingsMap.put(i[0].charAt(0), Integer.parseInt(i[1]));
        }

        for (int i = 0; i < materials.length(); i++) {
            price = price + ingsMap.get(materials.charAt(i));
        }

        return price;
    }

    // 메뉴 원가 만들기
    public HashMap<String, Integer> makeMenuMap(String[] ings, String[] menu) {
        HashMap<String, Integer> menuMap = new HashMap<>();

        for (String m : menu) {
            String[] s = m.split(" ");

            // 원가 계산하기
            Integer price = calculateIngs(ings, s[1]);

            menuMap.put(s[0], Integer.parseInt(s[2]) - price);
        }

        return menuMap;
    }


}
