package Quadrante;
import java.util.Scanner;

public class ApiExercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise2 user = new Exercise2();
        double x, y;
        do{
        System.out.println("Inform the coordenate x: ");
         x = sc.nextDouble();
        
        System.out.println("Inform the coordenate y: ");
         y = sc.nextDouble();
        if(y==0 ||x==0){
            break;
        }
        user.setPoints(x, y);

        System.out.println(user.getPoints());
    }while(y!=0 || x!=0);
        sc.close();
    }

}
