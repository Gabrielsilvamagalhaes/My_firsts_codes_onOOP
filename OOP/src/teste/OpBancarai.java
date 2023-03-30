package teste;

import java.util.*;

public class OpBancarai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente user = new Cliente();
		int operator, pass, cont = 0;

		System.out.println("Welcome client " + user.Numberofclient() + "!");
		System.out.println("\nEnter the password ");
		pass = sc.nextInt();
		if (pass != 2586) {
			do {
				System.out.println("Password incorrect!");
				System.out.println("\nEnter the correct password: ");
				pass = sc.nextInt();
				System.out.println("===========================");
			} while (pass != 2586);
		}

		System.out.println("\"Account number:\" " + user.Numberofclient());
		System.out.println("Balance: " + user.Balance);

		do {
			System.out.println("\nWant to make a deposit or withdrawal? \n(1)deposit; \n(2)withdrawal; \n(3)none.");
			operator = sc.nextInt();

			if (operator == 1) {
				System.out.println("How much is the deposit: ");
				double colocar = sc.nextDouble();
				user.deposito(colocar);
				System.out.println("Balance after: " + user.Balance);
			} else if (operator == 2) {
				System.out.println("How much is the wiithdrawal: ");
				double retirar = sc.nextDouble();
				user.saque(retirar);
				System.out.println("Balance after: " + user.Balance);

				if (retirar > user.Balance) {
					System.out.println("Insufficient funds");
				}

			} else {
				System.out.println("Finish the program!");
				
			}
			System.out.println("Repeat the other operation? \n(1)yes or (2)not  ");
			cont = sc.nextInt();

		} while (cont == 1);
		switch (cont) {
		case 2:
			System.out.println("=============");
			System.out.println("Finish the program");
			System.out.println("=============");
		}
		sc.close();

	}

}
