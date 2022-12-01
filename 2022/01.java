import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
		String file = new Scanner(new File("text.txt")).useDelimiter("\\Z").next();
		
		String[] elves = file.split("\n\n");
		int[] calTotals = new int[239];
		
		for (int i = 0; i < 239; i++) {
			String[] calTotal = elves[i].split("\n");
			for (int j = 0; j < calTotal.length; j++) {
				calTotals[i] += Integer.parseInt(calTotal[j]);
			}
		}

		Arrays.sort(calTotals);
		System.out.println(calTotals[238]);
		System.out.println(calTotals[238] + calTotals[237] + calTotals[236]);
	}
}
