package JavaPOO.aula11;

import JavaPOO.aula10.Bolsista;

public class aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Bolsista a1 = new Bolsista();

        a1.setNome("Juvenal");
        a1.setIdade(22);
        a1.setSexo("M");

        System.out.println(a1.toString());
        a1.setCurso("Curso = Informática");
        System.out.println(a1.getCurso());
        a1.pagarMensal();
    }
}
