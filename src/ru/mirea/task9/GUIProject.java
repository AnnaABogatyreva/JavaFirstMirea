package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIProject extends JFrame {
    private JFrame frame;
    private JButton b1, b2;
    private B1ActionListener b1AL;
    private B2ActionListener b2AL;
    private JLabel l1, l2, l3;

    public class B1ActionListener implements ActionListener {
        public int cnt;
        public void actionPerformed(ActionEvent e) {
            cnt++;
            l1.setText("Result: " + b1AL.cnt + " X " + b2AL.cnt);
            l2.setText("Last Scorer: Milan");
            if (b1AL.cnt > b2AL.cnt)
                l3.setText("Winner: Milan");
            else
                l3.setText("Winner: Madrid");
        }
    }

    public class B2ActionListener implements ActionListener {
        public int cnt;
        public void actionPerformed(ActionEvent e) {
            cnt++;
            l1.setText("Result: " + b1AL.cnt + " X " + b2AL.cnt);
            l2.setText("Last Scorer: Madrid");
            if (b1AL.cnt > b2AL.cnt)
                l3.setText("Winner: Milan");
            else
                l3.setText("Winner: Madrid");
        }
    }

    public GUIProject() {
        super("example");
        b1 = new JButton("Milan");
        b1.setBounds(40,20,85,20);
        b1AL = new B1ActionListener();
        b1.addActionListener(b1AL);
        add(b1);
        b2 = new JButton("Madrid");
        b2.setBounds(160,20,85,20);
        b2AL = new B2ActionListener();
        b2.addActionListener(b2AL);
        add(b2);

        l1 = new JLabel("Result: " + ((B1ActionListener)b1AL).cnt + " X " + ((B2ActionListener)b2AL).cnt);
        l1.setBounds(40,60,160,20);
        add(l1);
        l2 = new JLabel("Last Scorer: N/A");
        l2.setBounds(40,80,160,20);
        add(l2);
        l3 = new JLabel("Winner: DRAW");
        l3.setBounds(40,100,160,20);
        add(l3);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(300,200);
        setLayout(null);
        setVisible(true);
    }
}
