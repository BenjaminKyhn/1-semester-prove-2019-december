package Quiz;

public class Svar implements Translatable {
    // Svaret variable
    private String svar = "";
    private int svarId;

    // Svarets constructor
    public Svar(int svarId){
        this.svarId = svarId;
    }

    // Svarets yderligere metoder
    public String getSvar() {
        return svar;
    }

    public void setSvar(String svar) {
        this.svar = svar;
    }

    /**Da svar er en klasse, som indeholder en string, vil jeg gerne kunne returnere dens String, når jeg bruger
    toString()-metoden. Derfor skal toString()-metoden overrides.*/
    @Override
    public String toString(){
        return svar;
    }

    // Oversættelsesmetode, der indtil videre kun udskriver, at oversættelsen endnu ikke er implementeret
    @Override
    public String translate(Language language) {
        if (language == Language.DANISH)
            return "Oversættelse ikke mulig endnu.";
        if (language == Language.ENGLISH)
            return "Translation is not available yet.";
        return null;
    }
}
