package com.leszekszymaszek;

public interface Game {

    void reset();

    int getNumber();

    int getGuess();

    void setGuess(int guess);

    int getSmallest();

    int getBiggest();

    int getGuessCount();

    int getRemainingGuesses();

    void check();

    boolean isValidNumberRange();

    boolean isGameWon();

    boolean isGameLost();
}
