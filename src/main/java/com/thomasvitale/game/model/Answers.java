package com.thomasvitale.game.model;

public record Answers(
    String player,
    String sessionId,
    String message,
    int remainingTime
){}
