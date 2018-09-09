package poo;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
        this.Tabla.setModel(tm);
        this.tm.addColumn("Alumno");
        this.tm.addColumn("RUN");
        this.tm.addColumn("Sala");
        this.tm.addColumn("Utensilio");
        this.tm.addColumn("Hora Entrega");
        this.tm.addColumn("Hora Salida");
    }

    @SuppressWarnings("unchecked")
    DefaultTableModel tm=new DefaultTableModel();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAlumno = new javax.swing.JTextField();
        txtRun = new javax.swing.JTextField();
        txtSala = new javax.swing.JTextField();
        txtUtensilio = new javax.swing.JTextField();
        txtHoraE = new javax.swing.JTextField();
        txtHoraS = new javax.swing.JTextField();
        btGrabar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Ingresar Datos");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jLabel2.setText("Alumno:");

        jLabel3.setText("RUN:");

        jLabel4.setText("Sala:");

        jLabel5.setText("Utensilio:");

        jLabel6.setText("Hora Entrega:");

        jLabel7.setText("Hora Salida:");

        txtRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRunActionPerformed(evt);
            }
        });

        txtSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaActionPerformed(evt);
            }
        });

        btGrabar.setIcon(new javax.swing.ImageIcon("C:\\Users\\beach\\Desktop\\Save_37110.png")); // NOI18N
        btGrabar.setText("Grabar");
        btGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGrabarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtUtensilio, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                            .addComponent(txtSala)
                                            .addComponent(txtHoraE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btNuevo)
                                            .addComponent(btEditar)
                                            .addComponent(btEliminar))
                                        .addGap(96, 96, 96))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btGrabar)
                                        .addGap(100, 100, 100))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRun)
                                            .addComponent(txtHoraS))
                                        .addGap(127, 127, 127)
                                        .addComponent(btSalir)
                                        .addGap(112, 112, 112))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGrabar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNuevo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUtensilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHoraE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEliminar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHoraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalir))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRunActionPerformed
        
    }//GEN-LAST:event_txtRunActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        int fila_seleccionada=Tabla.getSelectedRow();
        if(fila_seleccionada>=0){
            tm.removeRow(fila_seleccionada);
            
        }else{
           JOptionPane.showMessageDialog(null, "Seleccione una fila porfavor");
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGrabarActionPerformed
        this.tm.addRow(new Object[]{
            this.txtAlumno.getText(),this.txtRun.getText(),this.txtSala.getText()
                ,this.txtUtensilio.getText(),this.txtHoraE.getText(),this.txtHoraS.getText()
        });
       this.txtAlumno.setText("");
       this.txtRun.setText("");
       this.txtSala.setText("");
       this.txtUtensilio.setText("");
       this.txtHoraE.setText("");
       this.txtHoraS.setText("");
       txtAlumno.grabFocus();
       JOptionPane.showMessageDialog(null, "Grabado");
    }//GEN-LAST:event_btGrabarActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
       this.txtAlumno.setText("");
       this.txtRun.setText("");
       this.txtSala.setText("");
       this.txtUtensilio.setText("");
       this.txtHoraE.setText("");
       this.txtHoraS.setText("");
       txtAlumno.grabFocus();
       JOptionPane.showMessageDialog(null, "Listo");
    }//GEN-LAST:event_btNuevoActionPerformed
int filas;
    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        JOptionPane.showMessageDialog(null, "Editado");
        String []datos=new String[6];
        datos[0]=txtAlumno.getText();
        datos[1]=txtRun.getText();
        datos[2]=txtSala.getText();
        datos[3]=txtUtensilio.getText();
        datos[4]=txtHoraE.getText();
        datos[5]=txtHoraS.getText();
        for(int i=0;1<Tabla.getColumnCount();i++){
            tm.setValueAt(datos[i],filas,i);
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila_seleccionada;
        fila_seleccionada = Tabla.getSelectedRow();
        txtAlumno.setText(tm.getValueAt(fila_seleccionada,0).toString());
        txtRun.setText(tm.getValueAt(fila_seleccionada,1).toString());
        txtSala.setText(tm.getValueAt(fila_seleccionada,2).toString());
        txtUtensilio.setText(tm.getValueAt(fila_seleccionada,3).toString());
        txtHoraE.setText(tm.getValueAt(fila_seleccionada,4).toString());
        txtHoraS.setText(tm.getValueAt(fila_seleccionada,5).toString());
        filas=fila_seleccionada;
    }//GEN-LAST:event_TablaMouseClicked

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void txtSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaActionPerformed
        
    }//GEN-LAST:event_txtSalaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGrabar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlumno;
    private javax.swing.JTextField txtHoraE;
    private javax.swing.JTextField txtHoraS;
    private javax.swing.JTextField txtRun;
    private javax.swing.JTextField txtSala;
    private javax.swing.JTextField txtUtensilio;
    // End of variables declaration//GEN-END:variables
}
