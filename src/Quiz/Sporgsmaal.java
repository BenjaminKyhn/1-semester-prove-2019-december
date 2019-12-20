package Quiz;

import java.util.ArrayList;

public class Sporgsmaal implements Translatable {
    /**Spørgsmålets variable*/
    private int id;
    private String sporgsmaal = "";
    private double point;
    private ArrayList<Svar> svarMuligheder;
    private int korrektSvarIndex;

    public Sporgsmaal(){}

    public Sporgsmaal(String sporgsmaal){
        this.sporgsmaal = sporgsmaal;
    }

    public Sporgsmaal(int id, String sporgsmaal, double point, int korrektSvarIndex){
        this.id = id;
        this.sporgsmaal = sporgsmaal;
        this.point = point;
        this.korrektSvarIndex = korrektSvarIndex;
    }

    /**Spørgsmålets metoder*/
    public String getSporgsmaal() {
        return sporgsmaal;
    }

    /**Giver en fejl, hvis brugeren forsøger at indtaste et spørgsmål, der er over 100 tegn*/
    public void setSporgsmaal(String sporgsmaal) {
        if (sporgsmaal.length() > 100)
            throw new IllegalArgumentException("Spørgsmål må maks. være 100 tegn.");
        this.sporgsmaal = sporgsmaal;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public ArrayList<Svar> getSvarMuligheder() {
        return svarMuligheder;
    }

    public void setSvarMuligheder(ArrayList<Svar> svarMuligheder) {
        this.svarMuligheder = svarMuligheder;
    }

    public int getKorrektSvarIndex() {
        return korrektSvarIndex;
    }

    public void setKorrektSvarIndex(int korrektSvarIndex) {
        this.korrektSvarIndex = korrektSvarIndex;
    }

    /**Oversættelsesmetode, der indtil videre kun udskriver, at oversættelsen endnu ikke er implementeret*/
    @Override
    public String translate(Language language) {
        if (language == Language.DANISH)
            return "Oversættelse ikke mulig endnu.";
        if (language == Language.ENGLISH)
            return "Translation is not available yet.";
        return null;
    }
}
