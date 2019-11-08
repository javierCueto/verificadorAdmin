
package Views;

import Class.main;
import Models.providersModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Your Name <Jose Javier Cueto Mejia>
 */
public class searchByProviders extends javax.swing.JDialog {
    private final DefaultTableModel model;
    private String idProduct="";
    private List<providersModel> providers=new ArrayList();
    private TableRowSorter trsFiltro;

    
    
    //gets and setters
    public List<providersModel> getProviders() {
        return providers;
    }

    public void setProviders(List<providersModel> providers) {
        this.providers = providers;
    }
     
     
    public String getIdProduct() {
        return idProduct;
    }
    
    //constructor
    public searchByProviders(java.awt.Frame parent, boolean modal, List providers) {
        super(parent, modal);
        initComponents();
        jPanel1.setBackground(main.SecondColor);
        this.model = (DefaultTableModel) TSearchProv.getModel();
        this.providers = providers;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TSearchProv = new javax.swing.JTable();
        tagResults = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        TSearchProv.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TSearchProv.setForeground(new java.awt.Color(51, 51, 51));
        TSearchProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TSearchProv.setGridColor(new java.awt.Color(255, 255, 255));
        TSearchProv.setIntercellSpacing(new java.awt.Dimension(10, 1));
        TSearchProv.setRowHeight(25);
        TSearchProv.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TSearchProv.setSelectionForeground(new java.awt.Color(102, 102, 102));
        TSearchProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TSearchProvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TSearchProv);
        if (TSearchProv.getColumnModel().getColumnCount() > 0) {
            TSearchProv.getColumnModel().getColumn(0).setMinWidth(0);
            TSearchProv.getColumnModel().getColumn(0).setPreferredWidth(0);
            TSearchProv.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 320, 330));

        tagResults.setBackground(new java.awt.Color(255, 255, 255));
        tagResults.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tagResults.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tagResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 320, 30));

        search.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        search.setMargin(new java.awt.Insets(2, 6, 2, 2));
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Búsqueda del proveedor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 30));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //method to find all the products with the classification selected
    private void TSearchProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TSearchProvMouseClicked
        int i=TSearchProv.getSelectedRow();
        String id;
        id=String.valueOf(TSearchProv.getValueAt(i, 0));
        id=id.trim();
        advancedSearch v2=new  advancedSearch(new javax.swing.JFrame(), true,id);
        v2.queryFindProducts();
        v2.setLocationRelativeTo(v2);
        v2.setVisible(rootPaneCheckingEnabled);
        if(v2.getCode().isEmpty()){
            
        }else{
            idProduct=v2.getCode();
            this.dispose();
        }
    }//GEN-LAST:event_TSearchProvMouseClicked

    //this method closes the windows wih the key ESC
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    //this part of the code creates a search of filter in the table
    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
         search.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (search.getText());
                search.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(search.getText().toUpperCase(), 1));
            }
        });
        trsFiltro = new TableRowSorter(TSearchProv.getModel());
        TSearchProv.setRowSorter(trsFiltro);

    }//GEN-LAST:event_searchKeyTyped

    //this method is called to charge all the classifications
    public void chargingClassifications(){
        int cont=0;
        int size=providers.size();
        while(size>cont){
             Object dato[]={providers.get(cont).getId(),providers.get(cont).getName()};
              model.addRow(dato);
            cont++;
        }
        tagResults.setText("Hay "+cont+" proveedores)");
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TSearchProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private javax.swing.JLabel tagResults;
    // End of variables declaration//GEN-END:variables
}
