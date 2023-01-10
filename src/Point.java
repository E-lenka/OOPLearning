import java.util.Scanner;

public class Point {
    //точка на оси координат
    private double x, y; // данные доступны только внутри класса
    // public - доступ откуда угодно, в том числе вне класса.
    void move (double dx, double dy){
        // перемещение точки
        x += dx;
        y += dy;
    }
    void input (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = in.nextDouble();
        System.out.println("Enter y: ");
        double y = in.nextDouble();
        move(x, y);
    }
    double getDistance(Point a){
        // расстояние между двумя точками
        return  Math.sqrt(Math.pow(x-a.x, 2)+ Math.pow(y-a.y, 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
