package View;

import java.sql.SQLException;

public class dbFret {
    public class BDDSCOL {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) throws SQLException {
            Controleur ctl1 = new Controleur();
            ctl1.traiterRequete();
        }
        }
