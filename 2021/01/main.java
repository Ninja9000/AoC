import java.util.*;
import java.io.*;

class Main {
	public static int[] codes = new int[2000];
	public static void main(String[] args) throws IOException {
		Scanner fileScan = new Scanner(new File("text.txt"));
		
		int c = 0;
		int i = 0;

		while (fileScan.hasNextLine()) {
			codes[c] = fileScan.nextInt();
			c++;
		}

		c = 0;

		while (c < codes.length - 3) {
			if ((codes[c] + codes[c+1] + codes[c+2]) < (codes[c+1] + codes[c+2] + codes[c+3])) {
				i++;
			}
			c++;
		}
		
		System.out.print(i);
	}
}
