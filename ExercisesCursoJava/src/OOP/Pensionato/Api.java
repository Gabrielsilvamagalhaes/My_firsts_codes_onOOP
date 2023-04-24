package OOP.Pensionato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Room;
        String Name = new String();
        String Email = new String();
        SistemaDeAluguel user;
        SistemaDeAluguel[] user2 = new SistemaDeAluguel[10];
        ArrayList<SistemaDeAluguel> users = new ArrayList<>(Arrays.asList(user2));

        System.out.println("How many rooms will rented? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Name:");
            Name = sc.nextLine();

            System.out.print("Email: ");
            Email = sc.nextLine();

            System.out.print("Room: ");
            Room = sc.nextInt();

            user = new SistemaDeAluguel(Name, Email, Room);
            users.add(Room, user);

        }
        users.removeIf(j -> j == null);
        System.out.println("\nBusy rooms: ");
        for (SistemaDeAluguel k : users) {
            System.out.println(k);
        }

        sc.close();

    }

}
