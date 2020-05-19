package fr.uvsq.pglp.FormeGraphique;

public class Cercle extends Forme {


    private Point centre;

    private int rayon;

    public int getRayon() {
        return rayon;
    }

    public void setRayon(final int r) throws Exception {
        if (r >= 0) {
            this.rayon = r;
        } else {
            System.err.println("Rayon négatif");
            throw new Exception();
        }
    }

    public Point getCentre() {
        return centre.clone();
    }

    public void setCentre(final Point c) {
        this.centre = c.clone();
    }
    /**
     * Constructeur.
     * @param n Le nom
     * @param p La position initiale
     * @param r Le rayon
     * @throws Exception Rayon negatif
     */
    public Cercle(final String n, final Point p, final int r)
            throws Exception {
        setNom(n);
        this.centre = p.clone();
        setRayon(r);
    }
    /**
     * Fonction de déplacement.
     * @param x Ajout en abscisse par rapport a la position initiale
     * @param y Ajout en ordonnée par rapport a la position initiale
     */
    @Override
    public void move(final int x, final int y) {
        centre.move(x, y);
    }
    /**
     * Fonction d'affichage.
     */
    @Override
    public void draw() {
        System.out.println("Cercle(centre=(" + centre.getX()
                + "," + centre.getY() + "),rayon=" + rayon + ")");
    }
}
