package com.leszekszymaszek;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class GameServiceImpl implements GameService {

    // == fields ==
    private final Game game;
    private final MessageGenerator messageGenerator;

    // == constructors ==
    @Autowired
    public GameServiceImpl (Game game, MessageGenerator messageGenerator) {
        this.game = game;
        this.messageGenerator = messageGenerator;
    }

    // == init method ==
    @PostConstruct
    public void init() {
        log.info("Game main message: {}", messageGenerator.getMainMessage());
        log.info("Number is: {}", game.getNumber());
    }

    // == public methods ==
    @Override
    public boolean isGameOver () {
        return game.isGameWon() || game.isGameWon();
    }

    @Override
    public String getMainMessage () {
        return messageGenerator.getMainMessage();
    }

    @Override
    public String getResultMessage () {
        return messageGenerator.getResultMessage();
    }

    @Override
    public void checkGuess (int guess) {
        game.setGuess(guess);
        game.check();
    }

    @Override
    public void reset () {
        game.reset();
    }
}