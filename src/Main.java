import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Area area = new Area();
        System.out.println("length a:");
        area.a = input.nextInt();
        System.out.println("length b:");
        area.b = input.nextInt();
        System.out.println("length c:");
        area.c = input.nextInt();

        System.out.println("area of triangle: "+area.getArea());



    }
}