
package atm.simulation.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class RadioButton {

    public JFrame jFrame;
    
    JButton jButton;
   
    JRadioButton jRadioButton1,jRadioButton2;
    public RadioButton() {
        jFrame=new JFrame("Demo for Radio Button");
        jFrame.setSize(500,500);
        
        jRadioButton1 =new JRadioButton("Male");
        jRadioButton1.setBounds(50,50,100,40);
        jFrame.add(jRadioButton1);
        
        jRadioButton2 =new JRadioButton("Female");
        jRadioButton2.setBounds(50,100,100,40);
        jFrame.add(jRadioButton2);
        
        ButtonGroup group=new ButtonGroup();
        group.add(jRadioButton1);
        group.add(jRadioButton2);
        
        jButton =new JButton("Total ",new ImageIcon("/home/kali/Downloads/148-1481404_clipart-small-size-image-download-hd-png-download.png"));
        jButton.setBounds(50, 200,200, 40);
        jFrame.add(jButton);
        
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           if(jRadioButton1.isSelected())
               JOptionPane.showMessageDialog(jFrame, " You are Male");
           else if(jRadioButton2.isSelected())
               JOptionPane.showMessageDialog(jFrame, "You are FeMale");
            }
        });
        
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }
    
    
public static void main(String arg[]){
    RadioButton r=new RadioButton();
}    
}
