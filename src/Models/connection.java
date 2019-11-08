
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Your Name <Jose Javier Cueto Mejia>
 */
public class connection {
    private Connection con;

    public Connection getCon() {
        return con;
    }
    
    public void closeCon() throws SQLException{
        this.con.close();
    }
      
    public connection() {
        boolean flag1=connectToAccess();
    }
    
    public boolean connectToAccess() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               con = DriverManager.getConnection("jdbc:odbc:Pape");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"error en la conexio"+ex.getMessage());
            return false;
        }
        return true;
    }
}
