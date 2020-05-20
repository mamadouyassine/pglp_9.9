package fr.uvsq.pglp;
import static org.junit.Assert.*;

import fr.uvsq.pglp.FormeGraphique.Point;
import fr.uvsq.pglp.FormeGraphique.Square;
import org.junit.Test;

public class SquareTest {
    @Test
    public void testConstructeur() throws Exception {
        Point p1 = new Point(15,20);
        Square c = new Square("c1", p1, 10);
        assertTrue(c.getNom().equals("c1") && c.getCentre().getX() == p1.getX() && c.getCentre().getY() == p1.getY() && c.getLongueur() == 10);
    }

    @Test
    public void testSetter() throws Exception {
        Point p1 = new Point(15,20);
        Square c = new Square("c1", p1, 10);
        p1.setX(p1.getX() + 10);
        p1.setY(p1.getY() + 20);
        c.setCentre(p1);
        c.setLongueur(20);
        assertTrue(c.getNom().equals("c1") && c.getCentre().getX() == p1.getX() && c.getCentre().getY() == p1.getY() && c.getLongueur() == 20);
    }

    @Test
    public void testMove() throws Exception {
        Point p1 = new Point(15,20);
        Square c = new Square("c1", p1, 10);
        c.move(10, 20);
        p1.setX(p1.getX() + 10);
        p1.setY(p1.getY() + 20);
        assertTrue(c.getNom().equals("c1") && c.getCentre().getX() == p1.getX()
                && c.getCentre().getY() == p1.getY() && c.getLongueur() == 10);
    }

    @Test
    public void testDraw() throws Exception {
        Point p1 = new Point(15,20);
        Square c = new Square("c1", p1, 10);
        c.draw();
    }



}