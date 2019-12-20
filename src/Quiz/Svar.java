package Quiz;

public class Svar {
    private String svar = "";
    private int svarId;

    public Svar(int svarId){
        this.svarId = svarId;
    }

    public String getSvar() {
        return svar;
    }

    public void setSvar(String svar) {
        this.svar = svar;
    }

    @Override
    public String toString(){
        return svar;
    }
}
