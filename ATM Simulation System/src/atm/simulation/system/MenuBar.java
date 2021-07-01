
package atm.simulation.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MenuBar  implements ActionListener{
    
    public JFrame jFrame;
    JMenuBar jMenuBar;
    JMenu file,edit,format,submenu;
    JMenuItem save,exit,zoom,cut,copy,paste,delete,check;
    JTextArea jTextArea;
    
    public MenuBar(){
        jFrame=new JFrame("This is for Menu bar");
        jFrame.setSize(500,500);
        
        
      jMenuBar = new JMenuBar();
      
      file=new JMenu("File");
      
      save  =new JMenuItem("Save");
      exit = new JMenuItem("Exit");
      file.add(save);
      file.add(exit);
      
      edit =new JMenu("Edit");
      
      cut= new JMenuItem("Cut");
      copy=new JMenuItem("Copy");
      paste=new JMenuItem("Paste");
      edit.add(cut);
      edit.add(copy);
      edit.add(paste);
              
      
      
      format = new JMenu("Format");
     zoom=new JMenuItem("Zoom");
     format.add(zoom);
     
     submenu =new JMenu("Submenu");
     
     delete =new JMenuItem("delete");
     check =new JMenuItem("Check");
     submenu.add(delete);
     submenu.add(check);
     file.add(submenu);
      
      
      
      jMenuBar.add(file);
      jMenuBar.add(edit);
      jMenuBar.add(format);
      
      jFrame.add(jMenuBar);
      jFrame.setJMenuBar(jMenuBar);
      
      jTextArea =new JTextArea();
      jTextArea.setBounds(0, 0,500 , 500);
      jFrame.add(jTextArea);
      
      
      cut.addActionListener(this);
      copy.addActionListener(this);
      paste.addActionListener(this);
      
      exit.addActionListener((ActionEvent e) -> {
          System.out.println(".actionPerformed()");
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
int a=JOptionPane.showConfirmDialog(jFrame, "Do you want to close");
if(a==JOptionPane.YES_OPTION){
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
        });
//    List,button,radiobutton,combo box,checkbox,TextArealogin fields(password etc)
//        jFrame.setLayout(null);
  jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);      
jFrame.setVisible(true);
      
//        jFrame.
        
    }
//    Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==cut){
                    jTextArea.cut();
                }
                if(e.getSource()==copy){
                    jTextArea.copy();
                }
                if(e.getSource()==paste){
                    jTextArea.paste();
                }
            }
    public static void main(String ars[]){
    MenuBar k=new MenuBar();
    }
    
}
