import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiagnosisPage implements ActionListener {
        int count=0;
        JLabel label;
        JFrame frame;
        JButton button;
        public DiagnosisPage() {
            frame=new JFrame();

            button=new JButton("Start");
            button.addActionListener(this);

            label=new JLabel("Number of clicks:0");

            JPanel panel =new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
            panel.setLayout(new GridLayout(0,1));
            panel.add(button);
            panel.add(label);
            panel.setBackground(Color.BLUE);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Disease Diagnoser");
            frame.pack();
            frame.setVisible(true);
        }
        public static void main(String[]args){
            new DiagnosisPage();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            label.setText("Number of clicks:" + count);

        }
    }

}
