import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person {

    // TODO Ret nedenstående datatyper
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

    // TODO Vis eksempler på typecasting
    @Override
    public String toString() {
        return "Navn: " + navn + "\nBy: " + by + "\nAlder: " + alder + "\nHøjde: " + hojde + "\nVægt: " + (int)vaegt;
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.navn = "Test Testesen";
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
        person.opdateretDato = new Date(555555555);
        System.out.println();

        System.out.println(person.opdateretDato);

        System.out.println(person.toString());
    }

}
