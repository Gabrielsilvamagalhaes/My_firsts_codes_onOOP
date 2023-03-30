package Calculator_aprimorater;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Caculates user = new Caculates();
		int cont =0;
		System.out.println("==============================================");	
		System.out.println("Welcome the my new calculator(\"version 2.0\")");
		System.out.println("==============================================");	
		do {
		System.out.print("\nTell me the number of numbers to do the operations: ");
		System.out.println("\n\u001B[31mOBS: division  and subtration suport only 2 numbers; \nIn addition, potential and suport only one number\u001B[0m");
		int quantifOFnumber = sc.nextInt();
		int [] tam = new int[quantifOFnumber];
		
		System.out.println("\nInform the operator: \n\"+\" \n\"-\" \n\"/\" \n\"*\" \n\"^\" \n\"(l):log\"");
		char oper = sc.next().charAt(0);
		
		double expo;
		double numbers [] = new double[tam.length];
			for(int i = 0; i<tam.length; i++) {
		System.out.println("Enter the "+(i+1)+"° number: ");
			numbers[i] = sc.nextInt();
			}
			switch(oper) {
				case '+' :
					System.out.println(user.sum(quantifOFnumber,numbers));
					break;
				
				case'-' :
					System.out.println(user.sub(quantifOFnumber, numbers));
					break;
				
				case'/' :
					System.out.println(user.div(numbers[0], numbers[1]));
					break;
					
				case'*' :
					System.out.println(user.multi(quantifOFnumber, numbers));
					break;
					
				case '^' : 
					System.out.println("Inform the exponent of the number: ");
					expo = sc.nextDouble();
					System.out.println(user.pont(numbers[0], expo ));
					break;
					
				case 'l' : 
					System.out.println("Inform the base of number: ");
					expo = sc.nextDouble();
					System.out.println(user.log(numbers[0], expo));
					break;
				
				default: 
					System.out.println("\u001B[31mERROR\u001B[0m");
					break;
			}
				System.out.println("\nRepit other operations? (1)yes or (2)no");
				cont =sc.nextInt();
				if(cont ==2) {
					System.out.println("\u001B[31m|==================|\u001B[0m");
					System.out.println("\u001B[31mFINISH THE PROGRAM\u001B[0m");
					System.out.println("\u001B[31m|==================|\u001B[0m");
					
				}
		}while(cont==1);
			}
}
