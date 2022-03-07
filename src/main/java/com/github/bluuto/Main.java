package com.github.bluuto;

import java.util.Scanner;

public class Main {
    private final Scanner keyboard;

    public Main(Scanner keyboard){
        this.keyboard = keyboard;
    }

    public void run() {
        System.out.println("What is the name of your Pokémon?");
        String pokemon = keyboard.nextLine();
    }

}
