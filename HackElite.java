package twitterinformation;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HackElite {

    private JFrame frame;
    ImageIcon img = new ImageIcon("twitter.jpg");
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HackElite window = new HackElite();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
    * Create the application.
    */
    public HackElite() {
        initialize();
    }

    /**
    * Initialize the contents of the frame.
    */
    private void initialize() {
    
        frame = new JFrame();
        frame.setBounds(100, 100, 700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Twitter Sentiment Analysis");
        frame.setIconImage(img.getImage());
        
        JLabel lblWhatIsHackelites = new JLabel("What is HackElite's mood?");
        lblWhatIsHackelites.setHorizontalAlignment(SwingConstants.CENTER);
        lblWhatIsHackelites.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
        lblWhatIsHackelites.setBounds(12, 104, 658, 37);
        frame.getContentPane().add(lblWhatIsHackelites);
        
        JButton btnNewButton = new JButton("Find Mood");
        btnNewButton.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HackElite2.newScreen();
            }
        });
        btnNewButton.setBounds(275, 196, 129, 25);
        frame.getContentPane().add(btnNewButton);
    }
}