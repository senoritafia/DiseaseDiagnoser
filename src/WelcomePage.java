import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WelcomePage implements ActionListener{
    int count=0;
    JLabel label;
    JFrame frame;
    JButton button;

    public WelcomePage() {
        frame=new JFrame();

        button=new JButton("Start");
        button.addActionListener(this);
        button.setSize(300,100);

        label=new JLabel("Welcome To The Disease Diagnoser!");

        JPanel panel =new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        panel.setBackground(Color.BLUE);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Welcome Page");
        frame.pack();
        frame.setVisible(true);


    }
    public static void main(String[]args){
        new WelcomePage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        EnterSymptomsPage EnterSymptomsPage1 = new EnterSymptomsPage();
    }
}
