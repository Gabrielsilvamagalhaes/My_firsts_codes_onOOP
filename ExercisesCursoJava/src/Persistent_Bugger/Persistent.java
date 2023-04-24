package Persistent_Bugger;

import java.util.Scanner;

public class Persistent {
    public static int Persistence(long n) {
        String nforString = Long.toString(n);
        int result = 1, cont = 1;

        for (int i = 0; i < nforString.length(); i++) {
            String promt = nforString.substring(i, i + 1);
            result *= Integer.parseInt(promt);

        }

        while (result >= 10) {
            cont++;
            String x = Integer.toString(result);
            result = 1;
            for (int i = 0; i < x.length(); i++) {
                String y = x.substring(i, i + 1);
                result *= Integer.parseInt(y);
            }
        }

        if (nforString.length() == 1) {
            result = 0;
            cont = result;
        }
        return cont;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        long x = sc.nextLong();
        System.out.println(Persistence(x));
        sc.close();

    }

}
