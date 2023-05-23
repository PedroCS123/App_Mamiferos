package org.telcel.appmamiferos.mamiferos;

public class Leon extends Felino {

    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(float tamanioGarras, int velocidad, String habitat, float altura, float largo, float peso, int numManada, double potenciaRugidoDecibel ) {
        super(tamanioGarras, velocidad, habitat, altura, largo, peso);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }


    public int getNumManada() {
        return numManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El leon caza junto a su grupo de " +numManada+" individuos en las llanuras africanas.";
    }

    @Override
    public String dormir() {
        return "El leon duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El leon correo a " + velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El leon ruge a "+ potenciaRugidoDecibel + " Decibeles.";
    }


}
