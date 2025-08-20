package iut.bad;

import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation {
    private String nom;
    private String prenom;
    private int age;
    private List<Humain> amis;

    public Humain() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
        this.amis = new ArrayList<>();
    }

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.amis = new ArrayList<>();
    }

    public void ami(Humain h) {
        ami(h, 100); // valeur par défaut 100
    }

    public void ami(Humain h, int duree) {
        if (!amis.contains(h)) {
            amis.add(h);
            System.out.println(this.nom + " est maintenant ami avec " + h.getNom() + " pour " + duree + " jours.");
        }
    }

    public void listerAmis() {
        System.out.print(this.nom + " a pour amis : ");
        for (Humain h : amis) {
            System.out.print(h.getNom() + " ");
        }
        System.out.println();
    }

    // ... reste de la classe (getters, setters, details, manger, boire, toString) inchangé
}
