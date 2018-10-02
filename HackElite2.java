package twitterinformation;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HackElite2 {

    analy ana = new analy();
    
    private JFrame frame;

    ImageIcon img = new ImageIcon("twitter.jpg");
    /**
    * Launch the application.
    */
    public static void newScreen() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HackElite2 window = new HackElite2();
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
    public HackElite2() {
        initialize();
    }

    /**
    * Initialize the contents of the frame.
    */
    private void initialize() {
        String msg1 = "";
        String msg2 = "";
        frame = new JFrame();
        frame.setBounds(100, 100, 700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Change your mood and always be Happy!!!");
        frame.setIconImage(img.getImage());
        
        if(ana.hper > ana.sper)
        {
            msg1 = "HackElite is happy!!!!!";
            msg2 = "Click this button to elevate your mood!!";
        }
        else 
        {
            msg1 = "HackElite is not that happy.....";
            msg2 = "You don't seem to be in a great mood. Click this button to feel better..";
        }
        
        
        
        JLabel lblNewLabel = new JLabel(msg1);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 18));
        lblNewLabel.setBounds(12, 69, 658, 35);
        frame.getContentPane().add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Change your mood");
        btnNewButton.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(ana.hper > ana.sper)
                    openWebPage("https://www.youtube.com/playlist?list=PLHIKDMzslNOI1wqlOXFSxUMfYiCwspXVy");
                else 
                    openWebPage("https://www.youtube.com/playlist?list=PLhXQhpqBNAYsiwGQ6e4rxgbQ0gGVfKZ2u");
            }
        });
        btnNewButton.setBounds(248, 237, 186, 43);
        frame.getContentPane().add(btnNewButton);
        
        JLabel lblBetterYourMood = new JLabel(msg2);
        lblBetterYourMood.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
        lblBetterYourMood.setHorizontalAlignment(SwingConstants.CENTER);
        lblBetterYourMood.setBounds(12, 207, 648, 16);
        frame.getContentPane().add(lblBetterYourMood);
        
        JLabel lblNewLabel_1 = new JLabel("Happy = " + ana.hper);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(12, 146, 658, 16);
        frame.getContentPane().add(lblNewLabel_1);
        
        JLabel lblSad = new JLabel("Sad = " + ana.sper);
        lblSad.setHorizontalAlignment(SwingConstants.CENTER);
        lblSad.setBounds(12, 117, 658, 16);
        frame.getContentPane().add(lblSad);
    }
    public void openWebPage(String url){
        try {         
          java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
          System.out.println(ana.hper);
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
     }
}