package atm.simulation.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ListItem {
    public ListItem(){
        JFrame jFrame =new JFrame("List in JFrame");
        DefaultListModel<String> l1= new DefaultListModel<String>();
        l1.addElement("Dipak Gautam");
        l1.addElement("Ram yadav");
        l1.addElement("John Verdict");
        l1.addElement("Alice Yal");
        
        JList jList =new JList(l1);
        jList.setBounds(100,100,150,75);
        jFrame.add(jList);
        
        JLabel jLabel=new JLabel();
        jLabel.setBounds(50,50,200,35);
        jFrame.add(jLabel);
        
        JButton jButton=new JButton("Click me");
        jButton.setBounds(250,150,150,40);
        jFrame.add(jButton);
        
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           jLabel.setText((String)jList.getSelectedValue());
            }
        });
        
      jFrame.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent w){
             int a=JOptionPane.showConfirmDialog(jFrame, "Do you want to Exit!");
             if(a==JOptionPane.YES_OPTION)
                 jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }
});
//        jLabel.setText((String)jList.getSelectedValue());
                
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
           jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);
       
    }
    
    public static void main(String args[]){
        new ListItem();
    }
    
}
