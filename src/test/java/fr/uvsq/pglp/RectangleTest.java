package fr.uvsq.pglp;
import static org.junit.Assert.*;

import fr.uvsq.pglp.FormeGraphique.Point;
import fr.uvsq.pglp.FormeGraphique.Rectangle;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testConstructeur() throws Exception {
        Point p1 = new Point(15,20);
        Rectangle r = new Rectangle("r1", p1, 10, 5);
        assertTrue(r.getNom().equals("r1") && r.getCentre().getX() == p1.getX()
                && r.getCentre().getY() == p1.getY() && r.getLongueur() == 10
                && r.getHauteur() == 5);
    }

    @Test
    public void testSetter() throws Exception {
        Point p1 = new Point(15,20);
        Rectangle r = new Rectangle("r1", p1, 10, 5);
        p1.setX(p1.getX() + 10);
        p1.setY(p1.getY() + 20);
        r.setCentre(p1);
        r.setLongueur(15);
        r.setHauteur(10);
        assertTrue(r.getNom().equals("r1") && r.getCentre().getX() == p1.getX()
                && r.getCentre().getY() == p1.getY() && r.getLongueur() == 15
                && r.getHauteur() == 10);
    }

    @Test
    public void testMove() throws Exception {
        Point p1 = new Point(15,20);
        Rectangle r = new Rectangle("r1", p1, 10, 5);
        r.move(10, 20);
        p1.setX(p1.getX() + 10);
        p1.setY(p1.getY() + 20);
        assertTrue(r.getNom().equals("r1") && r.getCentre().getX() == p1.getX()
                && r.getCentre().getY() == p1.getY() && r.getLongueur() == 10
                && r.getHauteur() == 5);
    }

    @Test
    public void testDraw() throws Exception {
        Point p1 = new Point(15,20);
        Rectangle r = new Rectangle("r1", p1, 10, 5);
        r.draw();
    }

}