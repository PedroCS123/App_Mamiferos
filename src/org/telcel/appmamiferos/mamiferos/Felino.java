package org.telcel.appmamiferos.mamiferos;

abstract public class Felino extends Mamifero {

    protected float tamanioGarras;
    protected int velocidad;

    public Felino(float tamanioGarras, int velocidad, String habitat, float altura, float largo, float peso){
        super(habitat, altura, largo, peso);
        this.tamanioGarras =  tamanioGarras;
        this.velocidad =  velocidad;
    }

    public float getTamanioGarras() {
        return tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }


}
