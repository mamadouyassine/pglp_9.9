package fr.uvsq.pglp.DaoJbc;
import fr.uvsq.pglp.FormeGraphique.Cercle;
import fr.uvsq.pglp.FormeGraphique.Rectangle;
import fr.uvsq.pglp.FormeGraphique.Square;
import fr.uvsq.pglp.FormeGraphique.Triangle;
import fr.uvsq.pglp.FormeGraphique.Groupe;

import java.sql.Connection;

public class FactoryDaoJDBC {

    /**
     * Connecteur.
     */
    private Connection connect;
    /**
     * Constructeur.
     * @param c Le connecteur
     */
    public FactoryDaoJDBC(final Connection c) {
        this.connect = c;
    }
    /**
     * Crée un CercleDao de type JDBC.
     * @return Le CercleDaoJDBC créé
     */
    public AbstractDao<Cercle> getCercleDao() {
        return new CercleDaoJDBC(connect);
    }
    /**
     * Crée un CarreDao de type JDBC.
     * @return Le CarreDaoJDBC créé
     */
    public AbstractDao<Square> getSquareDao() {
        return new SquareDaoJDBC(connect);
    }
    /**
     * Crée un RectangleDao de type JDBC.
     * @return Le RectangleDaoJDBC créé
     */
    public AbstractDao<Rectangle> getRectangleDao() {
        return new RectangleDaoJDBC(connect);
    }
    /**
     * Crée un TriangleDao de type JDBC.
     * @return Le TriangleDaoJDBC créé
     */
    public AbstractDao<Triangle> getTriangleDao() {
        return new TriangleDaoJDBC(connect);
    }
    /**
     * Crée un GroupeDao de type JDBC.
     * @return Le GroupeDaoJDBC créé
     */
    public AbstractDao<Groupe> getGroupeDao() {
        return new GroupeDaoJDBC(connect);
    }
}
