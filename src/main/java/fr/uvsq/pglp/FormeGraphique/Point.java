package fr.uvsq.pglp.FormeGraphique;

public class Point {

    /**
     Abscisse.
     */
    private int x;
    /**
     Ordonnée.
     */
    private int y;
    /**
     * Getter de x.
     */
    public int getX() {
        return x;
    }
    /**
     * Getter de y.
     */
    public int getY() {
        return y;
    }
    /**
     * Setter de x.

     */
    public void setX(final int a) {
        this.x = a;
    }
    /**
     * Setter de y.
     */
    public void setY(final int a) {
        this.y = a;
    }
    /**
     * Constructeur par défaut.
     */
    public Point() {
        x = 0;
        y = 0;
    }
    /**
     * Constructeur.

     */
    public Point(final int absc, final int ord) {
        this.x = absc;
        this.y = ord;
    }
    /**
     * Constructeur.

     */
    public Point(final String p) throws Exception {
        String point = p + "";
        if (point.startsWith("(") && point.endsWith(")")) {
            point = point.substring(1, point.length() - 1);
            String[] pos = point.split(",");
            if (pos.length == 2) {
                this.x = Integer.parseInt(pos[0]);
                this.y = Integer.parseInt(pos[1]);
            } else {
                System.err.println("Position invalide");
                throw new Exception();
            }
        } else {
            System.err.println("Position invalide");
            throw new Exception();
        }
    }
    /**
     * Fonction de déplacement d'une position.

     */
    public void move(final int abs, final int ord) {
        this.x += abs;
        this.y += ord;
    }
    /**
     *changer position la position.
     */
    public Point clone() {
        return new Point(this.x, this.y);
    }
}
