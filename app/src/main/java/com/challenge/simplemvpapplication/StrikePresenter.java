package com.challenge.simplemvpapplication;

import java.util.Random;

public class StrikePresenter implements StrikeContract.Presenter {

    private int luckyNumber = 8;
    private Attempts attempts;

    private StrikeContract.View view;
    private Random random = new Random();


    public StrikePresenter(StrikeContract.View view) {
        this.view = view;
        attempts = new Attempts();
    }

    @Override
    public void getStrike() {
        int num = random.nextInt(10);
        view.showCurrentStrike(num);
        if (num == luckyNumber) {
            view.showStrikeText();
            showAttempts();
        } else {
            attempts.addAttempt(num);
            view.showError();
        }
    }

    private void showAttempts() {
        StringBuilder builder = new StringBuilder();
        for (int attemptVal : attempts.getAttempts()) {
            builder.append(attemptVal).append(", ");
        }
        view.showAttempts(builder.toString());
    }

}
