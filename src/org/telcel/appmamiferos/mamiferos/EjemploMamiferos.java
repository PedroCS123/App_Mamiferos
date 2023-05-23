package org.telcel.appmamiferos.mamiferos;

public class EjemploMamiferos {

    public static void main (String args[]){

        Mamifero[] mamiferos = new Mamifero[6] ;

        Mamifero leon = new Leon(12f,60,"Sur de Africa",90f, 154f, 200f, 6, 300);

        Mamifero tigre = new Tigre("Siberiano", 7.9f, 2, "Rusia", 8, 130, 330);

        Mamifero lobo = new Lobo(5,"Gris",50f, "Marron", "Europa", 80f, 120, 80);

        Mamifero perro = new Perro(317, 12, "Tricolor de manchas negras con blancas", "Africa", 43, 92,40);
        Mamifero tigreBengala = new Tigre("Bengala", 8.9f, 2, "Rusia", 9, 130, 330);
        Mamifero guepardo = new Guepardo(45f, 3,"Africa",13f,140f, 96f);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = tigreBengala;
        mamiferos[5] = guepardo;

        for(Mamifero animal: mamiferos){
            System.out.println("=======" + animal.getClass().getSimpleName() + "=======");
            System.out.println("Habitat " + animal.getHabitat() );
            System.out.println("Altura " + animal.getAltura() );
            System.out.println("Largo " + animal.getLargo() );
            System.out.println("Peso " + animal.getPeso() );

            if(animal instanceof  Canino){

                System.out.println("Colmillos " + ( (Canino) animal ).getTamañoColmillos());
                System.out.println("Color " + ( (Canino) animal ).getColor());

                if (animal instanceof  Lobo){
                    System.out.println("Especie Lobo " + ( (Lobo) animal ).getEspecieLobo());
                    System.out.println("numero de Integrantes " + ( (Lobo) animal ).getNumCamada());
                }
                if(animal instanceof  Perro){
                    System.out.println("Fuerza de Mordida " + ( (Perro) animal ).getFuerzaMordida());
                }
            }

            if(animal instanceof  Felino){
                System.out.println("Tamaño de Garras" +  ((Felino) animal).getTamanioGarras());
                System.out.println("Velocidad" +  ((Felino) animal).getVelocidad());

                if(animal instanceof Leon){
                    System.out.println("Potencia de rugido" +  ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Numero de Integramtes" +  ((Leon) animal).getNumManada());
                }
                if(animal instanceof Tigre){
                    System.out.println("Especie Tigre: " +  ((Tigre) animal).getEspecieTigre());

                }

            }


        }



    }



}
