package ru.mirea.task11;

import ru.mirea.task11.GUIProject1;
import ru.mirea.task9.GUIProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIProject3 extends JFrame {

    private static final long serialVersionUID = 1L;
    public JTextArea area;
    private JMenuBar menuBar;
    private JPanel contents;
    private JMenu font;
    private JMenu color;

    public GUIProject3() {
        super("Простейший текстовый редактор");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Создание строки главного меню
        menuBar = new JMenuBar();

        // Подключаем меню к интерфейсу приложения
        setJMenuBar(menuBar);

        // Cоздание многострочных полей
        area = new JTextArea("Многострочное поле", 10, 20);
        // Шрифт и табуляция
        area.setFont(new Font("Dialog", Font.PLAIN, 16));
        //area.setForeground(Color.RED);
        // Добавим поля в окно
        contents = new JPanel();
        contents.add(new JScrollPane(area));
        setContentPane(contents);

        // Добавление в главное меню выпадающих пунктов меню
        menuBar.add(createFontMenu(area));
        menuBar.add(createColorMenu(area));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(400, 350);
        //setLayout(null);
        setVisible(true);
    }

    private JMenu createFontMenu(JTextArea area) {
        font = new JMenu("Шрифт");
        JRadioButtonMenuItem font1 = new JRadioButtonMenuItem("Шрифт 1");
        JRadioButtonMenuItem font2 = new JRadioButtonMenuItem("Шрифт 2");
        JRadioButtonMenuItem font3 = new JRadioButtonMenuItem("Шрифт 3");

        ButtonGroup bg = new ButtonGroup();
        bg.add(font1);
        bg.add(font2);
        bg.add(font3);

        font.add(font1);
        font.add(font2);
        font.add(font3);

        font1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                area.setFont(new Font("Serif", Font.PLAIN, 16));
            }
        });

        font2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                area.setFont(new Font("Dialog", Font.PLAIN, 16));
            }
        });

        font3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                area.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
            }
        });

        return font;
    }

    private JMenu createColorMenu(JTextArea tArea) {
        color = new JMenu("Цвет");
        JRadioButtonMenuItem color1 = new JRadioButtonMenuItem("Черный");
        JRadioButtonMenuItem color2 = new JRadioButtonMenuItem("Синий");
        JRadioButtonMenuItem color3 = new JRadioButtonMenuItem("Красный");

        ButtonGroup bg = new ButtonGroup();
        bg.add(color1);
        bg.add(color2);
        bg.add(color3);

        color.add(color1);
        color.add(color2);
        color.add(color3);

        color1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                area.setForeground(Color.BLACK);
            }
        });

        color2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                area.setForeground(Color.BLUE);
            }
        });

        color3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                area.setForeground(Color.RED);
            }
        });

        return color;
    }
}