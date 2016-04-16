import java.util.*;
import java.io.*;

class B {
    public static String Solution(int n, Scanner s) {
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < n; j++) {
                int num = s.nextInt();
                Integer count = map.get(num);
                if (count == null) {
                    count = 0;
                }
                map.put(num, count + 1);
            }
       }
       List<Integer> array = new ArrayList<>();
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value % 2 == 1) {
                array.add(key);
            }
        }
        Collections.sort(array);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.size(); i++) {
            sb.append(String.valueOf(array.get(i)) + ' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader(args[0])));
            int t = s.nextInt();
            for (int i = 0; i < t; i++) {
                int n = s.nextInt();
                System.out.println("Case #" + (i + 1) + ": " + Solution(n, s));

            }
        }  catch (Exception e) {
            System.out.print(e);
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}