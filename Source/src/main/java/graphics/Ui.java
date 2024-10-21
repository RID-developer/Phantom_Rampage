package graphics;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.geometry.*;
public class Ui extends Application{
    static Label label = null;
    @Override
    public void start(Stage stage)
    {
    Pane pane = new Pane();
    pane.setPrefSize(1920, 1080);
    pane.setStyle("-fx-background-color: black;");
    Click.click(Ui::text,"Click me",pane,100,200,800,500);
    label = new Label();
    label.setLayoutX(300);
    label.setLayoutY(150);
    pane.getChildren().add(label);
    Scene scene = new Scene(pane, 1920, 1080);
    stage.setScene(scene);
    stage.setTitle("Phantom_Rampage");
    stage.show();
    }
    public static void begin(String[] args)
    {
    launch(args);
    }
    public static void text()
    {
    label.setText("Success");

    }
}
