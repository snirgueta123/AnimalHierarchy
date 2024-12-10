# Animal Hierarchy

This project demonstrates an object-oriented approach to modeling animals and their behaviors. The program includes an animal hierarchy, polymorphism, cloning, and more. Additionally, it now features a GUI for dynamic management of animals.

---

## Features

- **Animal Hierarchy**: Classes represent different animal types (e.g., Mammals, Birds) with inheritance and abstraction.
- **Custom Behaviors**: Override methods like `eat()` and `sleep()` for specific animals.
- **Owner Management**: Add and manage owners for specific animals.
- **Polymorphism**: Demonstrated through an ArrayList of animals with shared and unique methods.
- **Cloning**: Deep cloning of animals with unique attributes.
- **Dynamic User Input (GUI)**: Using JavaFX, users can dynamically add animals and view their details.

---

## GUI Explanation

The program includes a graphical interface (GUI) for managing animals dynamically. This feature uses **JavaFX** to allow users to input animal details and view a list of animals.

### Components in the GUI

1. **TextFields**: Input fields for:
   - Animal Name
   - Animal Age
   - Animal Color

2. **ComboBox**:
   - Allows selection of the animal type (e.g., Dog, Cat, Parrot).

3. **Button**:
   - A button to add the entered animal to the list.

4. **ListView**:
   - Displays a list of added animals with their details.

### Code Walkthrough

#### Adding an Animal
The `addButton` event listener gathers input from the user, validates it, and adds the new animal to the list:

```java
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
