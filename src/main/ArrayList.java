package main;

import java.util.Collections;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> names = new java.util.ArrayList<>();
        names.add("Mateusz");
        names.add("Aneta");
        names.add("Radek");
        names.add("Radek");

        Collections.sort(names);
        for (String name : names) {
            System.out.println(names);
            System.out.println(names.isEmpty());
        }
    }
}
