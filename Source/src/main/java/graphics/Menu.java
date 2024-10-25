package graphics;
import input.*;
import enemy.*;
import relics.*;
import runtime.*;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
public class Menu{
      static Labels lab = new Labels();
      static Label x = null;
      public static void gain(String one,String two,String three)
      {
            Ui.pane.getChildren().clear();
            lab.label("Choose",810,300);
            Click.click(Relic::one,one,180,100,600,400);
            Click.click(Relic::two,two,180,100,810,400);
            Click.click(Relic::three,three,180,100,1020,400);
      }
      public static void mainMenu()
      {
        Ui.pane.getChildren().clear();
        x = lab.label("You probably got hit, let's hope it's legit :)",650,224);
        x = lab.label("In order to play, just dodge the obstacles!",650,268);
        x = lab.label("Don't forget to pick an upgrade!",650,300);
        Click.click(Screens::next,"Play",180,100,810,400);
      }
      public static void enemyHp()
      {
            Rectangle back =  Rectangles.rect(750,100,200,50);
            Rectangle health =  Rectangles.rect(750,100,200,50);
            double hp = Fscan.readLine(2,1,0);
            Ui.pane.getChildren().remove(x);
            x = lab.label(Double.toString(hp),500,100);

            double mhp = Fscan.readLine(2,1,1);
            double perc = hp/mhp;
            health.setWidth(200 * perc);
            Shape x = Shape.intersect(back,health);
            x.setFill(Color.web("#ff0000"));
            Ui.pane.getChildren().add(x);
      }
}
