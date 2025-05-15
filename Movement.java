package com.tutorial;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Movement extends JPanel implements ActionListener, KeyListener{
    private int x, y;
    private final int speed = 5;
    private Timer timer;

    public Movement(){
        y = 50;
        x = 50;
        timer = new Timer(10, this);
        timer.start();

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);

    }

    @Override
    public void keyReleased(KeyEvent e){

    }

    @Override
    public void actionPerformed(ActionEvent e){
        repaint();
    }
    @Override
    public void keyTyped(KeyEvent a){

    }
    @Override
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT){
            x -= speed;
        }else if (key == KeyEvent.VK_RIGHT){
            x += speed;
        }else if (key == KeyEvent.VK_UP){
            y -= speed;
        }else if (key == KeyEvent.VK_DOWN){
            y += speed;
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("nama program");
        Movement panel = new Movement();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
