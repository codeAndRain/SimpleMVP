package com.challenge.simplemvpapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, StrikeContract.View {

    private Button button;
    private TextView textView;
    private TextView currentStrikeTextview;
    private TextView attemptsTextView;

    private StrikePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.lucky_strike_button);
        button.setOnClickListener(this);
        textView = findViewById(R.id.strike_text);
        currentStrikeTextview = findViewById(R.id.current_strike_text);
        attemptsTextView = findViewById(R.id.attempts_text);

        presenter = new StrikePresenter(this);

    }

    @Override
    public void onClick(View view) {
        presenter.getStrike();
    }

    @Override
    public void showStrikeText() {
        textView.setText("hoooorayy!");
    }

    @Override
    public void showError() {
        Toast.makeText(this, "Unlucky!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showCurrentStrike(int num) {
        currentStrikeTextview.setText(String.valueOf(num));
    }

    @Override
    public void showAttempts(String attempts) {
        attemptsTextView.setText(attempts);
    }
}
