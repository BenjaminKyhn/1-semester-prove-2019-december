package Quiz;

public class Svar implements Translatable {
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

    @Override
    public String translate(Language language) {
        if (language == Language.DANISH)
            return "Oversættelse ikke mulig endnu.";
        if (language == Language.ENGLISH)
            return "Translation is not available yet.";
        return null;
    }
}
