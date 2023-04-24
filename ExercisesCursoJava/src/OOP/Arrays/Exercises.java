package OOP.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double sum =0;
        ArrayList<Integer> roubo = new ArrayList<>();
        ArrayList<String> roubo2 = new ArrayList<>();

        System.out.print("How many people? ");
        int Tam = sc.nextInt();
        sc.nextLine();

        String[] name = new String [Tam];
        int[] age = new int [Tam];
        double [] height = new double [Tam];
        
        for(int i =0; i<Tam; i++){
            System.out.println("Data of "+(i+1)+"° people");
            System.out.print("Name: ");
            name[i] =sc.nextLine();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            if(age[i]<16){
                roubo.add(age[i]);
                roubo2.add(name[i]);
            }
            System.out.print("Height: ");
            height[i] =sc.nextDouble();
            sc.nextLine();
        }
        for(double x : height){
            sum+=x;
        }
        double percent = roubo.size()*100/Tam;

        System.out.println("Average of height is: "+ (double) (sum/Tam));
        System.out.println("People under 16 years old "+ percent +"%");
        for(String tnc: roubo2){
            System.out.println(tnc);
        }
        sc.close();
    }
}
