/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {

    public static void main(String[] args) {
        //Udskriver Hello World!
        System.out.println("Hello World!");

    }

    //Metode, der udskriver Hello "Navn"!, eller Hello World!, hvis der ikke gives et navn som parameter
    public static String hello(String navn) {
        if (navn.equals(""))
            return "Hello World!";
        return "Hello " + navn + "!";
    }

}
