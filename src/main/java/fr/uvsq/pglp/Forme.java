package fr.uvsq.pglp;

public  abstract class Forme {

private String nom;

public String getNom() {
        return nom;
        }

public void setNom(final String n) {
        this.nom = n;
        }

public abstract void move(int x, int y);

public abstract void draw();

}
