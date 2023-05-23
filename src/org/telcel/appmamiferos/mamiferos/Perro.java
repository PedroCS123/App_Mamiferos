package org.telcel.appmamiferos.mamiferos;

public class Perro extends Canino{

    private int fuerzaMordida;


    public Perro(int fuerzaMordida, float tamañoColmillos, String color, String habitat, float altura, float largo, float peso) {
        super(tamañoColmillos, color, habitat, altura, largo, peso);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro africano caza en manada con una fuerza de " +
                "mordida de : "+ fuerzaMordida + " PSI, posee fuertes mandibulas y grandes orejas redondas";
    }

    @Override
    public String dormir() {
        return "El perro africano duerme en la sabana africana";
    }

    @Override
    public String correr() {
        return "El perro africano corre en las llanuras aledañas a la sabana";
    }

    @Override
    public String comunicarse() {
        return "Los perros ladran de noche durante cacerias nocturnas";
    }
}
