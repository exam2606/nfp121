package question1.services;

import question1.models.Number;

import javax.swing.*;

public interface Strategy {
    Number doCalculation(Number number, int value, JLabel input, JLabel result);
}
