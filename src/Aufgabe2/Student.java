package Aufgabe2;

public class Student extends Mensch {

    private int matrikelNummer;
    private String studienGang;


    public Student(String vorname, String nachname, int alter, int matrikelNummer, String studienGang) {
        super(vorname, nachname, alter);
        this.setMatrikelNummer(matrikelNummer);
        this.setStudienGang(studienGang);
    }

    @Override
    public void status(){
        System.out.println("Ich bin ein Student"+ this.getVorname()+" "+this.getNachname()+" "+this.getAlter()+" "+this.getMatrikelNummer()+" "+this.getStudienGang());
    }
    public int getMatrikelNummer() {
        return matrikelNummer;
    }

    public void setMatrikelNummer(int matrikelNummer) {
        this.matrikelNummer = matrikelNummer;
    }

    public String getStudienGang() {
        return studienGang;
    }

    public void setStudienGang(String studienGang) {
        this.studienGang = studienGang;
    }
}
