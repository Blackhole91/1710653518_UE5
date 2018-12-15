package Aufgabe3;

import java.util.ArrayList;
import java.util.Collections;

public class Aufruf {
    public static void main(String[] args) {

        Auto bmw = new Auto((short)4,(short)220,(short)5,300,(short) 4);
        Auto vw = new Auto((short)4,(short)100,(short)5,300,(short) 4);
        Auto audi = new Auto((short)4,(short)180,(short)5,260,(short) 8);
        Auto mercedes = new Auto((short)4,(short)120,(short)5,260,(short) 8);
        Auto honda = new Auto((short)4,(short)150,(short)5,260,(short) 8);

        ArrayList<Auto> autoArrayList = new ArrayList<Auto>();
        autoArrayList.add(bmw);
        autoArrayList.add(audi);
        autoArrayList.add(vw);
        autoArrayList.add(mercedes);
        autoArrayList.add(honda);
        Collections.sort(autoArrayList);

        for (Auto a:autoArrayList){
            System.out.println(a);
        }
    }
}
