package EADTEC;

import javax.swing.*;

public class CalculadoraDivisao2 {
    public static void main(String[] args) {
        Double num1 = null, num2 = null ;
            do {
                num1 = Double.valueOf(JOptionPane.showInputDialog("Insira o dividendo: "));
                num2 = Double.valueOf(JOptionPane.showInputDialog("Insira o divisor: "));
                if (num2 != 0) {
                    JOptionPane.showMessageDialog(null, "O resultado é " + num1 / num2);
                }
            } while (num2 != 0);
        JOptionPane.showMessageDialog(null, "Você saiu do programa!");
    }
}

/*
CalculadoraDivisão
    declare
    num1, num2 como Real

    Início
    Repita
        escreva ("Insira o Divisor: ")
        leia (num1)
        escreva ("Insira o Dividendo" )
        leia (num2)
            Se(num2 <> 0) Então
                Escreva ("O resultado é" + num1 / num2)
            FimSe
    Até Que (num2 = 0)
    escreva ("Você saiu do programa")
    Fim
 */