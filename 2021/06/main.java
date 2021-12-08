import java.util.*;
import java.io.*;

class Main {
	public static long[] lefishe = new long[9];
	public static void main(String args[]) throws IOException {
        Scanner fileScan = new Scanner(new File("text.txt"));
		
		int c = 0;
		long z = 0;

		while (fileScan.hasNextInt()) {
			int x = fileScan.nextInt();
			lefishe[x]++;
		}

		while (c < 256) {
			long t8 = lefishe[8];
			long t7 = lefishe[7];
			long t6 = lefishe[6];
			long t5 = lefishe[5];
			long t4 = lefishe[4];
			long t3 = lefishe[3];
			long t2 = lefishe[2];
			long t1 = lefishe[1];
			long t0 = lefishe[0];
      
			lefishe[8] = 0;
			lefishe[7] = t8;
			lefishe[6] = t7;
			lefishe[5] = t6;
			lefishe[4] = t5;
			lefishe[3] = t4;
			lefishe[2] = t3;
			lefishe[1] = t2;
			lefishe[0] = t1;
			lefishe[6] += t0;
			lefishe[8] += t0;
			c++;
		}

		for (long fish : lefishe) {
			z += fish;
		}

		System.out.println(z);
    }
}
