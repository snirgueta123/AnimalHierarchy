import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AnimalManager extends Application {

    private ObservableList<String> animalList = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) {
        // Layout
        VBox root = new VBox(10);

        // Input Fields
        TextField nameField = new TextField();
        nameField.setPromptText("Enter animal name");
        TextField ageField = new TextField();
        ageField.setPromptText("Enter animal age");
        TextField colorField = new TextField();
        colorField.setPromptText("Enter animal color");

        // ComboBox for Animal Type
        ComboBox<String> typeBox = new ComboBox<>();
        typeBox.getItems().addAll("Dog", "Cat", "Parrot");
        typeBox.setPromptText("Select Animal Type");

        // Button to Add Animal
        Button addButton = new Button("Add Animal");
        addButton.setOnAction(e -> {
            String name = nameField.getText();
            String age = ageField.getText();
            String color = colorField.getText();
            String type = typeBox.getValue();

            if (name.isEmpty() || age.isEmpty() || color.isEmpty() || type == null) {
                showAlert("Error", "Please fill all fields.");
                return;
            }

            try {
                int parsedAge = Integer.parseInt(age);
                String animal = String.format("%s (Type: %s, Age: %d, Color: %s)", name, type, parsedAge, color);
                animalList.add(animal);
                nameField.clear();
                ageField.clear();
                colorField.clear();
                typeBox.setValue(null);
            } catch (NumberFormatException ex) {
                showAlert("Error", "Age must be a number.");
            }
        });

        // ListView to Display Animals
        ListView<String> animalListView = new ListView<>(animalList);

        // Add Components to Layout
        root.getChildren().addAll(nameField, ageField, colorField, typeBox, addButton, animalListView);

        // Scene
        primaryStage.setTitle("Animal Manager");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
