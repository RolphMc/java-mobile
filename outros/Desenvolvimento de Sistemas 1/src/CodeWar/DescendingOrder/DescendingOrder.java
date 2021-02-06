package CodeWar.DescendingOrder;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DescendingOrder {
    public static int sortDesc (final int num) {

        int aux = Integer.valueOf(JOptionPane.showInputDialog("Digite 1 para cod simplificado ou 0 para cod próprio"));
            if (aux == 1) {
                IntStream aux1 = String.valueOf(num).chars(); // Carrega a sequência de caracteres
                Stream<Object> aux2 = aux1.mapToObj(i -> String.valueOf(Character.getNumericValue(i)));


                return Integer.parseInt(String.valueOf(num)
                        .chars()
                        .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining()));

            }
            List array = new ArrayList();
            String input;
            String output = new String();
            Integer length;

            input = String.valueOf(num);
            length = Integer.valueOf(input.length());

            for (int i = 0; i <= length - 1; i++) {
                array.add(input.charAt(i));
            }

            Collections.sort(array, Collections.reverseOrder());
            for (int i = 0; i <= length - 1; i++) {
                output = String.valueOf(output) + array.get(i);
            }
        return Integer.parseInt(output);
    }
}
