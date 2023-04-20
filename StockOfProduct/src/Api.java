import java.util.Scanner;

public class Api {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int i =0;
        do{

            System.out.println("Enter product data ");
            
            System.out.print("Name: ");
            String Name = sc.nextLine();
            
            System.out.print("Price: ");
            double Price = sc.nextDouble();
            
            System.out.print("Quantity in stock: ");
            int Quantity = sc.nextInt();
            
            Product user = new Product(Name, Price, Quantity);
            System.out.println("Product data : "+ Name + ", " + "$"+Price+ ", "+ Quantity+ " units, Total: $"+ user.TotalValueInStock());
            
            System.out.print("Enter the number of products to be added in stock: ");
            user.AddProducts(Quantity= sc.nextInt());
            
            System.out.print("Enter the number of products to be removed from stock: ");
            
            user.RemoveProducts(Quantity=sc.nextInt());
            
            System.out.println("Repeat the program? (1)yes or (2)not");
            i = sc.nextInt();
            sc.nextLine();
        }while(i==1);
        if(i!=1){
            System.out.println("Finish the operation!");
        }
            sc.close();
    }
    
}
