package player;
import graphics.*;
import utils.*;
import input.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.input.*;
import javafx.stage.*;
public class Player
{

    Circle player;
    double x = 860;
    double y = 540;
    public Player()
    {
    player = Circles.circle(x,y,16);
    }
    public boolean wallCol()
    {
    int i;
    for (i = 0; i < Wall.i;++i)
    {
    if (!Shape.intersect(player,Wall.wall[i]).getBoundsInLocal().isEmpty())
    return true;
    }
    return false;
    }
    public boolean obsCol()
    {
    int i;
    for (i = 0; i < Circles.i;++i)
    {
    if (!Shape.intersect(player,Circles.obs[i]).getBoundsInLocal().isEmpty())
    return true;
    }
    return false;
    }
    public void move()
    {
    double dx = 0;
        double dy = 0;
        if (Key.key[KeyCode.UP.getCode()]) {
            dy = -0.75;
        }
        if (Key.key[KeyCode.DOWN.getCode()]) {
            dy = 0.75;
        }
        if (Key.key[KeyCode.LEFT.getCode()]) {
            dx = -0.75;
        }
        if (Key.key[KeyCode.RIGHT.getCode()]) {
            dx = 0.75;
        }

        player.setTranslateX(player.getTranslateX() + dx);
        player.setTranslateY(player.getTranslateY() + dy);

        if (wallCol()) {
            player.setTranslateX(player.getTranslateX() - dx);
            player.setTranslateY(player.getTranslateY() - dy);
        }
    }

    }
