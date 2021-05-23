package question1.controllers;

import question1.models.Number;
import question1.services.MinusStrategy;
import question1.services.PlusStrategy;
import question1.services.Strategy;
import question1.views.Calculator;

import javax.swing.*;

public class Calculation {

    private Number number;
    private Strategy strategy;
    private Calculator view;

    public void calcul() {
        view = new Calculator();

        view.getjButton0().addActionListener(actionEvent -> {
            view.getJLabel().setText(view.getJLabel().getText() + "0");
        });
        view.getjButton1().addActionListener(actionEvent -> {
            view.getJLabel().setText(view.getJLabel().getText() + "1");
        });
        view.getjButton2().addActionListener(actionEvent -> {
            view.getJLabel().setText(view.getJLabel().getText() + "2");
        });
        view.getjButton3().addActionListener(actionEvent -> {
            view.getJLabel().setText(view.getJLabel().getText() + "3");
        });
        view.getjButton4().addActionListener(actionEvent -> {
            view.getJLabel().setText(view.getJLabel().getText() + "4");
        });
        view.getjButton5().addActionListener(actionEvent -> {
            view.getJLabel().setText(view.getJLabel().getText() + "5");
        });
        view.getjButton6().addActionListener(actionEvent -> {
            view.getJLabel().setText(view.getJLabel().getText() + "6");
        });
        view.getjButton7().addActionListener(actionEvent -> {
            view.getJLabel().setText(view.getJLabel().getText() + "7");
        });
        view.getjButton8().addActionListener(actionEvent -> {
            view.getJLabel().setText(view.getJLabel().getText() + "8");
        });
        view.getjButton9().addActionListener(actionEvent -> {
            view.getJLabel().setText(view.getJLabel().getText() + "9");
        });

        view.getjButtonPlus().addActionListener(actionEvent -> {
            // use strategy
        });

        view.getjButtonMinus().addActionListener(actionEvent -> {
            // use strategy
        });

        view.getjButtonEqual().addActionListener(actionEvent -> {
            if(this.number != null) {
                if(strategy != null) {
                    this.number = this.doCalculation(this.number, Integer.parseInt(view.getJLabel().getText()), view.getJLabel(), view.getJLabelResult());
                }
                // erase text
                view.getJLabel().setText("");
                // display result
                view.getJLabelResult().setText(String.valueOf(this.number.getValue()));
                this.number = null;
            }
        });

    }

    public Number doCalculation(Number number, int value, JLabel input, JLabel result) {
        return strategy.doCalculation(number, value, input, result);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Calculator getView() {
        return view;
    }

    public Number getNumber() {
        return number;
    }
}
