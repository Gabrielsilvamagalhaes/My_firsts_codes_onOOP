package Bank;

import java.util.Scanner;

public class AccountView {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        BankOperations user2;
        double deposit;
        
        System.out.print("Enter account number: ");
        int number_of_account = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        
        System.out.print("Is there initial deposit (y/n):");
        char operation = sc.next().charAt(0);
    
        user2 = new BankOperations(name,number_of_account);
        //Caso o usuario nao queira fazer um deposito inicial
        if(operation!='y' && operation!='Y'){
            System.out.println("Account data: ");
            System.out.println(user2.toString());
            
            System.out.print("\nEnter a deposit value: ");
            deposit = sc.nextDouble();
            user2 = new BankOperations(name, number_of_account, deposit);
            System.out.println(user2.toString(1));

            System.out.print("\nEnter a withdraw value: ");
            deposit = sc.nextDouble();
            user2.Withdraw(deposit);
            System.out.println(user2.toString(1));
        //Caso queria realizar o deposito inicial
        }else{
            System.out.print("Enter initial deposit: ");
            deposit =sc.nextDouble();
            
            user2 = new BankOperations(name, number_of_account, deposit);
        
            System.out.println("\nAccount data:");
            System.out.println(user2.toString());

            System.out.print("\nEnter a deposit value: ");
            deposit = sc.nextDouble();
            user2.Deposit(deposit);
            System.out.println(user2.toString(1));

            System.out.print("\nEnter a withdraw value: ");
            deposit = sc.nextDouble();
            user2.Withdraw(deposit);
            System.out.println(user2.toString(1));
        
        
        }
        
        sc.close();        
    } 
}
    

