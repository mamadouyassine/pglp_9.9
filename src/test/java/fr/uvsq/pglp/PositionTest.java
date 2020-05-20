package fr.uvsq.pglp;
import static org.junit.Assert.*;

import fr.uvsq.pglp.FormeGraphique.Point;
import org.junit.Test;

public class PositionTest {

    @Test
    public void testConstructeurDefaut() {
        Point p = new Point();
        assertTrue(p.getX() == 0 && p.getY() == 0);
    }

    @Test
    public void testConstructeur() {
        Point p = new Point(10,20);
        assertTrue(p.getX() == 10 && p.getY() == 20);
    }

    @Test
    public void testConstructeur2() throws Exception {
        Point p = new Point("(10,20)");
        assertTrue(p.getX() == 10 && p.getY() == 20);
    }

    @Test (expected = Exception.class)
    public void testConstructeurException() throws Exception {
        @SuppressWarnings("unused")
        Point p = new Point("10,20");
    }

    @Test (expected = Exception.class)
    public void testConstructeurException2() throws Exception {
        @SuppressWarnings("unused")
        Point p = new Point("(10,vingt)");
    }

    @Test (expected = Exception.class)
    public void testConstructeurException3() throws Exception {
        @SuppressWarnings("unused")
        Point p = new Point("(10,)");
    }

    @Test
    public void testSetter() {
        Point p = new Point(10,20);
        p.setX(30);
        p.setY(30);
        assertTrue(p.getX() == 30 && p.getY() == 30);
    }

    @Test
    public void testMove() {
        Point p = new Point(10,20);
        p.move(20,10);
        assertTrue(p.getX() == 30 && p.getY() == 30);
    }

}