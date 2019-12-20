package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    /**
     * Main metode, der starter programmet
     */
    public static void main(String[] args) {
        /**Laver et sporgsmaalobjekt*/
        Sporgsmaal sporgsmaal = new Sporgsmaal();

        /**Laver et scannerobjekt*/
        Scanner input = new Scanner(System.in);

        /**Indtast spørgsmål*/
        System.out.println("Indtast spørgsmålet: ");
        while (true) {
            try {
                sporgsmaal.setSporgsmaal(input.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Spørgsmål må maks. være 100 tegn. Prøv igen: ");
            }
        }

        /**Indtast point*/
        System.out.println("Indtast 2-4 point: ");
        sporgsmaal.setPoint(input.nextDouble());

        /**Loop til at indtaste svarmuligheder*/
        ArrayList<Svar> svarMuligheder = new ArrayList<>();
        while (true) {
            System.out.println("Vil du indtaste en svarmulighed? (ja/nej): ");
            String inputStart = input.next();
            int svarId = 0;
            if (inputStart.equals("nej"))
                break;
            else {
                Svar svar = new Svar(svarId);
                System.out.println("Indtast svarmulighed: ");
                svar.setSvar(input.next());
                svarMuligheder.add(svar);
                svarId++;
            }
        }

        /**Tilføjer svarmulighederne til spørgsmålet*/
        sporgsmaal.setSvarMuligheder(svarMuligheder);

        /**Indtast indeks til det korrekte svar*/
        System.out.println("Hvilket af de indtastede spørgsmål er det korrekte? (angiv spørgsmålsnummer med en integer: ");
        sporgsmaal.setKorrektSvarIndex(input.nextInt() - 1);

        /**Afslut indtastningen*/
        System.out.println("Spørgsmålet er gemt.");
    }
}
