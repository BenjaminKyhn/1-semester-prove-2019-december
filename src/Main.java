public class Main {

    public static void main(String[] args) {
        //Udskriver Hello World!
        System.out.println("Hello World!");

    }

    /**
     * @param navn skriv det navn, som du vil sige hello til
     * @return returnerer Hello "navn"!
     */
    //Metode, der udskriver Hello "Navn"!, eller Hello World!, hvis der ikke gives et navn som parameter
    public static String hello(String navn) {
        if (navn.equals(""))
            return "Hello World!";
        return "Hello " + navn + "!";
    }

}
