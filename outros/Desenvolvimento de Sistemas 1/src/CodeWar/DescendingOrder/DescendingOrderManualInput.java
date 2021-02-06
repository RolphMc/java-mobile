package CodeWar.DescendingOrder;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrderManualInput {
    public static void main (String [] args) {
        List array = new ArrayList();
        String input;
        String output = new String();
        Integer length;

        input = JOptionPane.showInputDialog("Insira um número inteiro; ");
        length = Integer.valueOf(input.length());

        for(int i = 0; i <= length-1; i++){
            array.add(input.charAt(i));
        }

        Collections.sort(array, Collections.reverseOrder());
        for(int i = 0; i <= length-1; i++){
            output = String.valueOf(output) + array.get(i);
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
