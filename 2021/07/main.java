import java.util.*;
import java.io.*;

class Main {
	public static int[] draws = new int[1000];
    public static void main(String[] args) throws IOException {
        Scanner fileScan = new Scanner(new File("text.txt"));
		
		int c = 0;
		int h = 0;
		int x = 0;

		while (c < 1000) {
			draws[c] = fileScan.nextInt();
			if (draws[c] > h) {
				h = draws[c];
			}
			c++;
		}

		c = 0;

		for (int i = 0; i < h; i++) {
			c = 0;
			int z = 0;
			while (c < 1000) {
				z += (Math.abs(draws[c] - i) * (Math.abs(draws[c] - i) + 1)/2);
				c++;

				if (x != 0 && z > x) {
					c = 1000;
				}
			}
			if (x == 0 || z < x) {
				x = z;
			}
		}

		System.out.println(x);
    }
}
