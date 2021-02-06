package EADTEC;

import javax.swing.*;
import java.util.Scanner;

public class ClassificaPrioridadeFila {
    public static void main (String[] args) {
        int idade;
        String aux = "";

        aux = JOptionPane.showInputDialog("Informe sua Idade: ");
        idade = Integer.parseInt(aux);

        if(idade >= 60){
            if (idade >= 80){
                JOptionPane.showMessageDialog(null,"Fila 80+");
            } else {
                JOptionPane.showMessageDialog(null,"Fila Prioritária");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Fila Comum");
        }
    }
}
