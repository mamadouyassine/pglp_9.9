package fr.uvsq.pglp;
import static org.junit.Assert.*;

import fr.uvsq.pglp.FormeGraphique.Point;
import fr.uvsq.pglp.FormeGraphique.Triangle;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testConstructeur() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(10,10);
        Point p3 = new Point(20,0);
        Triangle t = new Triangle("t1", p1, p2, p3);
        assertTrue(t.getNom().equals("t1") && t.getHaut().getX() == p1.getX()
                && t.getHaut().getY() == p1.getY() && t.getGauche().getX() == p2.getX()
                && t.getGauche().getY() == p2.getY() && t.getDroite().getX() == p3.getX()
                && t.getDroite().getY() == p3.getY());
    }

    @Test
    public void testSetter() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(10,10);
        Point p3 = new Point(20,0);
        Triangle t = new Triangle("t1", p1, p2, p3);
        p1.setX(p1.getX() + 10);
        p1.setY(p1.getY() + 20);
        t.setHaut(p1);
        p2.setX(p2.getX() + 10);
        p2.setY(p2.getY() + 20);
        t.setGauche(p2);
        p3.setX(p3.getX() + 10);
        p3.setY(p3.getY() + 20);
        t.setDroite(p3);
        assertTrue(t.getNom().equals("t1") && t.getHaut().getX() == p1.getX()
                && t.getHaut().getY() == p1.getY() && t.getGauche().getX() == p2.getX()
                && t.getGauche().getY() == p2.getY() && t.getDroite().getX() == p3.getX()
                && t.getDroite().getY() == p3.getY());
    }

    @Test
    public void testMove() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(10,10);
        Point p3 = new Point(20,0);
        Triangle t = new Triangle("t1", p1, p2, p3);
        t.move(10, 20);
        p1.setX(p1.getX() + 10);
        p1.setY(p1.getY() + 20);
        p2.setX(p2.getX() + 10);
        p2.setY(p2.getY() + 20);
        p3.setX(p3.getX() + 10);
        p3.setY(p3.getY() + 20);
        assertTrue(t.getNom().equals("t1") && t.getHaut().getX() == p1.getX()
                && t.getHaut().getY() == p1.getY() && t.getGauche().getX() == p2.getX()
                && t.getGauche().getY() == p2.getY() && t.getDroite().getX() == p3.getX()
                && t.getDroite().getY() == p3.getY());
    }

    @Test
    public void testDraw() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(10,10);
        Point p3 = new Point(20,0);
        Triangle t = new Triangle("t1", p1, p2, p3);
        t.draw();
    }

}