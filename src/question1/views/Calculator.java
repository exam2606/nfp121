package question1.views;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class Calculator {
    private JLabel jLabel;
    private JLabel jLabelResult;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JButton jButton0;
    private JButton jButtonPlus;
    private JButton jButtonMinus;
    private JButton jButtonEqual;

    public Calculator() {
        JFrame window = new JFrame();
        window.setTitle("Calculator");
        window.setSize(400, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        JPanel jPanel = new JPanel(new GridLayout(3,1));
        jPanel.setBorder(new EmptyBorder(4,4,4,4));

        JPanel panelDisplay = new JPanel(new GridLayout(2,2));
        this.jLabel = new JLabel();
        panelDisplay.add(new JLabel("Input"));
        panelDisplay.add(this.jLabel);
        this.jLabelResult = new JLabel();
        panelDisplay.add(new JLabel("Result"));
        panelDisplay.add(this.jLabelResult);
        jPanel.add(panelDisplay);

        JPanel panelButtons = new JPanel(new GridLayout(4,4,4,4));
        this.jButton1 = new JButton("1");
        panelButtons.add(this.jButton1);
        this.jButton2 = new JButton("2");
        panelButtons.add(this.jButton2);
        this.jButton3 = new JButton("3");
        panelButtons.add(this.jButton3);
        this.jButtonPlus = new JButton("+");
        panelButtons.add(this.jButtonPlus);
        this.jButton4 = new JButton("4");
        panelButtons.add(this.jButton4);
        this.jButton5 = new JButton("5");
        panelButtons.add(this.jButton5);
        this.jButton6 = new JButton("6");
        panelButtons.add(this.jButton6);
        this.jButtonMinus = new JButton("-");
        panelButtons.add(this.jButtonMinus);
        this.jButton7 = new JButton("7");
        panelButtons.add(this.jButton7);
        this.jButton8 = new JButton("8");
        panelButtons.add(this.jButton8);
        this.jButton9 = new JButton("9");
        panelButtons.add(this.jButton9);
        this.jButtonEqual = new JButton("=");
        panelButtons.add(this.jButtonEqual);
        this.jButton0 = new JButton("0");
        panelButtons.add(this.jButton0);
        jPanel.add(panelButtons);
        // add the panel to the window
        window.add(jPanel);
        // display the window
        window.setVisible(true);
    }

    public JLabel getJLabel() {
        return this.jLabel;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public JButton getjButton5() {
        return jButton5;
    }

    public JButton getjButton6() {
        return jButton6;
    }

    public JButton getjButton7() {
        return jButton7;
    }

    public JButton getjButton8() {
        return jButton8;
    }

    public JButton getjButton9() {
        return jButton9;
    }

    public JButton getjButton0() {
        return jButton0;
    }

    public JButton getjButtonPlus() {
        return jButtonPlus;
    }

    public JButton getjButtonMinus() {
        return jButtonMinus;
    }

    public JButton getjButtonEqual() {
        return jButtonEqual;
    }

    public JLabel getJLabelResult() {
        return jLabelResult;
    }
}
