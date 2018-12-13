package Aufgabe1;

public abstract class Säugetier {

    private String name;
    private String geschlecht;
    private int alter;

    public Säugetier(String name, String geschlecht, int alter) {
        this.setName(name);
        this.setGeschlecht(geschlecht);
        this.setAlter(alter);
    }
    public abstract String printAll();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
