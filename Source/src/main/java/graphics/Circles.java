package graphics;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import runtime.*;
public class Circles
{
    static Pane pane = Ui.pane;
    public static Circle[] obs = new Circle[100];
    public static int i = 0;
    public static Circle circle(double x,double y, double r)
    { Circle c = new Circle();
    c.setCenterX(x);
    c.setCenterY(y);
    c.setRadius(r);
    c.setFill(Color.web("#ffffff"));
    pane.getChildren().add(c);
    return c;
    }
    public static void add(double x, double y, double r)
    {
    obs[i] = new Circle();
    obs[i].setCenterX(x);
    obs[i].setCenterY(y);
    obs[i].setRadius(r);
    obs[i].setFill(Color.web("#ffffff"));
    pane.getChildren().add(obs[i]);
    i++;
    }
    public static void remove(int id)
    {
    Screens.timer.stop();
     pane.getChildren().remove(obs[id]);
      for (int j = id; j < i - 1; j++) {
                obs[j] = obs[j + 1];
            }
      obs[i - 1] = null;
      i--;
    Screens.timer.start();
    }
}
