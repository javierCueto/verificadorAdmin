
package Views;
import Class.main;
import Models.connection;
import Models.providersModel;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Your Name <Jose Javier Cueto Mejia>
 */
public final class priceChecker extends javax.swing.JFrame{
    private List<providersModel> providers=new ArrayList();
    private DecimalFormat o=new DecimalFormat("#.##");
    private boolean flagMode=false;
    private boolean flagModeView=true;
    private final DefaultTableModel model;
    private final DefaultTableModel modelP;     
    private TableRowSorter trsFiltro;


    //gents and setters
    public List<providersModel> getProviders() {
        return providers;
    }
    

    public void setProviders(List<providersModel> providers) {
        this.providers = providers;
    }
    
    //constructor
    public priceChecker( List<providersModel> providers) {
        initComponents();
        this.providers = providers;
        this.model = (DefaultTableModel)  tProducts.getModel();
        this.modelP = (DefaultTableModel)  TSearchPro.getModel();
        pNormal.setBackground(main.MainColor);
        rProductCode.setBackground(main.MainColor);
        rBarCode.setBackground(main.MainColor);
        
        discount.setForeground(main.SecondColor);
        adFinder.setForeground(main.SecondColor);
        quantity.setForeground(main.SecondColor);
        jLabel7.setForeground(main.SecondColor);
        
        rProductCode1.setForeground(main.MainColor);
        rBarCode1.setForeground(main.MainColor);
        
        jLabel2.setBackground(main.SecondColor);
        jLabel14.setBackground(main.SecondColor);
        jLabel15.setBackground(main.SecondColor);
        jLabel5.setBackground(main.MainColor);
        jLabel4.setForeground(main.SecondColor);
        jLabel8.setBackground(main.MainColor);
        jLabel16.setBackground(main.MainColor);
        btnUpdateBar.setBackground(main.SecondColor);
        
        jLabel10.setBackground(main.MainColor);
        tProducts.setForeground(main.MainColor);
       // fieldTotal.setForeground(main.MainColor);
        labelTotal.setForeground(main.SecondColor);
        btnAdvanced.setBackground(main.MainColor);
        btnAdvanced.setForeground(main.whiteColor);
        rCode.setBackground(main.MainColor);
        rName.setBackground(main.MainColor);
        jLabel9.setBackground(main.MainColor);
        jPanel1.setBackground(main.SecondColor);   
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchType = new javax.swing.ButtonGroup();
        searchTypeAd = new javax.swing.ButtonGroup();
        typeProducts = new javax.swing.ButtonGroup();
        productsDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TSearchPro = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        keyWord = new javax.swing.JTextField();
        rCode = new javax.swing.JRadioButton();
        rName = new javax.swing.JRadioButton();
        searchJustProducts = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tagResults = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        pMain = new javax.swing.JPanel();
        pMode = new javax.swing.JPanel();
        btnAdvanced = new javax.swing.JLabel();
        pCards = new javax.swing.JPanel();
        pNormal = new javax.swing.JPanel();
        finder = new javax.swing.JTextField();
        nameCode = new javax.swing.JLabel();
        rProductCode = new javax.swing.JRadioButton();
        rBarCode = new javax.swing.JRadioButton();
        nameProduct = new javax.swing.JLabel();
        lTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnUpdateBar = new javax.swing.JLabel();
        barCode = new javax.swing.JLabel();
        pAdvanced = new javax.swing.JPanel();
        rProductCode1 = new javax.swing.JRadioButton();
        rBarCode1 = new javax.swing.JRadioButton();
        adFinder = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProducts = new javax.swing.JTable();
        quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        discount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);

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
        jScrollPane2.setViewportView(TSearchPro);
        if (TSearchPro.getColumnModel().getColumnCount() > 0) {
            TSearchPro.getColumnModel().getColumn(0).setMinWidth(100);
            TSearchPro.getColumnModel().getColumn(0).setMaxWidth(100);
            TSearchPro.getColumnModel().getColumn(2).setMinWidth(150);
            TSearchPro.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 110, 780, 290));

        jLabel9.setBackground(new java.awt.Color(51, 0, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Buscar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 100, 40));

        keyWord.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        keyWord.setMargin(new java.awt.Insets(2, 6, 2, 2));
        keyWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyWordActionPerformed(evt);
            }
        });
        jPanel1.add(keyWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 360, 40));

        rCode.setBackground(new java.awt.Color(51, 0, 51));
        typeProducts.add(rCode);
        rCode.setForeground(new java.awt.Color(255, 255, 255));
        rCode.setText("Código");
        rCode.setFocusPainted(false);
        rCode.setFocusable(false);
        jPanel1.add(rCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 40));

        rName.setBackground(new java.awt.Color(51, 0, 51));
        typeProducts.add(rName);
        rName.setForeground(new java.awt.Color(255, 255, 255));
        rName.setSelected(true);
        rName.setText("Nombre");
        rName.setFocusPainted(false);
        rName.setFocusable(false);
        jPanel1.add(rName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 70, 40));

        searchJustProducts.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        searchJustProducts.setMargin(new java.awt.Insets(2, 6, 2, 2));
        searchJustProducts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchJustProductsKeyTyped(evt);
            }
        });
        jPanel1.add(searchJustProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 540, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ingrese una palabra clave");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 30));

        tagResults.setBackground(new java.awt.Color(255, 255, 255));
        tagResults.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tagResults.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tagResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 440, 30));

        jMenuBar3.setPreferredSize(new java.awt.Dimension(0, 0));

        jMenu4.setText("File");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem7.setText("jMenuItem7");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar3.add(jMenu4);

        productsDialog.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout productsDialogLayout = new javax.swing.GroupLayout(productsDialog.getContentPane());
        productsDialog.getContentPane().setLayout(productsDialogLayout);
        productsDialogLayout.setHorizontalGroup(
            productsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        productsDialogLayout.setVerticalGroup(
            productsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2000, 2000));
        setUndecorated(true);

        pMain.setBackground(new java.awt.Color(255, 255, 255));

        pMode.setBackground(new java.awt.Color(255, 255, 255));
        pMode.setMaximumSize(new java.awt.Dimension(1000, 1000));
        pMode.setPreferredSize(new java.awt.Dimension(1000, 45));

        btnAdvanced.setBackground(new java.awt.Color(255, 255, 255));
        btnAdvanced.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAdvanced.setForeground(new java.awt.Color(51, 0, 51));
        btnAdvanced.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnAdvanced.setText("Clic para entrar en modo avanzado");
        btnAdvanced.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 12, 6, 12));
        btnAdvanced.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdvanced.setOpaque(true);
        btnAdvanced.setPreferredSize(new java.awt.Dimension(500, 34));
        btnAdvanced.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdvancedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pModeLayout = new javax.swing.GroupLayout(pMode);
        pMode.setLayout(pModeLayout);
        pModeLayout.setHorizontalGroup(
            pModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdvanced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pModeLayout.setVerticalGroup(
            pModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdvanced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pCards.setLayout(new java.awt.CardLayout());

        pNormal.setBackground(new java.awt.Color(51, 0, 51));

        finder.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        finder.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 8, 2, 2));
        finder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finderActionPerformed(evt);
            }
        });

        nameCode.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nameCode.setForeground(new java.awt.Color(255, 255, 255));

        rProductCode.setBackground(new java.awt.Color(51, 0, 51));
        searchType.add(rProductCode);
        rProductCode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rProductCode.setForeground(new java.awt.Color(255, 255, 255));
        rProductCode.setSelected(true);
        rProductCode.setText("Código de producto");
        rProductCode.setFocusable(false);

        rBarCode.setBackground(new java.awt.Color(51, 0, 51));
        searchType.add(rBarCode);
        rBarCode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rBarCode.setForeground(new java.awt.Color(255, 255, 255));
        rBarCode.setText("Código de barra");
        rBarCode.setFocusable(false);

        nameProduct.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nameProduct.setForeground(new java.awt.Color(255, 255, 255));
        nameProduct.setText("?");

        lTotal.setBackground(new java.awt.Color(255, 255, 255));
        lTotal.setFont(new java.awt.Font("Segoe UI", 1, 200)); // NOI18N
        lTotal.setForeground(new java.awt.Color(255, 255, 255));
        lTotal.setText("$ 00.00");

        jLabel2.setBackground(new java.awt.Color(102, 0, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Salir (ESC)");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 12, 6, 12));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(102, 0, 102));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Búsqueda de producto con palabra clave (F3)");
        jLabel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 12, 6, 12));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(102, 0, 102));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Búsqueda Por Proveedores (F4)");
        jLabel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 12, 6, 12));
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        btnUpdateBar.setBackground(new java.awt.Color(102, 0, 102));
        btnUpdateBar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnUpdateBar.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpdateBar.setText("Actualizar código de barra");
        btnUpdateBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 12, 6, 12));
        btnUpdateBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateBar.setOpaque(true);
        btnUpdateBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateBarMouseClicked(evt);
            }
        });

        barCode.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        barCode.setForeground(new java.awt.Color(255, 255, 255));
        barCode.setText("?");

        javax.swing.GroupLayout pNormalLayout = new javax.swing.GroupLayout(pNormal);
        pNormal.setLayout(pNormalLayout);
        pNormalLayout.setHorizontalGroup(
            pNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNormalLayout.createSequentialGroup()
                .addGroup(pNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pNormalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addGroup(pNormalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nameProduct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pNormalLayout.createSequentialGroup()
                                .addGroup(pNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pNormalLayout.createSequentialGroup()
                                        .addComponent(rBarCode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rProductCode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpdateBar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(finder, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameCode, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(barCode, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(457, Short.MAX_VALUE))
        );
        pNormalLayout.setVerticalGroup(
            pNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNormalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdateBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pNormalLayout.createSequentialGroup()
                        .addGroup(pNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rProductCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pNormalLayout.createSequentialGroup()
                        .addComponent(nameCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barCode))
                    .addComponent(finder, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap())
        );

        pCards.add(pNormal, "card3");

        pAdvanced.setBackground(new java.awt.Color(255, 255, 255));

        rProductCode1.setBackground(new java.awt.Color(255, 255, 255));
        searchTypeAd.add(rProductCode1);
        rProductCode1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rProductCode1.setForeground(new java.awt.Color(255, 255, 255));
        rProductCode1.setSelected(true);
        rProductCode1.setText("Código de producto");

        rBarCode1.setBackground(new java.awt.Color(255, 255, 255));
        searchTypeAd.add(rBarCode1);
        rBarCode1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rBarCode1.setForeground(new java.awt.Color(255, 255, 255));
        rBarCode1.setText("Código de barra");

        adFinder.setBackground(new java.awt.Color(245, 245, 245));
        adFinder.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        adFinder.setForeground(new java.awt.Color(255, 255, 255));
        adFinder.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 8, 2, 2));
        adFinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adFinderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Producto");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(102, 0, 102));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tProducts.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tProducts.setForeground(new java.awt.Color(51, 0, 51));
        tProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad", "Precio unitario", "Subtotal"
            }
        ));
        tProducts.setGridColor(new java.awt.Color(255, 255, 255));
        tProducts.setIntercellSpacing(new java.awt.Dimension(10, 1));
        tProducts.setRowHeight(40);
        tProducts.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tProducts.setShowHorizontalLines(false);
        tProducts.setShowVerticalLines(false);
        tProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tProducts);
        if (tProducts.getColumnModel().getColumnCount() > 0) {
            tProducts.getColumnModel().getColumn(0).setMinWidth(130);
            tProducts.getColumnModel().getColumn(0).setPreferredWidth(130);
            tProducts.getColumnModel().getColumn(0).setMaxWidth(130);
            tProducts.getColumnModel().getColumn(2).setMinWidth(60);
            tProducts.getColumnModel().getColumn(2).setMaxWidth(60);
            tProducts.getColumnModel().getColumn(3).setMinWidth(150);
            tProducts.getColumnModel().getColumn(3).setMaxWidth(150);
            tProducts.getColumnModel().getColumn(4).setMinWidth(150);
            tProducts.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        quantity.setBackground(new java.awt.Color(245, 245, 245));
        quantity.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        quantity.setForeground(new java.awt.Color(255, 255, 255));
        quantity.setText("1");
        quantity.setBorder(null);
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 58)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Total:");

        jLabel5.setBackground(new java.awt.Color(102, 0, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salir (ESC)");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 12, 6, 12));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        discount.setBackground(new java.awt.Color(245, 245, 245));
        discount.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        discount.setForeground(new java.awt.Color(255, 255, 255));
        discount.setText("0");
        discount.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 8, 2, 2));
        discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountActionPerformed(evt);
            }
        });
        discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                discountKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Descuento");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel7.setText("%");

        jLabel8.setBackground(new java.awt.Color(102, 0, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Búsqueda de producto con palabra clave (F3)");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 12, 6, 12));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(102, 0, 102));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nueva consulta (F12)");
        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 12, 6, 12));
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(102, 0, 102));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Búsqueda Por Proveedores (F4)");
        jLabel16.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 12, 6, 12));
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        labelTotal.setFont(new java.awt.Font("Segoe UI", 0, 64)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(51, 0, 51));
        labelTotal.setText("$0.0");

        javax.swing.GroupLayout pAdvancedLayout = new javax.swing.GroupLayout(pAdvanced);
        pAdvanced.setLayout(pAdvancedLayout);
        pAdvancedLayout.setHorizontalGroup(
            pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdvancedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pAdvancedLayout.createSequentialGroup()
                                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pAdvancedLayout.createSequentialGroup()
                                        .addComponent(rProductCode1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rBarCode1))
                                    .addGroup(pAdvancedLayout.createSequentialGroup()
                                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pAdvancedLayout.createSequentialGroup()
                                                .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7))
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(adFinder, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(12, 12, 12)
                                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(labelTotal)))
                            .addGroup(pAdvancedLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)))
                        .addGap(0, 480, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pAdvancedLayout.setVerticalGroup(
            pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdvancedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rBarCode1)
                    .addComponent(rProductCode1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel1))
                    .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(adFinder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel16)
                    .addComponent(jLabel10))
                .addGap(11, 11, 11))
        );

        pCards.add(pAdvanced, "card3");

        javax.swing.GroupLayout pMainLayout = new javax.swing.GroupLayout(pMain);
        pMain.setLayout(pMainLayout);
        pMainLayout.setHorizontalGroup(
            pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pMode, javax.swing.GroupLayout.DEFAULT_SIZE, 1398, Short.MAX_VALUE)
        );
        pMainLayout.setVerticalGroup(
            pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainLayout.createSequentialGroup()
                .addComponent(pMode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pCards, javax.swing.GroupLayout.PREFERRED_SIZE, 532, Short.MAX_VALUE))
        );

        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setMaximumSize(new java.awt.Dimension(50, 50));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(50, 50));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(0, 0));

        jMenu1.setText("File");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem3.setText("Búsqueda avanzada");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem5.setText("Buscar por cliente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem4.setText("Verificar");
        jMenu1.add(jMenuItem4);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem2.setText("Nueva consulta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //method to close the whole programg
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //method to do a new query in the advanced search view
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        newQuery12();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    //method to starts a searching with a key word
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        methodAdvancedSearch();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    //method to find the providers
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        methodsearchByProviders();   
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    //method to change of the view advanced or normal
    private void btnAdvancedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdvancedMouseClicked
        if(flagMode){
            pNormal.setVisible(true);
            pAdvanced.setVisible(false);
            btnAdvanced.setText("Clic para entrar en modo avanzado");

            flagMode=false;
            flagModeView=true;
        }else{
            pNormal.setVisible(false);
            pAdvanced.setVisible(true);
            flagMode=true;
            flagModeView=false;
            btnAdvanced.setText("Clic para entrar en modo simple");

            adFinder.requestFocus();

        }
        
    }//GEN-LAST:event_btnAdvancedMouseClicked

    //event called with the enter in the field of view advanced
    private void adFinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adFinderActionPerformed
        queryFinderAd();
    }//GEN-LAST:event_adFinderActionPerformed

    //event called with the enter in quantity field
    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        queryFinderAd();
    }//GEN-LAST:event_quantityActionPerformed

    //boton to close the whole program
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    //method to calculate the discount 
    private void discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountActionPerformed
        String format;
        if(discount.getText().trim().isEmpty()){
           discount.setText("0");
        }
        if(checkDiscount()){
            double nDiscount=1-(Double.parseDouble(discount.getText())/100);
            double nPrecio;          
            double nSubtotal;          
            double nquantity;          
            for (int i = 0; i <tProducts.getRowCount() ; i++) {
                nPrecio=Double.parseDouble(model.getValueAt(i, 3).toString());
                nquantity=Double.parseDouble(model.getValueAt(i, 2).toString());
                nSubtotal=(nquantity*nPrecio)*nDiscount;
                format=o.format(nSubtotal);
                nSubtotal=Double.parseDouble(format);
                model.setValueAt(nSubtotal, i, 4);
            }
            total();
        }else{
            JOptionPane.showMessageDialog(null,"el valor del descuento no puede se mayor a 100");
        }
        
    }//GEN-LAST:event_discountActionPerformed

    //method to call the view searching with a key word
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        methodAdvancedSearch();
    }//GEN-LAST:event_jLabel8MouseClicked

    //boton to clear the table of the advanced searching view
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        newQuery12();
    }//GEN-LAST:event_jLabel10MouseClicked

    //just numbers in disconts
    private void discountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountKeyTyped
           char car = evt.getKeyChar();
        if(( car<'0' || car>'9' )){ 
            evt.consume();
        }
    }//GEN-LAST:event_discountKeyTyped

    //numbers and franctions in the field of quatity
    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
         char car = evt.getKeyChar();
        if(( car<'0' || car>'9' ) && (car != '.')){ 
            evt.consume();
        }
        if (car == '.' && quantity.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_quantityKeyTyped

    //method to remove a product in the table on the advanced searching view
    private void tProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProductsMouseClicked
        int i=tProducts.getSelectedRow();
        if(1>=0){
           model.removeRow(i);
        }
        total();
    }//GEN-LAST:event_tProductsMouseClicked

    //method where is selected a product in the table of advanced products with 
    // a key word
    private void TSearchProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TSearchProMouseClicked
    int i=TSearchPro.getSelectedRow();
    String codeSearch=(String) TSearchPro.getValueAt(i, 0);
    //normal view
    if(flagModeView){
        finder.setText(codeSearch);
        rProductCode.setSelected(true);
        queryFinder();     
    }else{       
        //advanced view
        adFinder.setText(codeSearch);
        rProductCode1.setSelected(true);
        queryFinderAd(); 
    }    
        //to close the view
        productsDialog.dispose();
    }//GEN-LAST:event_TSearchProMouseClicked

    //methods to find the products with a key word
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        methodFinderKeyWord();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void keyWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyWordActionPerformed
        methodFinderKeyWord();
    }//GEN-LAST:event_keyWordActionPerformed
    //***********************************************************
    
    //filter to the advanced products with a key word
    public void filter(){
        int fill=0;
        if(rCode.isSelected()){
            fill=0;
        }else{
            fill=1;
        }            
        trsFiltro.setRowFilter(RowFilter.regexFilter(searchJustProducts.getText().toUpperCase(), fill));        
    }

    //this method charge all the product in a view
    public void methodFinderKeyWord(){
        searchJustProducts.requestFocus();
        clearmodelProducts();
        chargingKeyWordProducts();
        keyWord.setText("");
        searchJustProducts.setText("");
    } 

    //this query charge all products with a key word
    public void chargingKeyWordProducts(){
        String sql;       
        try{
            sql="select CCODIGOP01,CNOMBREP01,CCODALTERN from MGW10005 where UPPER(CNOMBREP01) like UPPER('%"+keyWord.getText()+"%') order by CCODIGOP01 asc";
            connection c=new connection();
            c.getCon();
            Statement stmt = c.getCon().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            int cont=0;
            while(rs.next()) {
                Object dato[]={rs.getObject("CCODIGOP01").toString().trim(),rs.getObject("CNOMBREP01").toString().trim()
                        ,rs.getObject("CCODALTERN")};
                modelP.addRow(dato);
                cont++;
            }
            if(cont==0){
                            tagResults.setText("No se encontró ningún producto");
                            System.out.println("Lo sentimos, escriba bien");
                        }else{
                            tagResults.setText("Se encontraron "+cont+" resultado(s)");
                            System.out.println("Se encontraron "+cont+" resultado(s)");
                        }

        c.closeCon();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error carlos\n"+e.getMessage()+"\n"+e.getSQLState());
            System.out.println(e.getMessage());
        }   
    }

    //finder of products with a filter
    private void searchJustProductsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJustProductsKeyTyped
        searchJustProducts.addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(final KeyEvent e) {
            String cadena = (searchJustProducts.getText());
            searchJustProducts.setText(cadena);
            repaint();
            filter();
            }
        });
        trsFiltro = new TableRowSorter(TSearchPro.getModel());
        TSearchPro.setRowSorter(trsFiltro);
    }//GEN-LAST:event_searchJustProductsKeyTyped

    //boton to call the dialog of products searching
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        productsDialog.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    
    //************************************************************************
    //button to call the providers view
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        methodsearchByProviders();
    }//GEN-LAST:event_jLabel16MouseClicked
    
    //button to call too the providers view
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
       methodsearchByProviders();
    }//GEN-LAST:event_jLabel15MouseClicked

    //this envent is actuated when is clicked the advanced searching with key word
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        methodAdvancedSearch();
    }//GEN-LAST:event_jLabel14MouseClicked

    //method to close the whole program
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    //this event is actuated when there is a enter in the search field in normal
    //seaching
    private void finderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finderActionPerformed
        queryFinder();
    }//GEN-LAST:event_finderActionPerformed

    //this method validates that bar code is only numbers
    private void btnUpdateBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateBarMouseClicked
        if(nameCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Aun no se ha buscado ningún producto","Campo vacío",JOptionPane.WARNING_MESSAGE);
        }else{
           String newBar= JOptionPane.showInputDialog(null,"Ingrese el nuevo código de barra para "
                    + "\n"+nameProduct.getText(),"Actualizar "+nameCode.getText(),JOptionPane.INFORMATION_MESSAGE);
           
            try {
                if(newBar==null){
                    
                }else{
                double newCodeBar=Double.parseDouble(newBar);
                queryUpdateBarCode(newBar,nameCode.getText());
                 }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Solo se permiten números en el "
                        + "código de barra","Error Carlitos",JOptionPane.ERROR_MESSAGE);
            }
           
        }
    }//GEN-LAST:event_btnUpdateBarMouseClicked
    
    //this method is called when we want to update a barcode 
    public void queryUpdateBarCode(String barCode, String code){
        try{
            String sql2="update MGW10005 set CCODALTERN='"+barCode+"' where CCODIGOP01='"+code+"'";
                connection c=new connection();
                        c.getCon();
                Statement stmt2 = c.getCon().createStatement();
                int rs2 = stmt2.executeUpdate(sql2);
                if(rs2==0) {
                    JOptionPane.showMessageDialog(null,"No se encontró el producto al actualizar"
                            ,"Problemas al guardar",JOptionPane.WARNING_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Código actualizado\nAcaba de "
                        + "ayudar a la causa","Felicidades!!!!!!!",JOptionPane.INFORMATION_MESSAGE);
                    this.barCode.setText(barCode);
                }
                c.closeCon();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error grave\n Contacte a Bios"
                    + "","Error Carlitos "+e.getLocalizedMessage()+e.getMessage(),JOptionPane.ERROR_MESSAGE);

        }
        
    }
    
    //this part of code calls to the providers view to find a providers and then
    //to search a product
    public void methodsearchByProviders(){
        searchByProviders vSBP=new searchByProviders(new javax.swing.JFrame(), true,providers);
        vSBP.chargingClassifications();
        vSBP.setTitle("Proveedores");
        vSBP.setLocationRelativeTo(null);
        vSBP.setVisible(true);
        if(vSBP.getIdProduct().trim().isEmpty()){
            
        }else{
            String codeSearch=vSBP.getIdProduct();
            if(flagModeView){
                finder.setText(codeSearch);
                rProductCode.setSelected(true);
                queryFinder();  
            }else{
                adFinder.setText(codeSearch);
                rProductCode1.setSelected(true);
                queryFinderAd(); 
            }  
        }
    }
    
    //this method called the view to find a product with a word key
    public void methodAdvancedSearch(){
        productsDialog.setTitle("Búsqueda de Productos");
        productsDialog.setBounds(WIDTH, WIDTH, 800, 472);
        productsDialog.setLocationRelativeTo(null);
        productsDialog.setVisible(true);
        keyWord.requestFocus();
        tagResults.setText("");
        clearmodelProducts();
        keyWord.setText("");
        searchJustProducts.setText("");
    }
    
    //finder to search a product in the normal searching
    public void queryFinder(){
        String fieldsearch=finder.getText().trim();

        if(fieldsearch.isEmpty()){
               JOptionPane.showMessageDialog(rootPane,"El campo debe obtener un dato",
                       "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else{
            String sql;       
            try{
                
                if(rProductCode.isSelected()){
                    sql="select CCODIGOP01,CNOMBREP01,CPRECIO2,CIMPUESTO1,CCODALTERN from MGW10005 where UPPER(CCODIGOP01)=UPPER('"+fieldsearch+"')";
                }else{
                    sql="select CCODIGOP01,CNOMBREP01,CPRECIO2,CIMPUESTO1,CCODALTERN from MGW10005 where UPPER(CCODALTERN)=UPPER('"+fieldsearch+"')";
                }  
                connection c=new connection();
                c.getCon();
                Statement stmt = c.getCon().createStatement();
                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                int cont=0;
                while(rs.next()) {
                    
                    double nPrice,nTax;
                    String sPrice,sTax;
                    sPrice=String.valueOf(rs.getObject("CPRECIO2"));
                    sTax=String.valueOf(rs.getObject("CIMPUESTO1"));
           
                    nPrice=Double.parseDouble(sPrice);
                    nTax=Double.parseDouble(sTax);
                    nTax=(nTax/100)+1;
                    nPrice=nPrice*nTax;
               
                    String n2=o.format(nPrice);
                    nameProduct.setText(rs.getString("CNOMBREP01").trim());
                    nameCode.setText(rs.getString("CCODIGOP01").trim());
                    barCode.setText(rs.getString("CCODALTERN").trim());
                    lTotal.setText("$ "+n2);
                    methodSelectText();
                    cont++;
                }
                if(cont==0){
                    JOptionPane.showMessageDialog(null,"El código no existe"
                            + "","Error en búsqueda",JOptionPane.ERROR_MESSAGE);
                     methodSelectText();
                }

            c.closeCon();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error Carlitos\n"+e.getMessage()+"\n"
                        + ""+e.getSQLState(),"Error grave",JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
    }
    
    //method to focus in the field of the products
    public void methodSelectText(){
        finder.setSelectionStart(0);
        finder.setSelectionEnd(finder.getText().length());
    }
    
    //query to find the producto in the field of the advanced products
    public void queryFinderAd(){
        if(discount.getText().trim().isEmpty()){
           discount.setText("0");
        }
        if(quantity.getText().trim().isEmpty()){
            quantity.setText("1");
        }
        if(checkDiscount()){
              String fieldsearch=adFinder.getText().trim();
                if(fieldsearch.isEmpty()){
                       JOptionPane.showMessageDialog(rootPane,"El campo debe obtener un dato");
                }else{
                    adFinder.setText("");
                    String sql;       
                    try{

                        if(rProductCode1.isSelected()){
                            sql="select CCODIGOP01,CNOMBREP01,CPRECIO2,CIMPUESTO1 from MGW10005 where UPPER(CCODIGOP01)=UPPER('"+fieldsearch+"')";
                        }else{
                            sql="select CCODIGOP01,CNOMBREP01,CPRECIO2,CIMPUESTO1 from MGW10005 where UPPER(CCODALTERN)=UPPER('"+fieldsearch+"')";
                        }  
                        connection c=new connection();
                        c.getCon();
                        Statement stmt = c.getCon().createStatement();
                        ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                        int cont=0;
                        while(rs.next()) {

                            double nPrice,nTax,nNeto,nDiscount;
                            String sPrice,sTax;
                            sPrice=String.valueOf(rs.getObject("CPRECIO2"));
                            sTax=String.valueOf(rs.getObject("CIMPUESTO1"));
                            nDiscount=1-((Double.parseDouble(discount.getText()))/100);
                            nPrice=Double.parseDouble(sPrice);
                            nTax=Double.parseDouble(sTax);
                            nTax=(nTax/100)+1;
                            nPrice=nPrice*nTax;
                            String n2=o.format(nPrice);
                            nPrice=Double.parseDouble(n2);
                            nNeto=Double.parseDouble(quantity.getText())*(nPrice*nDiscount);
                            n2=o.format(nNeto);
                            nNeto=Double.parseDouble(n2);
                            
                            Object dato[]={rs.getString("CCODIGOP01").trim(),rs.getString("CNOMBREP01").trim()
                                    ,quantity.getText(),nPrice,nNeto};
                                model.addRow(dato);
                                total();
                            methodSelectText();
                            cont++;
                        }
                        if(cont==0){
                            JOptionPane.showMessageDialog(null,"Código no encontrado\n"
                                    + "Intente de nuevo","No encontrado",JOptionPane.WARNING_MESSAGE);
                             methodSelectText();
                        }

                    c.closeCon();
                    }catch(SQLException e){
                        JOptionPane.showMessageDialog(null,"Error Carlitos\n"
                                +e.getMessage()+"\n"+e.getSQLState(),"Problema de conexión",JOptionPane.ERROR_MESSAGE);
                    }
                }
        }else{
           JOptionPane.showMessageDialog(null,"El campo de descuento no cumple con el rango de "
                   + "descuento");        
        }
    }
    
    //method to recalculate the total from the advance porduct table
    public void total(){
        double total=0;
          for (int i = 0; i <tProducts.getRowCount() ; i++) {
           total= total+Double.parseDouble(tProducts.getValueAt(i, 4).toString());
           }
        //fieldTotal.setText("$"+o.format(total));
        labelTotal.setText("$"+o.format(total));
    }
    
    //method to check the value of the discount
    public boolean checkDiscount(){
        double ndiscount=0;
        ndiscount=Double.parseDouble(discount.getText());  
        return ndiscount<=100;
    }
    
    //to clear the table of the products advanced
    public void newQuery12(){
        clearmodel();
        //fieldTotal.setText("$0.0");
        labelTotal.setText("$0.0");
        discount.setText("0");
        quantity.setText("1");
        
    }
    
    //clear table products of advanced view
    public void clearmodel(){
        int a = model.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
            model.removeRow(model.getRowCount()-1);
        }
    }
    
    
    //clear the advanced table products
    public void clearmodelProducts(){
        int a = modelP.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
            modelP.removeRow(modelP.getRowCount()-1);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TSearchPro;
    private javax.swing.JTextField adFinder;
    private javax.swing.JLabel barCode;
    private javax.swing.JLabel btnAdvanced;
    private javax.swing.JLabel btnUpdateBar;
    private javax.swing.JTextField discount;
    private javax.swing.JTextField finder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keyWord;
    private javax.swing.JLabel lTotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel nameCode;
    private javax.swing.JLabel nameProduct;
    private javax.swing.JPanel pAdvanced;
    private javax.swing.JPanel pCards;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pMode;
    private javax.swing.JPanel pNormal;
    private javax.swing.JDialog productsDialog;
    private javax.swing.JTextField quantity;
    private javax.swing.JRadioButton rBarCode;
    private javax.swing.JRadioButton rBarCode1;
    private javax.swing.JRadioButton rCode;
    private javax.swing.JRadioButton rName;
    private javax.swing.JRadioButton rProductCode;
    private javax.swing.JRadioButton rProductCode1;
    private javax.swing.JTextField searchJustProducts;
    private javax.swing.ButtonGroup searchType;
    private javax.swing.ButtonGroup searchTypeAd;
    private javax.swing.JTable tProducts;
    private javax.swing.JLabel tagResults;
    private javax.swing.ButtonGroup typeProducts;
    // End of variables declaration//GEN-END:variables

  
}
