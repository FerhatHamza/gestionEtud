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
public class AjouterUnite extends javax.swing.JFrame {

    /**
     * Creates new form AjouterUnite
     */
    public AjouterUnite() {
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

        UnityNom = new javax.swing.JTextField();
        Abr = new javax.swing.JTextField();
        Credit = new javax.swing.JTextField();
        Coeff = new javax.swing.JTextField();
        AddUniBn = new javax.swing.JButton();
        retournUni = new javax.swing.JButton();
        BgAdU = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UnityNom.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UnityNom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(UnityNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 340, 40));

        Abr.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Abr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Abr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 340, 40));

        Credit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Credit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 340, 40));

        Coeff.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Coeff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Coeff, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 340, 40));

        AddUniBn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AddUnitBn.png"))); // NOI18N
        AddUniBn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(AddUniBn, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 432, 200, 50));

        retournUni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/returUnitBn.png"))); // NOI18N
        getContentPane().add(retournUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(867, 472, 380, 60));

        BgAdU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AddUnity.png"))); // NOI18N
        getContentPane().add(BgAdU, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 1, 1260, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AjouterUnite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterUnite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterUnite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterUnite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterUnite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Abr;
    private javax.swing.JButton AddUniBn;
    private javax.swing.JLabel BgAdU;
    private javax.swing.JTextField Coeff;
    private javax.swing.JTextField Credit;
    private javax.swing.JTextField UnityNom;
    private javax.swing.JButton retournUni;
    // End of variables declaration//GEN-END:variables
}
