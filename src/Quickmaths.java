import java.util.Scanner;

public class Quickmaths {
    //Klassen variable
    private int a;
    private int b;

    //Metode til at udregne genenmsnit af a og b
    int gennemsnit(int a, int b){
        return (a+b)/2;
    }

    //Metode til at summen af a og b
    int sum (int a, int b){
        return a+b;
    }

    //Metode til at starte lommeregneren, som fortsætter uendeligt
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

    //Metode til at starte programmet
    public static void main(String[] args) {
        //Laver et nyt Quickmathsobjekt ved navn lommeregner
        Quickmaths lommeregner = new Quickmaths();
        //Kalder lommeregnerens startmetode
        lommeregner.start();
    }
}
