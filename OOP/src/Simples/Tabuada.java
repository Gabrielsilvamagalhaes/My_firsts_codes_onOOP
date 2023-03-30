package Simples;
import java.util.*;
public class Tabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tabuada user = new Tabuada();
		char cont;
		do {
		System.out.println("Enter the number of the tabuada: ");
		int numb = sc.nextInt();
		System.out.println("Quantas vezes deseja saber a tabuada");
		int tam =sc.nextInt();
		user.tabuada(numb, tam);
		
		System.out.println("Repit the program? write: \"s\" or \"n\"");
			cont = sc.next().charAt(0);
		}while(cont == 's');
		switch (cont) {
		case'n':
			System.out.println("|========================|");
			System.out.println("|Finish the program baby |");
			System.out.println("|========================|");
		}
	}
	private  void tabuada(int n, int spc) {
		int mult = 0;
		for(int i =1 ; i<=spc;i++) {
		 mult = n * i;
		 System.out.println(n +"x" + i +"=" +mult);
	}
		
	}

}
