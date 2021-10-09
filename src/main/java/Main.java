package Dz8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    int counter = 0;

    public Main(){
        setTitle("First app");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300,300, 300);

        JLabel label = new JLabel();

        setLayout(new GridLayout(1,3));

        JButton buttonMinus = new JButton("-");

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                label.setText(String.valueOf(counter));
            }
        });


        JButton buttonPlus = new JButton("+");

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText(String.valueOf(counter));
            }
        });

        add(buttonMinus);
        add(label);
        add(buttonPlus);


        setVisible(true);
    }


    public static void main(String[] args) {
        new Main();


    }


}
