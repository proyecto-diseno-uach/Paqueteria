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

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        RastrePaque = new javax.swing.JPanel();
        lbl_rastrepaque = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ActuaEstad = new javax.swing.JPanel();
        lbl_actuaestad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RegisPaque = new javax.swing.JPanel();
        lbl_regispaque = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Paqueregis = new javax.swing.JPanel();
        lbl_paqueregis = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        jPanel3.setBackground(new java.awt.Color(153, 255, 102));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        RastrePaque.setBackground(new java.awt.Color(255, 255, 0));
        RastrePaque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RastrePaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RastrePaqueMouseClicked(evt);
            }
        });

        lbl_rastrepaque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_rastrepaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_rastrepaque.setText("Rastrear Paquete");

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout RastrePaqueLayout = new javax.swing.GroupLayout(RastrePaque);
        RastrePaque.setLayout(RastrePaqueLayout);
        RastrePaqueLayout.setHorizontalGroup(
            RastrePaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RastrePaqueLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_rastrepaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(RastrePaqueLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RastrePaqueLayout.setVerticalGroup(
            RastrePaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RastrePaqueLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_rastrepaque)
                .addContainerGap())
        );

        ActuaEstad.setBackground(new java.awt.Color(51, 255, 51));
        ActuaEstad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ActuaEstad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ActuaEstad.setFocusCycleRoot(true);
        ActuaEstad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActuaEstadMouseClicked(evt);
            }
        });

        lbl_actuaestad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_actuaestad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_actuaestad.setText("<html><p style='text-align: center'>Actualizar Estado de Paquete</p><html>");
        lbl_actuaestad.setToolTipText("Actualizar Estado de Paquete");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout ActuaEstadLayout = new javax.swing.GroupLayout(ActuaEstad);
        ActuaEstad.setLayout(ActuaEstadLayout);
        ActuaEstadLayout.setHorizontalGroup(
            ActuaEstadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActuaEstadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_actuaestad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ActuaEstadLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ActuaEstadLayout.setVerticalGroup(
            ActuaEstadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActuaEstadLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(lbl_actuaestad, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        RegisPaque.setBackground(new java.awt.Color(153, 102, 0));
        RegisPaque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegisPaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisPaqueMouseClicked(evt);
            }
        });

        lbl_regispaque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_regispaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_regispaque.setText("Registrar Paquete");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout RegisPaqueLayout = new javax.swing.GroupLayout(RegisPaque);
        RegisPaque.setLayout(RegisPaqueLayout);
        RegisPaqueLayout.setHorizontalGroup(
            RegisPaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisPaqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_regispaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(RegisPaqueLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegisPaqueLayout.setVerticalGroup(
            RegisPaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisPaqueLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_regispaque)
                .addContainerGap())
        );

        Paqueregis.setBackground(new java.awt.Color(102, 102, 255));
        Paqueregis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Paqueregis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaqueregisMouseClicked(evt);
            }
        });

        lbl_paqueregis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_paqueregis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_paqueregis.setText("Paquetes Registrados");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paqueteria/Adobe Express 2024-03-22 1.23.24.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout PaqueregisLayout = new javax.swing.GroupLayout(Paqueregis);
        Paqueregis.setLayout(PaqueregisLayout);
        PaqueregisLayout.setHorizontalGroup(
            PaqueregisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaqueregisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaqueregisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_paqueregis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        PaqueregisLayout.setVerticalGroup(
            PaqueregisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaqueregisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_paqueregis)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(Paqueregis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(RegisPaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ActuaEstad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(RastrePaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActuaEstad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisPaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Paqueregis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RastrePaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );

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
        PRegistrados pRegistrados = new PRegistrados();
        pRegistrados.setVisible(true);
        pRegistrados.requestFocus();
    }//GEN-LAST:event_RastrePaqueMouseClicked

    private void ActuaEstadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActuaEstadMouseClicked
        PRegistrados pRegistrados = new PRegistrados();
        pRegistrados.setVisible(true);
        pRegistrados.requestFocus();
    }//GEN-LAST:event_ActuaEstadMouseClicked

    private void PaqueregisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaqueregisMouseClicked
        PRegistrados pRegistrados = new PRegistrados();
        pRegistrados.setVisible(true);
        pRegistrados.requestFocus();
    }//GEN-LAST:event_PaqueregisMouseClicked

    private void RegisPaqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisPaqueMouseClicked
        PRegistrados pRegistrados = new PRegistrados();
        pRegistrados.setVisible(true);
        pRegistrados.requestFocus();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbl_actuaestad;
    private javax.swing.JLabel lbl_paqueregis;
    private javax.swing.JLabel lbl_rastrepaque;
    private javax.swing.JLabel lbl_regispaque;
    // End of variables declaration//GEN-END:variables
}
