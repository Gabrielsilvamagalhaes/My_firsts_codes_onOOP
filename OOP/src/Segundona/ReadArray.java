package Segundona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReadArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] x = new int[3][3];
		int []z = {3, 4, 1, 0, 1}; 
		int [] w = {1,7,0,2};
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("Tell me elements for " + (i + 1) + "° line: ");
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = sc.nextInt();
			}

		}
		System.out.println("Sum: \n"+sum(x));
		System.out.println("---------------");
		inverted(z);
		System.out.println();
		merge(z, w);
		sc.close();
	}

	public static ArrayList<Integer> sum(int[][] y) {
		ArrayList<Integer> z = new ArrayList<>();
		int sum;
		for (int i = 0; i < y.length; i++) {
			sum = 0;
			for (int j = 0; j < y[i].length; j++) {
				sum += y[i][j];
			}
			z.add(sum);
		}
		return z;

	}
	public static void inverted(int [] y) {
		ArrayList<Integer> c = new ArrayList<>();
		for(int i =0; i<y.length; i++) {
			c.add(y[i]);
			
		}
		
		Collections.sort(c);
		System.out.println("Crecent: ");
		System.out.println(c);
		System.out.println("---------------");
		Collections.reverse(c);
		System.out.println("Decrecent: ");
		System.out.println(c);
	}
	public static void merge(int[] a, int [] b) {
		ArrayList<Integer> c = new ArrayList<>();
		for(int x: a) {
			c.add(x);
		}
		for(int x: b) {
			c.add(x);
		}
		int [] k = new int[c.size()];
		for(int i =0; i<c.size(); i++) {
			k[i]=c.get(i);
		}
		inverted(k);
		
	}
}