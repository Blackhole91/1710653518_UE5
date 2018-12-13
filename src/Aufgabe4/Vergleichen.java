package Aufgabe4;

import javax.swing.*;

public class Vergleichen {
    public static void main(String[] args) {

        String nutzerEingabe_1 = JOptionPane.showInputDialog("Eingabe_1");
        String nutzerEingabe_2 = JOptionPane.showInputDialog("Eingabe_2");
        String nutzerEingabe_3 = JOptionPane.showInputDialog("Eingabe_3");

        System.out.println("1gleich2 = "+nutzerEingabe_1.contains(nutzerEingabe_2));
        System.out.println("1gleich3 = "+nutzerEingabe_1.contains(nutzerEingabe_3));
        System.out.println("2gleich3 = "+nutzerEingabe_2.contains(nutzerEingabe_3));
    }
}
