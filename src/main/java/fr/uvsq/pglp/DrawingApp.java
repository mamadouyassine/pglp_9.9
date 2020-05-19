package fr.uvsq.pglp;
import fr.uvsq.pglp.Command.Command;
import fr.uvsq.pglp.Connection.GetConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;


public class DrawingApp
{

    private Scanner scanner;

    private DrawingTUI dt;

    public DrawingApp() {
        this.scanner = new Scanner(System.in);
        dt = new DrawingTUI();
    }

    public static void main(final String[] args) throws SQLException {
        Connection connect = GetConnection.createBase();
        GetConnection.deleteAllTables(connect);
        GetConnection.createAllTables(connect);
        connect.close();
        DrawingApp da = new DrawingApp();
        da.run();
    }
    /**
     * Execute le programme.
     */
    public void run() {
        System.out.println("Exemples de commandes enregistrés :\n"
                + "Creation : \n"
                + "c1 = Cercle((x, y), rayon)\n"
                + "c2 = Carre((x, y), cote)\n"
                + "r1 = Rectangle((x, y), longueur, largeur)\n"
                + "t1 = Triangle((x, y), (cote, cote), (cote, cote))\n"
                + "g1 = Groupe(c1, c2, r1, t1)\n"
                + "Déplacement : move(c1, (x, y))\n"
                + "Suppression : delete(r1, t1)\n"
                + "Quitter : exit\n\n"
                + "Entrer une commande :");
        String command = scanner.nextLine();
        Command c;
        while (!command.equals("exit")) {
            c = dt.nextCommand(command);
            if (c != null) {
                c.execute();
                dt.drawAllCommand();
            }
            System.out.println("\nEntrer une nouvelle commande :");
            command = scanner.nextLine();
        }
    }
}
