package EADTEC;

import javax.swing.*;

public class ProcedenciaProduto {
    public static void main(String[] args){
        int cod;
        String aux = "";

        aux = JOptionPane.showInputDialog("Digite o código de procedência do produto: ");
        cod = Integer.parseInt(aux);

        switch (cod){
            case 1:
                JOptionPane.showMessageDialog(null,"Sul");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Norte");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Leste");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Oeste");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Nordeste");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Sudeste");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Centro-Oeste");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"Noroeste");
                break;
        }
    }
}
