package nodes;

public class AdresseQuad extends Node{

    private int adresse;

    public AdresseQuad(int adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "@" + adresse;
    }

    public void decrementAdresse() {
        adresse--;
    }
}