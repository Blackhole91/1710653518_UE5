package Aufgabe1;

public class Mensch extends Säugetier {


    public Mensch(String name, String geschlecht, int alter) {
        super(name, geschlecht, alter);
    }

    @Override
    public String printAll() {
        return this.getName()+"#"+this.getGeschlecht()+"#"+this.getAlter();
    }
}
