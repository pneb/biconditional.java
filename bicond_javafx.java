import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BiconditionalComponent extends Application {
    private TextField input1Field = new TextField();
    private TextField input2Field = new TextField();
    private Label resultLabel = new Label();

    @Override
    public void start(Stage stage) {
        Label input1Label = new Label("Enter your first statement:");
        HBox input1Box = new HBox(input1Label, input1Field);
        input1Box.setAlignment(Pos.CENTER);
        input1Box.setSpacing(10);

        Label input2Label = new Label("Enter your second statement:");
        HBox input2Box = new HBox(input2Label, input2Field);
        input2Box.setAlignment(Pos.CENTER);
        input2Box.setSpacing(10);

        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(event -> {
            String input1 = input1Field.getText();
            String input2 = input2Field.getText();

            String input1Reversed = new StringBuilder(input1).reverse().toString();
            String input2Reversed = new StringBuilder(input2).reverse().toString();

            String output = input1 + " if and only if " + input2 + " is " + input1Reversed + " if and only if " + input2Reversed;

            resultLabel.setText(output);
        });

        VBox root = new VBox(input1Box, input2Box, calculateButton, resultLabel);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Biconditional Component");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
