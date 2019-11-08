
package Views;

import Class.main;
import Models.connection;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Your Name <Jose Javier Cueto Mejia>
 */
public class advancedSearch extends javax.swing.JDialog {
    
    private final DefaultTableModel model;
    private String code="";
    private final  String idClass;
    private TableRowSorter trsFiltro;

    //important method to know which product was selected
    public String getCode() {
        return code.trim();
    }

    //constructor
    public advancedSearch(java.awt.Frame parent, boolean modal, String idClass) {
        super(parent, modal);
        initComponents();
        rCode.setBackground(main.MainColor);
        rName.setBackground(main.MainColor);
        jPanel1.setBackground(main.SecondColor);
        this.model = (DefaultTableModel) TSearchPro.getModel();
        this.idClass=idClass;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TSearchPro = new javax.swing.JTable();
        tagResults = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        rCode = new javax.swing.JRadioButton();
        rName = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        TSearchPro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TSearchPro.setForeground(new java.awt.Color(51, 51, 51));
        TSearchPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Código de barra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TSearchPro.setGridColor(new java.awt.Color(255, 255, 255));
        TSearchPro.setIntercellSpacing(new java.awt.Dimension(10, 1));
        TSearchPro.setRowHeight(25);
        TSearchPro.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TSearchPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TSearchProMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TSearchPro);
        if (TSearchPro.getColumnModel().getColumnCount() > 0) {
            TSearchPro.getColumnModel().getColumn(0).setMinWidth(100);
            TSearchPro.getColumnModel().getColumn(0).setMaxWidth(100);
            TSearchPro.getColumnModel().getColumn(2).setMinWidth(150);
            TSearchPro.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 760, 320));

        tagResults.setBackground(new java.awt.Color(255, 255, 255));
        tagResults.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tagResults.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tagResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 450, 30));

        search.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        search.setMargin(new java.awt.Insets(2, 6, 2, 2));
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 450, 40));

        rCode.setBackground(new java.awt.Color(51, 0, 51));
        buttonGroup1.add(rCode);
        rCode.setForeground(new java.awt.Color(255, 255, 255));
        rCode.setText("Código");
        rCode.setFocusPainted(false);
        rCode.setFocusable(false);
        jPanel1.add(rCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        rName.setBackground(new java.awt.Color(51, 0, 51));
        buttonGroup1.add(rName);
        rName.setForeground(new java.awt.Color(255, 255, 255));
        rName.setSelected(true);
        rName.setText("Nombre");
        rName.setFocusPainted(false);
        rName.setFocusable(false);
        jPanel1.add(rName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setMaximumSize(new java.awt.Dimension(0, 0));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(0, 0));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(0, 0));

        jMenu1.setText("jMenu1");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //this event is called when a product selected in the table
    private void TSearchProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TSearchProMouseClicked
        int i=TSearchPro.getSelectedRow();
        code=(String) TSearchPro.getValueAt(i, 0);
        code=code.trim();
        this.dispose();
    }//GEN-LAST:event_TSearchProMouseClicked

    
    //this method is the firts called when the program starts
    public void queryFindProducts(){
        String sql;       
        try{
            sql="select CCODIGOP01,CNOMBREP01,CCODALTERN from MGW10005 where CIDVALOR02="+idClass+"";
            connection c=new connection();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            while(rs.next()) {
                Object dato[]={rs.getObject("CCODIGOP01").toString().trim(),rs.getObject("CNOMBREP01")
                        ,rs.getObject("CCODALTERN")};
                model.addRow(dato);
                cont++;
            }
            if(cont==0){
                tagResults.setText("No se encontró ningún producto");
            }else{
                tagResults.setText("Se encontraron "+cont+" resultado(s)");
            }
        c.closeCon();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error Carlos\n"+e.getMessage()+"\n"+e.getSQLState());
            System.out.println(e.getMessage());
        }
    }

    
    //method to close the windows with ESC key
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //this method is for the type of search maybe by code or just name
    public void filter(){
        int fill;
        if(rCode.isSelected()){
            fill=0;
        }else{
            fill=1;
        }            
        trsFiltro.setRowFilter(RowFilter.regexFilter(search.getText().toUpperCase(), fill));        
    }
 
    //this method is created to find the product in the table
    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        search.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (search.getText());
                search.setText(cadena);
                repaint();
                filter();
            }
        });
        trsFiltro = new TableRowSorter(TSearchPro.getModel());
        TSearchPro.setRowSorter(trsFiltro);
    }//GEN-LAST:event_searchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TSearchPro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rCode;
    private javax.swing.JRadioButton rName;
    private javax.swing.JTextField search;
    private javax.swing.JLabel tagResults;
    // End of variables declaration//GEN-END:variables
}
