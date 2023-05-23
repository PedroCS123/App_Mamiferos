package org.telcel.appmamiferos.mamiferos;

public class Lobo extends Canino{

    private int numCamada;
    private String especieLobo;

    public Lobo(int numCamada, String especieLobo, float tamañoColmillos, String color, String habitat, float altura, float largo, float peso) {
        super(tamañoColmillos, color, habitat, altura, largo, peso);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }


    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo " + especieLobo + " caza junto a su grupo de "+ numCamada + " individuos en los bosques" ;
    }

    @Override
    public String dormir() {
        return "El lobo " + especieLobo + " duerme en las llanuras aledañas a los bosques de "+ habitat;
    }

    @Override
    public String correr() {
         return "El lobo " + especieLobo + " corre en las llanuras aledañas a los bosques de "+ habitat;
    }

    @Override
    public String comunicarse() {
        return "El lobo " + especieLobo + " " + color + " Aulla a la luna llena";
    }
}
