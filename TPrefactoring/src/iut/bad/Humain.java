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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }

    public void details() {
        System.out.println(toString());
    }

    @Override
    public void manger() {
        System.out.println(getNom() + " est en train de manger.");
    }

    @Override
    public void boire() {
        System.out.println(getNom() + " est en train de boire.");
    }

    public void ami(Humain h) {
        if (!amis.contains(h)) {
            amis.add(h);
            System.out.println(this.nom + " est maintenant ami avec " + h.getNom());
        }
    }

    public void listerAmis() {
        System.out.print(this.nom + " a pour amis : ");
        for (Humain h : amis) {
            System.out.print(h.getNom() + " ");
        }
        System.out.println();
    }
}
