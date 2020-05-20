package fr.uvsq.pglp;
import static org.junit.Assert.assertTrue;

import fr.uvsq.pglp.FormeGraphique.Cercle;
import fr.uvsq.pglp.FormeGraphique.Point;
import org.junit.Test;

public class CercleTest {
    @Test
    public void testConstructeur() throws Exception {
        Point p1 = new Point(15,20);
        Cercle c = new Cercle("c1", p1, 10);
        assertTrue(c.getNom().equals("c1") && c.getCentre().getX() == p1.getX()
                && c.getCentre().getY() == p1.getY() && c.getRayon() == 10);
    }

    @Test
    public void testSetter() throws Exception {
        Point p1 = new Point(15,20);
        Cercle c = new Cercle("c1", p1, 10);
        p1.setX(p1.getX() + 10);
        p1.setY(p1.getY() + 20);
        c.setCentre(p1);
        c.setRayon(20);
        assertTrue(c.getNom().equals("c1") && c.getCentre().getX() == p1.getX()
                && c.getCentre().getY() == p1.getY() && c.getRayon() == 20);
    }

    @Test
    public void testMove() {
        Point p1 = new Point(15,20);
        Cercle c = null;
        try {
            c = new Cercle("c1", p1, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        c.move(10, 20);
        p1.setX(p1.getX() + 10);
        p1.setY(p1.getY() + 20);
        assertTrue(c.getNom().equals("c1") && c.getCentre().getX() == p1.getX()
                && c.getCentre().getY() == p1.getY() && c.getRayon() == 10);
    }

    @Test
    public void testDraw() throws Exception {
        Point p1 = new Point(15,20);
        Cercle c = new Cercle("c1", p1, 10);
        c.draw();
    }

}