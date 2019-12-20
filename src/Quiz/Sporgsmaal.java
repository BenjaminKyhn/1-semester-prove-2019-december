package Quiz;

import java.util.ArrayList;

public class Sporgsmaal {
    private String sporgsmaal = "";
    private double point;
    private ArrayList<Svar> svarMuligheder;
    private int korrektSvarIndex;

    public String getSporgsmaal() {
        return sporgsmaal;
    }

    public void setSporgsmaal(String sporgsmaal) {
        if (sporgsmaal.length() > 10)
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
}
