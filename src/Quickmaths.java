import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths {

    private int a;
    private int b;

    int gennemsnit(int a, int b){
        return (a+b)/2;
    }

    int sum (int a, int b){
        return a+b;
    }

    public void start(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Indtast A: ");
            a = input.nextInt();
            System.out.println("Indtast B: ");
            b = input.nextInt();
            System.out.println("Sum: " + sum(a,b));
            System.out.println("Gennemsnit: " + gennemsnit(a,b));
        }
    }

    public static void main(String[] args) {
        Quickmaths lommeregner = new Quickmaths();
        lommeregner.start();
    }
}
