package main;

public class Array {
    public static void main(String[] args) {
        String [] names = new String[4];
        names [0] = "Aneta";
        names [1] = "Mateusz";
        names [2] = "Radek";
        names [3] = "Kasia";

        for (int i = 0; i< names.length; i++)
            System.out.println(names[i]);
        }

//        String[] names = {"Mateusz", "Radek", "Aneta", "Kasia"};
//        for (String name : names) {
//            System.out.println(name);
//        }

}
