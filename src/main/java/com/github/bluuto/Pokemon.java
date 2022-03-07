package com.github.bluuto;

public class Pokemon {
    private int pokeNum;
    private String pokeName, pokeType1, pokeType2;

    public Pokemon(String[] pokemonInfo) {
        // Creates a Pokemon based on
        // the info in the current line
        this.pokeName = pokemonInfo[0];
        this.pokeNum = Integer.parseInt(pokemonInfo[1]);
        this.pokeType1 = pokemonInfo[2];

        if (!pokemonInfo[3].isEmpty()) {
            this.pokeType2 = pokemonInfo[3];
        }
    }
}
