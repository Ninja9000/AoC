import java.util.*;
import java.io.*;

class Main {
    public static boolean[][] paper = new boolean[2000][2000];
    public static void main(String args[]) throws IOException {
        Scanner fileScan = new Scanner(new File("text.txt"));
        
        int c = 0;
		int w = 2000;
		int h = 2000;
		int w2 = 0;
		int h2 = 0;

        while (c < 827) {
	        int x = fileScan.nextInt();
			int y = fileScan.nextInt();

			paper[x][y] = true;
			c++;
        }

		String r = fileScan.nextLine();

		while (fileScan.hasNextLine()) {
			String m = fileScan.nextLine();
			int n = Integer.parseInt(m.substring(13));

			System.out.println(n);

			if (m.charAt(11) == 'x') {
				for (int i = 0; i < n+1; i++) {
					for (int j = 0; j < w; j++) {
						if (paper[n-i][j] || paper[n+i][j]) {
							paper[n-i][j] = true;
						} 
					}
				}

				w2 = n;
			} else {
				for (int i = 0; i < n+1; i++) {
					for (int j = 0; j < h; j++) {
						if (paper[j][n-i] || paper[j][n+i]) {
							paper[j][n-i] = true;
						} 
					}
				}

				h2 = n;
			}
		}

		for (int i = 0; i < h2; i++) {
			for (int j = 0; j < w2; j++) {
				if (paper[j][i]) {
					System.out.print("X");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
    }
}
