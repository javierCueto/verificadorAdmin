
package Models;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Your Name <Jose Javier Cueto Mejia>
 */
public class queriesModel {
    private List<providersModel> providers=new ArrayList();


    public List<providersModel> getProviders() {
        return providers;
    }

    
    public void queryProviders(){
    
            String sql;       
            try{
                sql="select CIDVALOR01,CVALORCL01  from MGW10020 order by CVALORCL01 asc where cidclasi01=26 ";
                connection c=new connection();
                c.getCon();
                Statement stmt = c.getCon().createStatement();
                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                int cont=0;
                while(rs.next()) {
                    providersModel p=new providersModel();
                    p.setId(rs.getInt("CIDVALOR01"));
                    p.setName(rs.getString("CVALORCL01"));
                    providers.add(p);
                    cont++;
                }
            c.closeCon();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error carlos\n"+e.getMessage()+"\n"+e.getSQLState());
                System.out.println(e.getMessage());
            }
    }
    
    
}
