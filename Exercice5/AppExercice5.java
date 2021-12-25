package Exercice5;

import java.util.ArrayList;
import java.util.Collections;

public class AppExercice5 {
    public static void main(String[] args) {
        ArrayList<Personne> listP = new ArrayList<Personne>();
        listP.add(new Personne(15, "Vincensini", "Francois"));
        listP.add(new Personne(10, "Vincensini", "Yohan"));
        listP.add(new Personne(10, "Bocognano", "Yohan"));
        listP.add(new Personne(15, "Focardi", "Francois"));
        listP.add(new Personne(15, "Azerty", "Pierre"));
        listP.add(new Personne(34, "Squaglia", "Pierre-Louis"));
        listP.add(new Personne(35, "Squaglia", "Pierre-Louis"));
        Collections.sort(listP);
        System.out.println(listP);
    }
}
