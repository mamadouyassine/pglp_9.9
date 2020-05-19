package fr.uvsq.pglp.FormeGraphique;

public class Triangle extends Forme {
    /**
     * Sommet 1.
     */
    private Point haut;
    /**
     * Sommet 2.
     */
    private Point gauche;
    /**
     * Sommet 3.
     */
    private Point droite;
    /**
     * Getter du sommet 1.
     * @return La position du sommet 1
     */
    public Point getHaut() {
        return haut.clone();
    }
    /**
     * Setter du sommet 1.
     * @param h La nouvelle position
     */
    public void setHaut(final Point h) {
        this.haut = h.clone();
    }
    /**
     * Getter du sommet 2.
     * @return La position du sommet 2
     */
    public Point getGauche() {
        return gauche.clone();
    }
    /**
     * Setter du sommet 2.
     * @param g La nouvelle position
     */
    public void setGauche(final Point g) {
        this.gauche = g.clone();
    }
    /**
     * Getter du sommet 3.
     * @return La position du sommet 3
     */
    public Point getDroite() {
        return droite.clone();
    }
    /**
     * Setter du sommet 3.
     * @param d La nouvelle position
     */
    public void setDroite(final Point d) {
        this.droite = d.clone();
    }
    /**
     * Constructeur.
     * @param n Le nom
     * @param p1 La position du sommet 1
     * @param p2 La position du sommet 2
     * @param p3 La position du sommet 3
     */
    public Triangle(final String n, final Point p1,
                    final Point p2, final Point p3) {
        setNom(n);
        this.haut = p1.clone();
        this.gauche = p2.clone();
        this.droite = p3.clone();
    }
    /**
     * Fonction de déplacement.
     * @param x Ajout en abscisse par rapport a la position initiale
     * @param y Ajout en ordonnée par rapport a la position initiale
     */
    @Override
    public void move(final int x, final int y) {
        haut.move(x, y);
        gauche.move(x, y);
        droite.move(x, y);
    }
    /**
     * Fonction d'affichage.
     */
    @Override
    public void draw() {
        System.out.println("Triangle(sommet1=(" + haut.getX()
                + "," + haut.getY() + "),sommet2=(" + gauche.getX()
                + "," + gauche.getY() + "),sommet3=(" + droite.getX()
                + "," + droite.getY() + "))");
    }
}
