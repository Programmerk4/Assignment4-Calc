import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    
    private JButton[] buttons = new JButton[16];
    private JTextField display = new JTextField(20);

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        Font calcFont = new Font("times",Font.ITALIC,50);
        

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        // Add buttons manually
        buttons[0] = new JButton("7");
        buttons[0].setForeground(Color.BLACK);
        buttons[0].setBackground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(buttons[0], gbc);

        buttons[1] = new JButton("8");
        buttons[1].setForeground(Color.BLACK);
        buttons[1].setBackground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(buttons[1], gbc);

        buttons[2] = new JButton("9");
        buttons[2].setForeground(Color.BLACK);
        buttons[2].setBackground(Color.WHITE);
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(buttons[2], gbc);

        buttons[3] = new JButton("÷");
        buttons[3].setForeground(Color.WHITE);
        buttons[3].setBackground(Color.BLUE);
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(buttons[3], gbc);

        buttons[4] = new JButton("4");
        buttons[4].setForeground(Color.BLACK);
        buttons[4].setBackground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(buttons[4], gbc);

        buttons[5] = new JButton("5");
        buttons[5].setForeground(Color.BLACK);
        buttons[5].setBackground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(buttons[5], gbc);

        buttons[6] = new JButton("6");
        buttons[6].setForeground(Color.BLACK);
        buttons[6].setBackground(Color.WHITE);
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(buttons[6], gbc);

        buttons[7] = new JButton("×");
        buttons[7].setForeground(Color.WHITE);
        buttons[7].setBackground(Color.BLUE);
        gbc.gridx = 3;
        gbc.gridy = 2;
        add(buttons[7], gbc);

        buttons[8] = new JButton("1");
        buttons[8].setForeground(Color.BLACK);
        buttons[8].setBackground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(buttons[8], gbc);

        buttons[9] = new JButton("2");
        buttons[9].setForeground(Color.BLACK);
        buttons[9].setBackground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(buttons[9], gbc);

        buttons[10] = new JButton("3");
        buttons[10].setForeground(Color.BLACK);
        buttons[10].setBackground(Color.WHITE);
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(buttons[10], gbc);

        buttons[11] = new JButton("-");
        buttons[11].setForeground(Color.WHITE);
        buttons[11].setBackground(Color.BLUE);
        gbc.gridx = 3;
        gbc.gridy = 3;
        add(buttons[11], gbc);

    buttons[12] = new JButton("AC");
    buttons[12].setForeground(Color.BLACK);
    buttons[12].setBackground(Color.YELLOW);
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(buttons[12], gbc);

    buttons[13] = new JButton("0");
    buttons[13].setForeground(Color.BLACK);
    buttons[13].setBackground(Color.WHITE);
    gbc.gridx = 2;
    gbc.gridy = 4;
    add(buttons[13], gbc);

    buttons[14] = new JButton("=");
    buttons[14].setForeground(Color.RED);
    buttons[14].setBackground(Color.WHITE);
    gbc.gridx = 3;
    gbc.gridy = 3;
    add(buttons[14], gbc);

    buttons[15] = new JButton("+");
    buttons[15].setForeground(Color.WHITE);
    buttons[15].setBackground(Color.BLUE);
    gbc.gridx = 3;
    gbc.gridy = 4;
    add(buttons[15], gbc);

    display.setEditable(false);
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 4;
    add(display, gbc);

    //for (int i = 0; i < 16; i++) {
    //    buttons[i].addActionListener(this);
    // }
}

public static void main(String[] args) {
    Calculator calc = new Calculator();
    calc.setVisible(true);
}
}
