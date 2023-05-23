package org.telcel.appmamiferos.mamiferos;

public class Tigre extends Felino{

    private String especieTigre;
    public Tigre(String especieTigre, float tamanioGarras, int velocidad, String habitat, float altura, float largo, float peso) {
        super(tamanioGarras, velocidad, habitat, altura, largo, peso);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }






    @Override
    public String comer() {
         return "El Tigre "+ especieTigre +  " caza en solitario en los manglares y boques amazonicos de " + habitat;
    }

    @Override
    public String dormir() {
        return "El tigre" + especieTigre + " dfuerme en las selvas de "+ habitat;
    }

    @Override
    public String correr() {
        return "El tigre " + especieTigre + " Corre a "+ velocidad + "km/h" ;
    }

    @Override
    public String comunicarse() {
        return "El tigre ruge y agacha las orejas.";
    }
}
