package org.telcel.appmamiferos.mamiferos;

abstract public class Canino extends Mamifero {

    protected String color;
    protected float tamañoColmillos;

    public Canino(float tamañoColmillos, String color, String habitat, float altura, float largo, float peso){
      super(habitat, altura, largo, peso);
      this.color =  color;
      this.tamañoColmillos =  tamañoColmillos;
    }


    public String getColor() {
        return color;
    }

    public float getTamañoColmillos() {
        return tamañoColmillos;
    }
}
