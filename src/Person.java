import java.util.ArrayList;
import java.util.Date;

public class Person {

    //Personklassens variable
    String navn; // Test Testesen
    byte alder; // 18
    String by; // Næstved
    short postNummer; // 4700
    String vej; // Femøvej
    String husnummer; // 3B
    String nationalitet; // Dansk
    String[] fritidsStringeresser; // Snitning, LOL, strikke
    ArrayList<String> smarthomeDevices; // Xbox, 3 Smartlamper, Køleskab m.m.
    double hojde; // 1.56 m
    double vaegt;  // 76 kg
    double karaktergennemsnit; // 5.33
    byte[] eksamensKarakterer; // 7, 12, -3, 4, 2, 10
    Date opdateretDato; // Sun Jan 08 00:00:00 CET 1978

    //toString-metoden overrides til at udskrive navn, by, alder, højde og vægt (double typecastet til integer)
    @Override
    public String toString() {
        return "Navn: " + navn + "\nBy: " + by + "\nAlder: " + alder + "\nHøjde: " + hojde + "\nVægt: " + (int)vaegt;
    }

    //Main metode starter programmet
    public static void main(String[] args) {
        //Lavet et nyt personobjekt
        Person person = new Person();

        //Sætter variable for personen
        person.navn = "Test Testesen";
        person.alder = 18;
        person.by = "Næstved";
        person.postNummer = 4700;
        person.vej = "Fenøvej";
        person.husnummer = "3B";
        person.nationalitet = "dansk";
        person.fritidsStringeresser = new String[3];
        person.fritidsStringeresser[0] = "snitning";
        person.fritidsStringeresser[1] = "LoL";
        person.fritidsStringeresser[2] = "strikke";
        person.smarthomeDevices = new ArrayList<>();
        person.smarthomeDevices.add("Xbox");
        person.smarthomeDevices.add("3 Smartlamper");
        person.smarthomeDevices.add("Køleskab");
        person.hojde = 1.56;
        person.vaegt = 76;
        person.karaktergennemsnit = 5.33;
        person.eksamensKarakterer = new byte[6];
        person.eksamensKarakterer[0] = 7;
        person.eksamensKarakterer[1] = 12;
        person.eksamensKarakterer[2] = -3;
        person.eksamensKarakterer[3] = 4;
        person.eksamensKarakterer[4] = 2;
        person.eksamensKarakterer[5] = 10;
        person.opdateretDato = new Date(78, 0, 8, 0, 0, 0);

        System.out.println();

        //Kalder personens toString-metode og udskriver den i konsollen
        System.out.println(person.toString());
    }

}
