/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionairetudiant;

/**
 *
 * @author Elias
 */
public class AjouterEtud extends javax.swing.JFrame {

    /**
     * Creates new form AjouterEtud
     */
    public AjouterEtud() {
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

        NomEtPrenom = new javax.swing.JTextField();
        DatLieuNaissance = new javax.swing.JTextField();
        Adrress = new javax.swing.JTextField();
        Depert = new javax.swing.JTextField();
        Niveau = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        AjouterBn = new javax.swing.JButton();
        uploadPhoto = new javax.swing.JLabel();
        PhotoLabl = new javax.swing.JLabel();
        Retour = new javax.swing.JButton();
        bgA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomEtPrenom.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NomEtPrenom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(NomEtPrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 114, 200, 30));

        DatLieuNaissance.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        DatLieuNaissance.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(DatLieuNaissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 184, 200, 30));

        Adrress.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Adrress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Adrress, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 319, 400, 30));

        Depert.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Depert.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Depert, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 405, 410, 30));

        Niveau.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Niveau.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Niveau, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 495, 400, 30));

        Email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 585, 410, 30));

        AjouterBn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AddEtudBn.png"))); // NOI18N
        getContentPane().add(AjouterBn, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 642, 240, 50));

        uploadPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Upload.png"))); // NOI18N
        getContentPane().add(uploadPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 130, 20));
        getContentPane().add(PhotoLabl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 107, 120, 110));

        Retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RetAjoEtuBn.png"))); // NOI18N
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });
        getContentPane().add(Retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 641, 230, 50));

        bgA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AjouterEtudBg.png"))); // NOI18N
        getContentPane().add(bgA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        
        dispose();
        MainIntr main = new MainIntr();
        main.setVisible(true);
        
    }//GEN-LAST:event_RetourActionPerformed

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
            java.util.logging.Logger.getLogger(AjouterEtud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterEtud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterEtud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterEtud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterEtud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adrress;
    private javax.swing.JButton AjouterBn;
    private javax.swing.JTextField DatLieuNaissance;
    private javax.swing.JTextField Depert;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Niveau;
    private javax.swing.JTextField NomEtPrenom;
    private javax.swing.JLabel PhotoLabl;
    private javax.swing.JButton Retour;
    private javax.swing.JLabel bgA;
    private javax.swing.JLabel uploadPhoto;
    // End of variables declaration//GEN-END:variables
}
