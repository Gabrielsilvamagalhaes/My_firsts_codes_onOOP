import java.util.Scanner;

public class Api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangule r = new Rectangule();
        Square q = new Square();
        Trapeze t = new Trapeze();
        Lozenge l = new Lozenge();
        Triangule t2 = new Triangule();
        Circle c = new Circle();
        Hexagon h = new Hexagon();
        int cont =0;

        do{
        System.out.print("Inform the polygon of the calculate of area: ");
        String polygon = sc.nextLine();
        String promt = polygon.toLowerCase();

        switch (promt) {
            case "rectangule":
                System.out.print("Inform the lenght: ");
                int L = sc.nextInt();
                System.out.print("Inform the breadth: ");
                int B = sc.nextInt();
                r.Area(L, B);
                break;

            case "square":
                System.out.print("Inform the side of square: ");
                int L1 = sc.nextInt();
                q.Area(L1, 1);
                break;

            case "trapeze":
                System.out.print("Inform the biggest base: ");
                int Base = sc.nextInt();
                System.out.print("Inform the smallest base: ");
                int base = sc.nextInt();
                System.out.print("Inform the height of trapeze: ");
                int height = sc.nextInt();
                t.Area2(Base, base, height);
                break;

            case "lozenge":
                System.out.print("Inform the biggest diagonal: ");
                int Diagonal = sc.nextInt();
                System.out.print("Inform the smallest diagonal: ");
                int diagonal = sc.nextInt();
                l.Area(Diagonal, diagonal);
                break;

            case "triangule":
                System.out.print("Inform the base: ");
                int baset = sc.nextInt();
                System.out.print("Inform the height: ");
                int heightt = sc.nextInt();
                t2.Area(baset, heightt);
                break;

            case "circle":
                System.out.print("Inform the ray: ");
                int ray = sc.nextInt();
                c.Area3(ray);
                break;

            case "hexagon":
                System.out.print("Inform the side: ");
                int side = sc.nextInt();
                h.Area3(side);
                break;
            default:
                System.out.println("Inform the correct polygon");
        }
        System.out.println("Repit the program? (1)yes or (2)not");
        cont = sc.nextInt();
        sc.nextLine();
        if(cont == 2){
            System.out.println("Finish the program ");
        }
    }while(cont==1);
        sc.close();
    }
}
