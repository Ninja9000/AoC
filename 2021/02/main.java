import java.util.*;
import java.io.*;

class Main {
	public static String[] codes = new String[1000];
	public static void main(String[] args) throws IOException {
		Scanner fileScan = new Scanner(new File("text.txt"));
		
		int c = 0;
		int d = 0;
		int a = 0;
		int h = 0;

		while (fileScan.hasNextLine()) {
			codes[c] = fileScan.nextLine();
			int i = 0;
			if (codes[c].charAt(0) == 'f') {
				while (i < 10) {
					if (codes[c].contains(String.valueOf(i))) {
						h += i;
						d += i * a;
					}
					i++;
				}
			} else if (codes[c].charAt(0) == 'u') {
				while (i < 10) {
					if (codes[c].contains(String.valueOf(i))) {
						a -= i;
					}
					i++;
				}
			} else if (codes[c].charAt(0) == 'd') {
				while (i < 10) {
					if (codes[c].contains(String.valueOf(i))) {
						a += i;
					}
					i++;
				}
			}
			c++;
		}
		
		System.out.print(d + " * " + h + " = " + (d * h));
	}
}
