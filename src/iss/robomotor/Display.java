/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iss.robomotor;

import java.awt.FlowLayout;

import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author nitinpkumar
 */
public class Display extends JFrame{
    
    
    JPanel panel;
    JTextArea textArea;
    JScrollPane scrollPane;
    JButton okayButton;
    
    private String getFormatedText(String data){
    
        String text = data.replace("{", "").replace("}", "");
        String[] texts = text.split(",");
        StringBuilder sb = new StringBuilder();
        for (String t : texts){
            sb.append(t);
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public Display(HashMap<String,String> map) {
       
       
       panel = new JPanel();
       panel.setLayout(new FlowLayout());
       
       textArea = new JTextArea(5, 20);
       scrollPane  = new JScrollPane(textArea); 
       textArea.setEditable(false);
       textArea.setText(getFormatedText(map.toString()));
       
       okayButton = new JButton("Okay Dude!");
       okayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                  setVisible(false); //you can't see me!
                  dispose();
            }
        });
       
       panel.add(textArea);
       panel.add(okayButton);
       
       this.getContentPane().add(panel);
       setTitle("Suggestion!");
       setSize(400, 300);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);        
       setVisible(true);
    }
    
    /*
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Display ex = new Display(null);
                ex.setVisible(true);
            }
        });
    }
    */
}
