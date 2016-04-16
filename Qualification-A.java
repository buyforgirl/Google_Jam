import java.util.*;
import java.io.*;

class A {
	public static int sleep(int n) {
		Set<Integer> set = new HashSet<>();
		int i = 1;
		
		while (set.size() <= 10 && i < 10000) {
			int number = i * n;
			while (number != 0) {
				int num = number % 10;
				set.add(num);
				if (set.size() == 10) {
					return i * n;
				}
				number /= 10;
			}
			i++;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = null;

        try {
        	s = new Scanner(new BufferedReader(new FileReader("A-large.in")));
        	int t = s.nextInt();
			for (int i = 0; i < t; i++) {
				int num = sleep(s.nextInt());
				if (num != -1) {
					System.out.println("Case #" + (i + 1) + ": " + num);
				} else {
					System.out.println("Case #" + (i + 1) + ": " + "INSOMNIA");
				}
			}
		} catch (Exception e) {
			System.out.print(e);
		} finally {
            if (s != null) {
                s.close();
            }
        }
	}
}