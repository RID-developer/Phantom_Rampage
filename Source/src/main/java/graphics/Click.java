package graphics;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
public class Click
{
    static Button button = null;
    public static void click(Wild method,String text,Pane pane,double w,double h, double x, double y)
    {
    button = new Button (text);
    button.setPrefWidth(w);
    button.setPrefHeight(h);
    button.setLayoutX(x);
    button.setLayoutY(y);
    button.setOnAction(event -> method.run());
    pane.getChildren().add(button);
    }
}
