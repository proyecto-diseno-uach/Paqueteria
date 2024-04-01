package paqueteria;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gaelm
 */
public class Inicio extends javax.swing.JFrame {

    private static Inicio inicio;
    
    static Inicio getInstance(){
        if (inicio == null) {
            inicio = new Inicio();
        }
        return inicio;
    }
    
    /**
     * Creates new form Pregistrados
     */
    public Inicio() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Paqueregis = new javax.swing.JPanel();
        lbl_paqueregis = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RegisPaque = new javax.swing.JPanel();
        lbl_regispaque = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ActuaEstad = new javax.swing.JPanel();
        lbl_actuaestad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RastrePaque = new javax.swing.JPanel();
        lbl_rastrepaque = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        jPanel3.setBackground(new java.awt.Color(153, 255, 102));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        Paqueregis.setBackground(new java.awt.Color(102, 102, 255));
        Paqueregis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Paqueregis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Paqueregis.setMaximumSize(new java.awt.Dimension(260, 260));
        Paqueregis.setMinimumSize(new java.awt.Dimension(260, 260));
        Paqueregis.setPreferredSize(new java.awt.Dimension(260, 260));
        Paqueregis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaqueregisMouseClicked(evt);
            }
        });
        Paqueregis.setLayout(new java.awt.GridBagLayout());

        lbl_paqueregis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_paqueregis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_paqueregis.setText("<html><p style='text-align: center'>Paquetes Registrados</p><html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        Paqueregis.add(lbl_paqueregis, gridBagConstraints);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paqueteria/assets/svgtopng/inventario.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        Paqueregis.add(jLabel5, gridBagConstraints);

        jPanel6.add(Paqueregis);

        RegisPaque.setBackground(new java.awt.Color(153, 102, 0));
        RegisPaque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegisPaque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisPaque.setMaximumSize(new java.awt.Dimension(260, 260));
        RegisPaque.setMinimumSize(new java.awt.Dimension(260, 260));
        RegisPaque.setPreferredSize(new java.awt.Dimension(260, 260));
        RegisPaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisPaqueMouseClicked(evt);
            }
        });
        RegisPaque.setLayout(new java.awt.GridBagLayout());

        lbl_regispaque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_regispaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_regispaque.setText("<html><p style='text-align: center'>Registrar Paquete</p><html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        RegisPaque.add(lbl_regispaque, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paqueteria/assets/svgtopng/registro.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        RegisPaque.add(jLabel2, gridBagConstraints);

        jPanel6.add(RegisPaque);

        ActuaEstad.setBackground(new java.awt.Color(51, 255, 51));
        ActuaEstad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ActuaEstad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActuaEstad.setFocusCycleRoot(true);
        ActuaEstad.setMaximumSize(new java.awt.Dimension(260, 260));
        ActuaEstad.setMinimumSize(new java.awt.Dimension(260, 260));
        ActuaEstad.setPreferredSize(new java.awt.Dimension(260, 260));
        ActuaEstad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActuaEstadMouseClicked(evt);
            }
        });
        ActuaEstad.setLayout(new java.awt.GridBagLayout());

        lbl_actuaestad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_actuaestad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_actuaestad.setText("<html><p style='text-align: center'>Actualizar Estado de Paquete</p><html>");
        lbl_actuaestad.setToolTipText("Actualizar Estado de Paquete");
        lbl_actuaestad.setPreferredSize(new java.awt.Dimension(100, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        ActuaEstad.add(lbl_actuaestad, gridBagConstraints);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paqueteria/assets/svgtopng/actualizar.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        ActuaEstad.add(jLabel3, gridBagConstraints);

        jPanel6.add(ActuaEstad);

        RastrePaque.setBackground(new java.awt.Color(255, 255, 0));
        RastrePaque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RastrePaque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RastrePaque.setMaximumSize(new java.awt.Dimension(260, 260));
        RastrePaque.setMinimumSize(new java.awt.Dimension(260, 260));
        RastrePaque.setPreferredSize(new java.awt.Dimension(260, 260));
        RastrePaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RastrePaqueMouseClicked(evt);
            }
        });
        RastrePaque.setLayout(new java.awt.GridBagLayout());

        lbl_rastrepaque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_rastrepaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_rastrepaque.setText("<html><p style='text-align: center'>Rastrear Paquete</p><html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        RastrePaque.add(lbl_rastrepaque, gridBagConstraints);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paqueteria/assets/svgtopng/rastreo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        RastrePaque.add(jLabel4, gridBagConstraints);

        jPanel6.add(RastrePaque);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel3.add(jPanel6, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RastrePaqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RastrePaqueMouseClicked
        Ltiempo2 ltiempo2 = Ltiempo2.getInstance();
        ltiempo2.setVisible(true);
        ltiempo2.requestFocus();
    }//GEN-LAST:event_RastrePaqueMouseClicked

    private void ActuaEstadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActuaEstadMouseClicked
        ActuPaquete actuPaquete = ActuPaquete.getInstance();
        actuPaquete.setVisible(true);
        actuPaquete.requestFocus();
    }//GEN-LAST:event_ActuaEstadMouseClicked

    private void PaqueregisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaqueregisMouseClicked
        PRegistrados pRegistrados = PRegistrados.getInstance();
        pRegistrados.setVisible(true);
        pRegistrados.requestFocus();
    }//GEN-LAST:event_PaqueregisMouseClicked

    private void RegisPaqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisPaqueMouseClicked
        NUpaquete nUpaquetes = NUpaquete.getInstance();
        nUpaquetes.setVisible(true);
        nUpaquetes.requestFocus();
    }//GEN-LAST:event_RegisPaqueMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActuaEstad;
    private javax.swing.JPanel Paqueregis;
    private javax.swing.JPanel RastrePaque;
    private javax.swing.JPanel RegisPaque;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbl_actuaestad;
    private javax.swing.JLabel lbl_paqueregis;
    private javax.swing.JLabel lbl_rastrepaque;
    private javax.swing.JLabel lbl_regispaque;
    // End of variables declaration//GEN-END:variables
}
