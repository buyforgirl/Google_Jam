import java.util.*;
import java.io.*;

class B {
    public static int PancakesSort(StringBuilder array) {
    	StringBuilder sb = deal(array);
    	for (int i = sb.length() - 1; i >= 0; i--) {
    		if (sb.charAt(i) == '-') {
    			return i + 1;
    		}
    	}
    	return 0;
    }

    public static StringBuilder deal(StringBuilder array) {
    	StringBuilder newArray = new StringBuilder();
    	for (int i = 0; i < array.length(); i++) {
    		if (i != 0 && array.charAt(i) == array.charAt(i - 1)) {
    			continue;
    		}
    		newArray.append(array.charAt(i));
    	}
    	return newArray;
    }

    public static void main(String[] args) {
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader(args[0])));
            int t = s.nextInt();
            s.nextLine();
            for (int i = 0; i < t; i++) {
                String next = s.nextLine();
                StringBuilder array = new StringBuilder(next);
                int result = PancakesSort(array);
                System.out.println("Case #" + (i + 1) + ": " + result);
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