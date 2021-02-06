package EADTEC;

import javax.swing.*;

public class DescubraMesSe {
    public static void main(String[] args){
        int mes;
        String aux = "";

        aux = JOptionPane.showInputDialog("Digite um número de 0-12: ");
        mes = Integer.parseInt(aux);

        if(mes > 12){
            JOptionPane.showMessageDialog(null,"Este número não corresponde a um mês, tente novamente!");
        } if(mes == 1) {
            JOptionPane.showMessageDialog(null,"Janeiro");
        } if(mes == 2) {
            JOptionPane.showMessageDialog(null,"Fevereiro");
        } if(mes == 3) {
            JOptionPane.showMessageDialog(null,"Março");
        } if(mes == 4) {
            JOptionPane.showMessageDialog(null,"Abril");
        } if(mes == 5) {
            JOptionPane.showMessageDialog(null,"Maio");
        } if(mes == 6) {
            JOptionPane.showMessageDialog(null,"Junho");
        } if(mes == 7) {
            JOptionPane.showMessageDialog(null,"Julho");
        } if(mes == 8) {
            JOptionPane.showMessageDialog(null,"Agosto");
        } if(mes == 9) {
            JOptionPane.showMessageDialog(null, "Setembro");
        } if(mes == 10) {
            JOptionPane.showMessageDialog(null, "Outubro");
        } if(mes == 11) {
            JOptionPane.showMessageDialog(null, "Novembro");
        } if(mes == 12) {
            JOptionPane.showMessageDialog(null, "Dezembro");
        }
    }
}
