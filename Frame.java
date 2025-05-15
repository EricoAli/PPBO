package com.tutorial;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame implements ActionListener {

    private JButton button;
    private JTextField field;

    public Frame() {
        JFrame frame = new JFrame();
        frame.setTitle("nama program");
        frame.setSize(750, 750);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setVisible(true);

        /* ImageIcon icon = new ImageIcon("res/OIP(1).jpg");
        frame.setIconImage(icon.getImage());

        //button
        button = new JButton("tekan saya");
        button.setFocusable(false);
        button.setBounds(0, 0, 120, 50);
        button.addActionListener(this);

        //field
        field = new JTextField();
        field.setBounds(130, 10, 250, 50);
        field.setPreferredSize(new Dimension(250, 50));

        frame.add(button);
        frame.add(field); */

        //panel
/*        JPanel panel = new JPanel();
       panel.setBounds(0, 0, 250, 250);
       panel.setBackground(Color.CYAN);
       panel.setBorder(BorderFactory.createDashedBorder(Color.yellow, 10, 5));

       frame.add(panel); */


        //panel
       /* JPanel bluePanel = new JPanel();
       bluePanel.setBackground(Color.BLUE);
       bluePanel.setPreferredSize(new Dimension(100, 100));

       JPanel redPanel = new JPanel();
       redPanel.setBackground(Color.red);
       redPanel.setPreferredSize(new Dimension(100, 100));

       JPanel orangePanel = new JPanel();
       orangePanel.setBackground(Color.orange);
       orangePanel.setPreferredSize(new Dimension(100, 100));

       JPanel yellowPanel = new JPanel();
       yellowPanel.setBackground(Color.yellow);
       yellowPanel.setPreferredSize(new Dimension(100, 100));

       JPanel greenPanel = new JPanel();
       greenPanel.setBackground(Color.green);
       greenPanel.setPreferredSize(new Dimension(100, 100));

       frame.add(bluePanel, BorderLayout.NORTH);
       frame.add(redPanel, BorderLayout.EAST);
       frame.add(orangePanel, BorderLayout.WEST);
       frame.add(yellowPanel, BorderLayout.SOUTH);
       frame.add(greenPanel, BorderLayout.CENTER); */

        //button
/*        frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1"));
       frame.add(new JButton("1")); */

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Menekan tombol. Isi teks: " + field.getText());
            field.setEditable(false);
            button.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        new Frame();
    }
}
