package UdemyDevMaster.CursoIniciante.aula04_32;/*
* Tipy      Byte    Pot     Duv         Uso:
* Double    64      2^63    pq 63?
* Long      64      2^63
* Float     32
* int       32
* Short     16
* byte      8
* Char      2                           Apenas áspas simples
* String    ?
* Boorlean  ?
* */

public class TiposDados {
    public static void main(String[] args) {
        String nome;
        String sobreNome = "Sobrenome";
        System.out.println("Double: Max: " + Double.MAX_VALUE + " - Double: " +
                Double.MIN_VALUE);
        System.out.println("Float: Max: " + Float.MAX_VALUE + " - Min: " +
                Float.MIN_VALUE);
        System.out.println("Long: Max: " + Long.MAX_VALUE + " - Long: " +
                Long.MIN_VALUE);
        System.out.println("Integer: Max: " + Integer.MAX_VALUE + " - Min: " +
                Integer.MIN_VALUE);
        System.out.println("Short: Max: " + Short.MAX_VALUE + " - Min: " +
                Short.MIN_VALUE);
        System.out.println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " +
                Byte.MIN_VALUE);
    }
}