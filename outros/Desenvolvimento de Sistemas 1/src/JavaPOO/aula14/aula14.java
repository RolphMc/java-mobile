package JavaPOO.aula14;


public class aula14 {
    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Guanabara aula");
        v[1] = new Video("PHP para lerdos");
        v[2] = new Video("MySQL nível hard");

        v[0].play();
        v[0].like();
        System.out.println(v[0].toString());

        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("Rodolfo",30,"M","rod01");
        g[1] = new Gafanhoto("Kamila", 29,"F", "kafsoares");

        System.out.println(g[1].toString());

        Visualizacao visu = new Visualizacao(g[1], v[1]);

        System.out.println(visu.toString());


    }
}
