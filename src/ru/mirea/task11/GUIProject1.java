package ru.mirea.task11;

import ru.mirea.task11.GUIProject1;
import ru.mirea.task9.GUIProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIProject1 extends JFrame{
    private JFrame frame;
    private JButton b;
    private JTextField t;
    private JLabel l;

    public GUIProject1() {
        super("Угадайте число от 0 до 20");

        int num = (int)(Math.random() * 20);

        l = new JLabel("Искомое число: " + Integer.toString(num)); // тестовый режим, сразу выводится искомое число
        //l = new JLabel(" "); // заменить строку выше на эту для выхода из тестового режима
        l.setBounds(40,60,300,40);
        add(l);

        t = new JTextField();
        t.setBounds(40, 20, 85, 20);
        add(t);

        b = new JButton("Ввод");
        b.setBounds(40,40,85,20);
        final int[] cnt = {0};
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cnt[0] != 3) {
                    if (Integer.parseInt(t.getText()) > num) {
                        l.setText("Искомое число меньше введенного");
                        cnt[0]++;
                    } else if (Integer.parseInt(t.getText()) < num) {
                        l.setText("Искомое число больше введенного");
                        cnt[0]++;
                    } else {
                        l.setText("Число найдено!");
                    }
                }
                else
                    l.setText("Число не найдено за 3 попытки");
            }
        });
        add(b);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(350,200);
        setLayout(null);
        setVisible(true);
    }
}
