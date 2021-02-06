package EADTEC;

import javax.swing.*;
import java.io.IOException;

public class CalculadoraDivisao1 {
    public static void main(String[] args) {
        Double num1, num2 = null ;

        while (num2 == null) {
            num1 = Double.valueOf(JOptionPane.showInputDialog("Insira o Dividendo"));
            num2 = Double.valueOf(JOptionPane.showInputDialog("Insira o Divisor"));
            JOptionPane.showMessageDialog(null,"O resultado é "+ num1 / num2);
        }
    }
}