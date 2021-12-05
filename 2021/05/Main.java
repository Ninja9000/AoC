import java.util.*;
import java.io.*;

class Main {
    public static int[][] input = new int[1000][1000];
    public static void main(String[] args) throws IOException {
        Scanner fileScan = new Scanner(new File("text.txt"));

        int x = 0;
        
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                input[i][j] = 0;
            }
        }
        
        while (fileScan.hasNextInt()) {
            int x1 = fileScan.nextInt();
            int y1 = fileScan.nextInt();
            int x2 = fileScan.nextInt();
            int y2 = fileScan.nextInt();
            
            if (x1 == x2) {
                for (int i = Math.min(y1,y2); i <= Math.max(y1,y2); i++) {
                    input[x1][i]++;
                }
            } else if (y1 == y2) {
                for (int i = Math.min(x1,x2); i <= Math.max(x1,x2); i++) {
                    input[i][y1]++;
                }
            } else {
                for (int i = 0; i <= Math.max(x1,x2) - Math.min(x1,x2); i++) {
                    if (x1 < x2 && y1 < y2) {
                        input[x1+i][y1+i]++;
                    } else if (x1 < x2 && y1 > y2) {
                        input[x1+i][y1-i]++;
                    } else if (x1 > x2 && y1 < y2) {
                        input[x1-i][y1+i]++;
                    } else if (x1 > x2 && y1 > y2) {
                        input[x1-i][y1-i]++;
                    }
                }
            }
        }

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if (input[i][j] > 1) {
                    x++;
                }
            }
        }

        System.out.println(x);
    }
}

