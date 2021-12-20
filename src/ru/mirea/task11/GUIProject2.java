package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIProject2 extends JFrame {

    private JLabel l;
    private JPanel center;
    private JPanel west;
    private JPanel south;
    private JPanel north;
    private JPanel east;

    public GUIProject2() {
        super("Границы");

        l = new JLabel("+++");
        l.setBounds(5,5,190,20);
        add(l);

        center = new JPanel();
        center.setLayout(new BorderLayout());
        center.setBounds(50, 50, 100, 100);
        center.setVisible(true);
        center.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                l.setText("Добро пожаловать в CENTER");
            }
            public void mouseExited(MouseEvent e) {}
        });
        add(center);

        west = new JPanel();
        west.setLayout(new BorderLayout());
        west.setBounds(0, 50, 50, 100);
        west.setVisible(true);
        west.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                l.setText("Добро пожаловать в WEST");
            }
            public void mouseExited(MouseEvent e) {}
        });
        add(west);

        south = new JPanel();
        south.setLayout(new BorderLayout());
        south.setBounds(50, 150, 100, 50);
        south.setVisible(true);
        south.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                l.setText("Добро пожаловать в SOUTH");
            }
            public void mouseExited(MouseEvent e) {}
        });
        add(south);

        north = new JPanel();
        north.setLayout(new BorderLayout());
        north.setBounds(50, 0, 100, 50);
        north.setVisible(true);
        north.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                l.setText("Добро пожаловать в NORTH");
            }
            public void mouseExited(MouseEvent e) {}
        });
        add(north);

        east = new JPanel();
        east.setLayout(new BorderLayout());
        east.setBounds(150, 50, 50, 100);
        east.setVisible(true);
        east.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                l.setText("Добро пожаловать в EAST");
            }
            public void mouseExited(MouseEvent e) {}
        });
        add(east);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(200,200);
        setLayout(null);
        setVisible(true);
    }
}
