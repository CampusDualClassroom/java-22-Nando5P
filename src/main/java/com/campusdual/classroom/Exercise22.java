package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;


public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> lista = new ArrayList<>();
        lista.add("GKFFD");
        lista.add("TNANA");
        lista.add("MPMSL");
        lista.add("PSWME"); // Añadido el elemento que faltaba
        lista.add("LZMLF");
        lista.add("JYEBV");
        lista.add("YELNT");
        lista.add("JSNKR");
        lista.add("JFESF");
        lista.add("TMJLL");
        return lista;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println("Index: " + i + ", Elemento: " + customList.get(i));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        customList.add(element);
        return true;
    }

    public static void main(String[] args) {
        List<String> customList = createArrayList();
        printElementsAndIndex(customList);

        String newElement = "AAAAA";
        boolean added = addElementToList(customList, newElement);
        if (added) {
            System.out.println("Elemento añadido: " + newElement);
        } else {
            System.out.println("No se pudo añadir el elemento: " + newElement);
        }

        printElementsAndIndex(customList);
    }
}
