package com.github.bluuto;

import java.util.Scanner;

public class MainBootstrap {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Make a new instance of main, and pass scanner into it.
        new Main(keyboard).run();
    }
}
