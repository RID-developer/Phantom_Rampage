package graphics;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.scene.text.*;

public class Click
{
    static Button button = null;
    static Pane pane = Ui.pane;
    public static void click(Wild method,String text,double w,double h, double x, double y)
    {
    button = new Button (text);
    button.setPrefWidth(w);
    button.setPrefHeight(h);
    button.setLayoutX(x);
    button.setLayoutY(y);
    button.setStyle("-fx-background-color: #ffffff; ");
    button.setTextFill(Color.web("#000000"));
    button.setFont(new Font("Hack",32));
    button.setOnAction(event -> method.run());
    pane.getChildren().add(button);
    }
}
