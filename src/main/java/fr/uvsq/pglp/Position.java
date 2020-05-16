package fr.uvsq.pglp;

public class Position {

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
    public Position() {
        x = 0;
        y = 0;
    }
    /**
     * Constructeur.

     */
    public Position(final int absc, final int ord) {
        this.x = absc;
        this.y = ord;
    }
    /**
     * Constructeur.

     */
    public Position(final String p) throws Exception {
        String position = p + "";
        if (position.startsWith("(") && position.endsWith(")")) {
            position = position.substring(1, position.length() - 1);
            String[] pos = position.split(",");
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
     * Clone la position.
     */
    public Position clone() {
        return new Position(this.x, this.y);
    }
}
