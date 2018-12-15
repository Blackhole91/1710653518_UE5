package Aufgabe3;

public class Auto extends Fahrzeug implements Comparable<Auto>{

    private boolean klimaanlage;
    private short airbags;


    enum Color{black,green,white,red,blue}
    private Color color;


    public Auto(short reifen, short ps, short tueren, int maxSpeed, short airbags) {
        super(reifen, ps, tueren, maxSpeed);
        this.setKlimaanlage(false);
        this.setAirbags(airbags);
        this.setColor1(Color.green);
    }

    @Override
    public String toString()

    {
        return String.format("Mein Auto hat "+this.getPs()+" Ps und fährt mit "+this.getGeschwindigkeit()+" km/h"+"und hat die Farbe "+this.getColor1());

    }
    public void klimaAn(){
        if (klimaanlage==false){
            setKlimaanlage(true);
        }else {
            System.err.println("Klima läuft bereits");
        }
    }
    public void klimaAus(){
        if (klimaanlage==true){
            setKlimaanlage(false);
        }else {
            System.err.println("Klima ist bereits aus");
        }
    }

    @Override
    public int compareTo(Auto o) {
        return getPs() - o.getPs();
    }

    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }

    public void setColor1(Color color) {
        this.color = color;
    }
    public Color getColor1() {
        return color;
    }
}
