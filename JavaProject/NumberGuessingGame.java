import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Random;

public class NumberGuessingGame extends Application {

    private int targetNumber;
    private int maxAttempts = 5;
    private int attemptsLeft = maxAttempts;
    private int roundsWon = 0;

    private Label feedbackLabel;
    private TextField guessTextField;
    private Button guessButton;
    private Button playAgainButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Number Guessing Game");

        // UI components
        Label titleLabel = new Label("Number Guessing Game");
        feedbackLabel = new Label();
        guessTextField = new TextField();
        guessButton = new Button("Guess");
        playAgainButton = new Button("Play Again");

        // Set up layout
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(titleLabel, feedbackLabel, guessTextField, guessButton, playAgainButton);

        // Initialize game
        generateRandomNumber();
        updateFeedbackLabel();

        // Button actions
        guessButton.setOnAction(e -> handleGuess());
        playAgainButton.setOnAction(e -> resetGame());

        // Set up scene
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void generateRandomNumber() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;
    }

    private void updateFeedbackLabel() {
        feedbackLabel.setText("Attempts left: " + attemptsLeft);
    }

    private void handleGuess() {
        int userGuess = Integer.parseInt(guessTextField.getText());
        attemptsLeft--;

        if (userGuess == targetNumber) {
            feedbackLabel.setText("Correct! You guessed the number.");
            roundsWon++;
            guessButton.setDisable(true);
            playAgainButton.setDisable(false);
        } else if (userGuess < targetNumber) {
            feedbackLabel.setText("Too low. Guess higher.");
        } else {
            feedbackLabel.setText("Too high. Guess lower.");
        }

        if (attemptsLeft == 0) {
            feedbackLabel.setText("Out of attempts. The number was " + targetNumber);
            guessButton.setDisable(true);
            playAgainButton.setDisable(false);
        }
    }

    private void resetGame() {
        generateRandomNumber();
        attemptsLeft = maxAttempts;
        updateFeedbackLabel();
        guessTextField.clear();
        guessButton.setDisable(false);
        playAgainButton.setDisable(true);
    }
}
