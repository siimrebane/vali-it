package ee.bcs.valiit.solution.codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Enough {
    static Map<Integer, Integer> countMap = new HashMap<>();

    public static void main(String[] args) {
        int n = 2;
        int[] input = {1, 2, 3, 1, 2, 1, 2, 3};
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (canAdd(input, i, n)) {
                resultList.add(input[i]);
            }
        }
        System.out.println(resultList);
    }

    public static boolean canAdd(int[] input, int i, int n) {
        int nr = input[i];
        Integer count = countMap.get(nr);
        if (count == null) {
            count = 0;
        }
        if (count < n) {
            countMap.put(nr, count + 1);
            return true;
        } else {
            return false;
        }
    }

}
