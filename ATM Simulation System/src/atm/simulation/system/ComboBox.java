/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.simulation.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ComboBox {
     public JFrame jFrame;
    
    JButton jButton;
    
    public ComboBox(){
       jFrame=new JFrame("Demo for ComboBox Button");
        jFrame.setSize(500,500);
        
        String words[]={"Mumbai","Pune","Mysore","Ratnagiri"};
        JComboBox jComboBox=new JComboBox(words);
        jComboBox.setBounds(60, 50, 100, 40);
        jFrame.add(jComboBox);
        
        jButton =new JButton("Click me");
        jButton.setBounds(80,150,150,40);
        jFrame.add(jButton);
        
        JLabel jLabel =new JLabel("");
        jLabel.setBounds(80,80,250,40);
        jFrame.add(jLabel);
        
        jButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               jLabel.setText("You selected city is "+jComboBox.getItemAt(jComboBox.getSelectedIndex()));
//               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               System.out.println("working...");
           }
       });
        
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    
}
    public static void main(String args[]){
      new ComboBox();
    }
   
}
