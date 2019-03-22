package com.challenge.simplemvpapplication;

import java.util.ArrayList;
import java.util.List;

public class Attempts {

    private List<Integer> attempts = new ArrayList<>();

    public Attempts() {
    }

    public List<Integer> getAttempts() {
        return attempts;
    }

    public void setAttempts(List<Integer> attempts) {
        this.attempts = attempts;
    }

    public void addAttempt(int attemptValue) {
        attempts.add(attemptValue);
    }
}
