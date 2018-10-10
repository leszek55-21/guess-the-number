package com.leszekszymaszek.config;

import com.leszekszymaszek.GuessCount;
import com.leszekszymaszek.MaxNumber;
import com.leszekszymaszek.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
@ComponentScan(basePackages = "com.leszekszymaszek")
public class GameConfig {

    @Value("${game.maxNumber:25}")
    private int maxNumber;

    @Value("${game.minNumber:10}")
    private int minNumber;

    @Value("${game.guessCount:4}")
    private int guessCount;

    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }

    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }
}
