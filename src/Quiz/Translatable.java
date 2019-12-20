package Quiz;

public interface Translatable {
    public String translate(Language language);
}

/**
 * Denne interface bruges i Sporgsmaal- og Svar-klasserne ved at skrive "implements Translatable".
 * I klassen får metoden en method body, som gør det muligt at kalde translatemetoden på klassen.
 * Metoden returnerer så en string på enten dansk eller engelsk.
 */

