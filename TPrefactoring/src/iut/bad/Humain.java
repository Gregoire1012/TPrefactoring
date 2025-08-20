package iut.bad;

public class Humain implements Consommation {
    private String nom;
    private String prenom;
    private int age;

    public Humain() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
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
}
