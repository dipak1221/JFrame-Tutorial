package atm.simulation.system;

import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ATMSimulationSystem implements ActionListener {

    public JFrame jFrame;
    public JTextArea jTextArea;
    public JLabel jLabel;
    public JCheckBox jCheckBox1, jCheckBox2, jCheckBox3;
    public JButton jButton;

    public ATMSimulationSystem() {
        jFrame = new JFrame("This is new JFrame");
        jFrame.setSize(600, 400);

        jLabel = new JLabel("Food Items ");
        jLabel.setBounds(50, 50, 300, 30);
        jFrame.add(jLabel);

        jCheckBox1 = new JCheckBox("Pizza 100 ");
        jCheckBox1.setBounds(70, 90, 200, 30);
        jFrame.add(jCheckBox1);

        jCheckBox2 = new JCheckBox("Burger 50 ");
        jCheckBox2.setBounds(70, 120, 200, 30);
        jFrame.add(jCheckBox2);

        jCheckBox3 = new JCheckBox("Freinkey 30 ");
        jCheckBox3.setBounds(70, 150, 200, 30);
        jFrame.add(jCheckBox3);

        jButton = new JButton("Total amount ");
        jButton.setBounds(90, 200, 200, 40);
        jFrame.add(jButton);

        jButton.addActionListener(this);
//        l jFrame
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

    }
//            @Override

    public void actionPerformed(ActionEvent e) {
        
            float amount = 0;
            String msg = "";
            if(jCheckBox1.isSelected()){
                msg+="Pizza 100\n";
                amount+=100;}
            if(jCheckBox2.isSelected()){
            msg+="Burger 50\n";
            amount+=50;
            }
            if(jCheckBox3.isSelected()){
                msg+="Frenkey 30\n";
                amount+=30;
            }
            
            msg+="-----------------\n";
            JOptionPane.showMessageDialog(jFrame, msg+"Total Amount is "+amount);
        }
        //    
        //    public void actionPerformed(ActionEvent e) {
        //        String text = jTextArea.getText();
        //        int wordLength = 0;
        //        if (text.length() != 0) {
        //            String word[] = text.split(" ");
        //            wordLength = word.length;
        //        }
        //
        //        jLabel.setText("Total character are " + text.length() + " and total words are " + wordLength);
        ////throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //    }

    public static void main(String[] args) {

        ATMSimulationSystem o = new ATMSimulationSystem();

    }

}
