package ShowMessegeDialog;

import javax.swing.*;

public class Ch14ShowMessageDialog {
    public static void main(String[] args) {

        JFrame jFrame;

        jFrame= new JFrame();
        jFrame.setSize(400,300);
        jFrame.setVisible(true);

        JOptionPane.showMessageDialog(jFrame, "How Are You ?");
        JOptionPane.showMessageDialog(null, "Sampai Jumpa") ;
    }
}
