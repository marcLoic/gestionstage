
import java.util.*;

public class DemandeDeStage {

    public DemandeDeStage() {
    }

    private int Id;
    private String entrepriseDaccueil;
    private String sujetProposé;
    private String résultatsAttendus;
    private String expositionsEleve;
    private String lieuDeStage;
    private int gratification;
    private String avantagesEleves;
    private String statutDeLaDemande;

    public int get() {
        return this.Id;
    }

    public void set(int ID) {
        this.ID = ID;
    }
}