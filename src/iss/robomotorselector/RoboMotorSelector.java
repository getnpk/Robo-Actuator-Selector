/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iss.robomotorselector;

import iss.motords.RootNode;
import iss.motords.Node;
import iss.robomotor.MotorGUI;

/**
 *
 * @author nitinpkumar
 */
public class RoboMotorSelector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Follow BFS, YES to the left
        Node one = new Node("One Node");
        Node two = new Node("Two Node");
        Node three = new Node("Three Node");
        Node four = new Node("Four Node");
        Node five = new Node("Five Node");
        Node six = new Node("Six Node");
        Node seven = new Node("Seven Node");
        Node eight = new Node("Eight Node");
        
        one.setBack(null);
        one.setYes(two);
        one.setNo(three);
        
        two.setBack(one);
        two.setYes(four);
        two.setNo(five);
        
        three.setBack(one);
        three.setYes(six);
        three.setNo(seven);
        
        
        four.setBack(two);
        five.setBack(two);
        
        six.setBack(three);
        seven.setBack(three);
        
        final RootNode pointer = new RootNode(one);
        
        
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
            java.util.logging.Logger.getLogger(MotorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotorGUI(pointer).setVisible(true);
            }
        });
        
        
    }
}
