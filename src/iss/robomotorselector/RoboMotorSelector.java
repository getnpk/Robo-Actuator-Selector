/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iss.robomotorselector;

import iss.motords.RootNode;
import iss.motords.Node;
import iss.robomotor.MotorGUI;
import java.util.HashMap;

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
        Node one = new Node("Will you be using DC?");
        Node two = new Node("Do you need a high starting torque?");
        Node three = new Node("Do you require a high speed motor?");
        Node four = new Node("A motor of the smaller dimension?");
        
        Node five = new Node("AC motor!", 101);
        Node six = new Node("PMDC motor!", 102);
        Node seven = new Node("BLDC motor!", 103);
        
        
        Node aone = new Node("High duty load cycle?",201);
        Node atwo = new Node("High motor life expectancy?",202);
        Node athree = new Node("Should it withstand high temperature?",203);
        Node afour = new Node("Less noisy environment?",204);
                
        Node bone = new Node("High duty load cycle?",201);
        Node btwo = new Node("High motor life expectancy?",202);
        Node bthree = new Node("Should it withstand high temperature?",203);
        Node bfour = new Node("Less noisy environment?",204);
        
        Node cone = new Node("High duty load cycle?",201);
        Node ctwo = new Node("High motor life expectancy?",202);
        Node cthree = new Node("Should it withstand high temperature?",203);
        Node cfour = new Node("Less noisy environment?",204);        
        
        one.setBack(null);
        one.setYes(two);
        one.setNo(five);
        
        two.setBack(one);
        two.setYes(three);
        two.setNo(five);
        
        three.setBack(two);
        three.setYes(four);
        three.setNo(six);
        
        four.setBack(three);
        four.setYes(seven);
        four.setNo(six);
        
        six.setBack(three);
        five.setBack(one);
        seven.setBack(four);
        
        
        //Extra innnings for BLDC motor!
        seven.setYes(aone);
        seven.setNo(aone);
        
        aone.setBack(seven);
        aone.setYes(atwo);
        aone.setNo(atwo);
        
        atwo.setBack(aone);
        atwo.setYes(athree);
        atwo.setNo(athree);
        
        athree.setBack(atwo);
        athree.setYes(afour);
        athree.setNo(afour);
        
        afour.setBack(athree);
        //////////////////////////////////////////
        
        
        //Extra innnings for PMDC motor!
        six.setYes(bone);
        six.setNo(bone);
        
        bone.setBack(six);
        bone.setYes(btwo);
        bone.setNo(btwo);
        
        btwo.setBack(bone);
        btwo.setYes(bthree);
        btwo.setNo(bthree);
        
        bthree.setBack(btwo);
        bthree.setYes(bfour);
        bthree.setNo(bfour);
        
        bfour.setBack(bthree);
        //////////////////////////////////////////
        
        
        //Extra innnings for AC motor!
        five.setYes(cone);
        five.setNo(cone);
        
        cone.setBack(five);
        cone.setYes(ctwo);
        cone.setNo(ctwo);
        
        ctwo.setBack(cone);
        ctwo.setYes(cthree);
        ctwo.setNo(cthree);
        
        cthree.setBack(ctwo);
        cthree.setYes(cfour);
        cthree.setNo(cfour);
        
        cfour.setBack(cthree);
        //////////////////////////////////////////
        
        
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
                MotorGUI gui = new MotorGUI(pointer);
                gui.setVisible(true);
                ///System.out.println(gui.getMap().get("MOTOR_TYPE"));
            }
            
            
        });
        
        
    }
}
