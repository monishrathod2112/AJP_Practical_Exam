import javax.swing.*;
import java.awt.*;

public class Practical_8 extends JFrame {

    private JProgressBar progressBar;
    private int progress = 0;

    public Practical_8() {
      
        setTitle("JProgressBar Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        progressBar = new JProgressBar(0, 100); 
        progressBar.setValue(0); 
        progressBar.setStringPainted(true);
        progressBar.setForeground(new Color(76, 175, 80)); 

        
        add(progressBar, BorderLayout.CENTER);

        JButton startButton = new JButton("Start Progress");
        startButton.addActionListener(e -> startProgress());
        add(startButton, BorderLayout.SOUTH);

       
        setVisible(true);
    }

    private void startProgress() {
        Timer timer = new Timer(50, e -> {
            if (progress < 100) {
                progress++;
                progressBar.setValue(progress);
            } else {
                ((Timer) e.getSource()).stop(); 
                JOptionPane.showMessageDialog(this, "Progress Complete!");
            }
        });
        timer.start(); 
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(Practical_8::new);
    }
}
