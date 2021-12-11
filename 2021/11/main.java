import java.util.*;
import java.io.*;

class Main {
    public static int[][] octopodes = new int[10][10];
    public static void main(String args[]) throws IOException {
        Scanner fileScan = new Scanner(new File("text.txt"));
        
        int c = 0;
		boolean sync = false;

        while (fileScan.hasNextLine()) {
			String x = fileScan.nextLine();
			for (int i = 0; i < 10; i++) {
	            octopodes[c][i] = ((int) x.charAt(i) - 48);
			}
			c++;
        }

		c = 0;

		while (!sync) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					octopodes[i][j]++;
				}
			}

			boolean flashing = true;

			while (flashing) {
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						if (i > 0 && i < 9 && j > 0 && j < 9) {
							if (octopodes[i][j] > 9) {
								octopodes[i][j] = 0;

								if (octopodes[i-1][j-1] != 0) {
									octopodes[i-1][j-1]++;
								}
								if (octopodes[i-1][j] != 0) {
									octopodes[i-1][j]++;
								}
								if (octopodes[i-1][j+1] != 0) {
									octopodes[i-1][j+1]++;
								}
								if (octopodes[i][j-1] != 0) {
									octopodes[i][j-1]++;
								}
								if (octopodes[i][j+1] != 0) {
									octopodes[i][j+1]++;
								}
								if (octopodes[i+1][j-1] != 0) {
									octopodes[i+1][j-1]++;
								}
								if (octopodes[i+1][j] != 0) {
									octopodes[i+1][j]++;
								}
								if (octopodes[i+1][j+1] != 0) {
									octopodes[i+1][j+1]++;
								}
							}
						} else if (i > 0 && i < 9) {
							if (octopodes[0][i] > 9) {
								octopodes[0][i] = 0;

								if (octopodes[0][i-1] != 0) {
									octopodes[0][i-1]++;
								}
								if (octopodes[0][i+1] != 0) {
									octopodes[0][i+1]++;
								}
								if (octopodes[1][i-1] != 0) {
									octopodes[1][i-1]++;
								}
								if (octopodes[1][i] != 0) {
									octopodes[1][i]++;
								}
								if (octopodes[1][i+1] != 0) {
									octopodes[1][i+1]++;
								}
							}

							if (octopodes[9][i] > 9) {
								octopodes[9][i] = 0;

								if (octopodes[9][i-1] != 0) {
									octopodes[9][i-1]++;
								}
								if (octopodes[9][i+1] != 0) {
									octopodes[9][i+1]++;
								}
								if (octopodes[8][i-1] != 0) {
									octopodes[8][i-1]++;
								}
								if (octopodes[8][i] != 0) {
									octopodes[8][i]++;
								}
								if (octopodes[8][i+1] != 0) {
									octopodes[8][i+1]++;
								}
							}
						} else if (j > 0 && j < 9) {
							if (octopodes[j][0] > 9) {
								octopodes[j][0] = 0;

								if (octopodes[j-1][0] != 0) {
									octopodes[j-1][0]++;
								}
								if (octopodes[j+1][0] != 0) {
									octopodes[j+1][0]++;
								}
								if (octopodes[j-1][1] != 0) {
									octopodes[j-1][1]++;
								}
								if (octopodes[j][1] != 0) {
									octopodes[j][1]++;
								}
								if (octopodes[j+1][1] != 0) {
									octopodes[j+1][1]++;
								}
							}

							if (octopodes[j][9] > 9) {
								octopodes[j][9] = 0;

								if (octopodes[j-1][9] != 0) {
									octopodes[j-1][9]++;
								}
								if (octopodes[j+1][9] != 0) {
									octopodes[j+1][9]++;
								}
								if (octopodes[j-1][8] != 0) {
									octopodes[j-1][8]++;
								}
								if (octopodes[j][8] != 0) {
									octopodes[j][8]++;
								}
								if (octopodes[j+1][8] != 0) {
									octopodes[j+1][8]++;
								}
							}
						} else {
							if (octopodes[0][0] > 9) {
								octopodes[0][0] = 0;

								if (octopodes[0][1] != 0) {
									octopodes[0][1]++;
								}
								if (octopodes[1][0] != 0) {
									octopodes[1][0]++;
								}
								if (octopodes[1][1] != 0) {
									octopodes[1][1]++;
								}
							}

							if (octopodes[0][9] > 9) {
								octopodes[0][9] = 0;

								if (octopodes[0][8] != 0) {
									octopodes[0][8]++;
								}
								if (octopodes[1][9] != 0) {
									octopodes[1][9]++;
								}
								if (octopodes[1][8] != 0) {
									octopodes[1][8]++;
								}
							}

							if (octopodes[9][0] > 9) {
								octopodes[9][0] = 0;

								if (octopodes[9][1] != 0) {
									octopodes[9][1]++;
								}
								if (octopodes[8][0] != 0) {
									octopodes[8][0]++;
								}
								if (octopodes[8][1] != 0) {
									octopodes[8][1]++;
								}
							}

							if (octopodes[9][9] > 9) {
								octopodes[9][9] = 0;

								if (octopodes[9][8] != 0) {
									octopodes[9][8]++;
								}
								if (octopodes[8][9] != 0) {
									octopodes[8][9]++;
								}
								if (octopodes[8][8] != 0) {
									octopodes[8][8]++;
								}
							}
						}
					}
				}

				flashing = false;

				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						if (octopodes[i][j] > 9) {
							flashing = true;
						}
					}
				}
			}

			c++;

			sync = true;

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (octopodes[i][j] != 0) {
						sync = false;
					}
				}
			}
		}

		System.out.println(c);
    }
}
