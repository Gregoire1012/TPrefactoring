package iut.bad;

public class Femme extends Humain {
    public Femme() {
        super();
    }

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public String toString() {
        return "Femme " + super.toString();
    }

    public static void main(String[] args) {
        Homme h = new Homme("Rakoto", "Jean", 25);
        Femme f = new Femme("Rabe", "Marie", 22);

        h.ami(f);
        f.ami(h);

        h.details();
        f.details();

        h.listerAmis();
        f.listerAmis();
    }
}
