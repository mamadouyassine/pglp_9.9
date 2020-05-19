package fr.uvsq.pglp.FormeGraphique;

public class Rectangle extends Forme {

    private Point centre;

    private int longueur;

    private int hauteur;

    public Point getCentre() {
        return centre.clone();
    }

    public void setCentre(final Point c) {
        this.centre = c.clone();
    }
    /**
     * Getter de la longueur.
     * @return La longueur
     */
    public int getLongueur() {
        return longueur;
    }
    /**
     * Setter de la longueur.
     * @param l La nouvelle longueur
     * @throws Exception Longueur négative
     */
    public void setLongueur(final int l) throws Exception {
        if (l >= 0) {
            this.longueur = l;
        } else {
            System.err.println("Longueur négative");
            throw new Exception();
        }
    }
    /**
     * Getter de la hauteur.
     * @return La hauteur
     */
    public int getHauteur() {
        return hauteur;
    }
    /**
     * Setter de la hauteur.
     * @param h La nouvelle hauteur
     * @throws Exception Hauteur négative
     */
    public void setHauteur(final int h) throws Exception {
        if (h >= 0) {
            this.hauteur = h;
        } else {
            System.err.println("Hauteur négative");
            throw new Exception();
        }
    }
    /**
     * Constructeur.
     * @param n Le nom
     * @param p La position initiale
     * @param l La longueur initiale
     * @param h La hauteur initiale
     * @throws Exception Arguments négatifs
     */
    public Rectangle(final String n, final Point p, final int l,
                     final int h) throws Exception {
        setNom(n);
        this.centre = p.clone();
        setLongueur(l);
        setHauteur(h);
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
        System.out.println("Rectangle(centre=(" + centre.getX()
                + "," + centre.getY() + "),longueur=" + longueur
                + ",hauteur=" + hauteur + ")");
    }

}
