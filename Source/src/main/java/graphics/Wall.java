package graphics;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
public class Wall{
    public static Rectangle[] wall = new Rectangle[4];
    public static int i = 0;
    public static Pane pane = Ui.pane;
    public static void wall(double x, double y, double w,double h)
    {
    wall[i] = new Rectangle(x,y,w,h);
    wall[i].setFill(Color.web("#ffffff"));
    pane.getChildren().add(wall[i]);
    i++;
    }
}
