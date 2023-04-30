import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;



public class PasswordGenerator extends JFrame {
    private JPanel MainPanel;
    private JPanel SubPanel;
    private JTextField t1;
    private JButton generatePasswordButton;


    public PasswordGenerator() {

        generatePasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String lower = "abcdefghijklmnopqrstuvwxyz";
                String special = "~!@#$%^&*()_=";
                String num = "0123456789";
                String combination = upper + lower + num + special;
                int len = 8;
                StringBuilder st = new StringBuilder();
                //char[] password=new char[len];
                Random r = new Random();
                for (int i = 0; i < len; i++) {

                    st.append(combination.charAt(r.nextInt(combination.length())));
                }
                t1.setText(st.toString());
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("PasswordGenerator");
        frame.setContentPane(new PasswordGenerator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}












