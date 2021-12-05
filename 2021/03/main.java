import java.util.*;
import java.io.*;

class Main {
    public static String[] input = new String[1000];
    public static void main(String[] args) throws IOException {
        Scanner fileScan = new Scanner(new File("text.txt"));
        
        int c = 0;
        int d = 0;
        int a1 = 0;
        int b1 = 0;
        String a2 = "";
        String b2 = "";

        while (fileScan.hasNextLine()) {
            input[c] = fileScan.nextLine();
            c++;
        }

        while (d < 12) {
            a1 = 0;
            b1 = 0;
            c = 0;
            while (c < 1000) {
                if (input[c].startsWith(a2)) {
                    if (input[c].charAt(d) == '0') {
                        a1++;
                    } else {
                        b1++;
                    }
                    if ((a1 + b1) == 1) {
                        System.out.println(a2 + " " + input[c]);
                    }
                }
                c++;
            }
                        
            if (a1 == b1) {
                a1 = 1;
                b1 = 0;
            }

            if (a1 > b1 && a1 != 0) {
                a2 += "0";
            } else {
                a2 += "1";
            }
            
            d++;
        }

        d = 0;

        while (d < 12) {
            a1 = 0;
            b1 = 0;
            c = 0;
            while (c < 1000) {
                if (input[c].startsWith(b2)) {
                    if (input[c].charAt(d) == '0') {
                        a1++;
                    } else {
                        b1++;
                    }
                    if ((a1 + b1) == 1) {
                        System.out.println(b2 + " " + input[c]);
                    }
                }
                c++;
            }
            
            if (a1 == b1) {
                a1 = 0;
                b1 = 1;
            }
            
            if (a1 > b1 && a1 != 0) {
                b2 += "1";
            } else {
                b2 += "0";
            }
            
            d++;
        }
    }
}
