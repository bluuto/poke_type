package com.github.bluuto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileScanner {
    public void FileReader() {
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        File file = new File("pokemon-type.txt");
        Scanner fileScanner; {
            try {
                fileScanner = new Scanner(file);
                while(fileScanner.hasNextLine()){
                    String currentLine = fileScanner.nextLine();
                    listSplitter(currentLine);
                }
            } catch(FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void listSplitter(String lineToBeSplit) {
        String[] pokemonInfo = lineToBeSplit.split("\t");
        Pokemon poke = new Pokemon(pokemonInfo);
    }
}
