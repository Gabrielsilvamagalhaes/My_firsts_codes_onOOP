package PoligonoCalcs;

public interface Polygon {
    public void Area(int x, int y);

}

interface Polygon2 {
    public void Area2(int x, int y, int z);
}

interface Polygon3 {
    public void Area3(int x);
}

class Rectangule implements Polygon {
    public void Area(int x, int y) {
        System.out.println("The area of rectangule is: " + (x * y));

    }
}

class Square implements Polygon {
    public void Area(int x, int y) {
        System.out.println("The area of square is: " + Math.pow(x, 2));
    }

}

class Trapeze implements Polygon2 {
    public void Area2(int x, int y, int z) {
        double result = ((x + y) * z) / 2;
        System.out.println("The area of trapeze is: " + result);
    }

}

class Lozenge implements Polygon {
    public void Area(int x, int y) {
        System.out.println("The area of the lozenge is: " + ((x * y) / 2));

    }
}

class Triangule implements Polygon {
    public void Area(int x, int y) {
        System.out.println("The area of triangule is : " + (x * y) / 2);
    }
}

class Circle implements Polygon3 {
    public void Area3(int x) {
        double A = Math.PI * Math.pow(x, 2);
        System.out.println("The area of circle is: " + A);
    }
}
class Hexagon implements Polygon3 {
    public void Area3(int x){
        double A = 6*(Math.pow(x, 2)*Math.sqrt(3/4));
        System.out.println("The area of hexagon is: "+A);

    }
}