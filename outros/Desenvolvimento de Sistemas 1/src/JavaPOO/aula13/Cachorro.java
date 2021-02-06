package JavaPOO.aula13;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        super.emitirSom();
    }

    public void reagir (String frase){
        if (frase.equals("Toma comida") || frase.equals("olá")){
            System.out.println("Abana o Rabo e Latir");
        }else{
            System.out.println("Rosnar");
        }
    }

    public void reagir (int hora, int minuto){
        if(hora < 12){
            System.out.println("abanar o rabo");
        } else if(hora >= 18){
            System.out.println("Ignorar");
        } else {
            System.out.println("abanar e latir");
        }
    }

    public void reagir (boolean dono){
        if(dono){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
        }
    }

    public void reagir (int idade, float peso){
        if(idade < 5){
            if(peso < 10){
                System.out.println("abanar");
            }else {
                System.out.println("Latir");
            }
        } else {
            if(peso < 10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
}
