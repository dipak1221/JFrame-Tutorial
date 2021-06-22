
package javaapplication2;

import javax.swing.JFrame;


public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("This is new JFrame my");
        
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }
    
}
