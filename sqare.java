import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SquareDrawing extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creating a square shape
        Rectangle square = new Rectangle(100, 100, 200, 200); // (x, y, width, height)
        square.setFill(Color.BLUE); // Setting the fill color
        square.setStroke(Color.BLACK); // Setting the border color

        // Creating a Pane to hold the square
        Pane pane = new Pane();
        pane.getChildren().add(square);

        // Creating a Scene with the Pane
        Scene scene = new Scene(pane, 400, 400);

        // Setting the Scene to the Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Square Drawing");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
