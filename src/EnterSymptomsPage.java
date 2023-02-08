import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterSymptomsPage implements ActionListener {
    int count = 0;
    JLabel label;
    JFrame frame;
    JButton button;
    JTextField textField;

    public EnterSymptomsPage() {
        frame = new JFrame();

        button = new JButton("Click Here To Get Your Diagnosis!");
        button.addActionListener(this);
        label = new JLabel("Please enter symptoms below. Remember that the more symptoms you give, the more accurate of a diagnosis the machine can give you. Please seperate symptoms with a comma");
        textField = new JTextField();

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        panel.add(textField);
        panel.setBackground(Color.RED);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Enter Symptoms Page");
        frame.pack();
        frame.setVisible(true);

        //textField.setFont(times new roman);

    }

    public static void main(String[] args) {
        new EnterSymptomsPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        DiagnosisPage DiagnosisPage1 = new DiagnosisPage();

    }
}
