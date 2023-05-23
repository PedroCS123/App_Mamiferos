package org.telcel.appmamiferos.mamiferos;

public class Guepardo extends Felino{


    public Guepardo(float tamanioGarras, int velocidad, String habitat, float altura, float largo, float peso) {
        super(tamanioGarras, velocidad, habitat, altura, largo, peso);
    }

    @Override
    public String comer() {
        return "El Guepardo caza junto a su grupo , conuna mordida mucho inferior a los demas felinos";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El guepardo es el felino mas rapido del mundo, corre a " + velocidad +" km7h.";
    }

    @Override
    public String comunicarse() {
        return "El guepardo no ruge tan fuerte como el leon";
    }
}


