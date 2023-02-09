import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiagnosisPage implements ActionListener {
    int count = 0;
    JLabel label;
    JFrame frame;
    JButton button;

    public DiagnosisPage() {
        frame = new JFrame();

        button = new JButton("Exit");
        button.addActionListener(this);

        label = new JLabel("insert diagnosis here");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        panel.setBackground(Color.PINK);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Diagnosis Page");
        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new DiagnosisPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        EnterSymptomsPage() whatever =  new EnterSymptomsPage();
        whatever.theseAreSymptoms();
 //trying to call the "theseAreSymptoms" method here
        //  frame.dispose();

    }
}
