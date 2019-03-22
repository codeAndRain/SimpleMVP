package com.challenge.simplemvpapplication;

public interface StrikeContract {

    interface Presenter {
        void getStrike();
    }

    interface View {
        void showStrikeText();

        void showError();

        void showCurrentStrike(int num);

        void showAttempts(String attempts);
    }
}
