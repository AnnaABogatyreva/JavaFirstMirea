package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class ImagePainting extends Frame {

    public ImagePainting() {
        super("ImagePainting");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setSize(350, 300);
    }

    private Image img;

    public void loadImage(String src) {
        img = new ImageIcon(src).getImage();
    }
}
