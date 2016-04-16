import java.util.*;
import java.io.*;

class A {
    public static String Solution(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
        	char c = input.charAt(i);
            if (c >= sb.charAt(0)) {
            	sb.insert(0, c);
            } else {
            	sb.append(c);
            }
        }
        
       return sb.toString();
    }

    public static void main(String[] args) {
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader(args[0])));
            int t = s.nextInt();
            for (int i = 0; i < t; i++) {
                String str = s.next();
                System.out.println("Case #" + (i + 1) + ": " + Solution(str));
                
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