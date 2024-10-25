package runtime;
import graphics.*;
import utils.*;
import input.*;
import battle.*;
import java.io.*;
import relics.*;
import player.*;
import javafx.animation.AnimationTimer;
public class Screens{
    static Round R = new Round(0);
    static Player p = null;
    public static AnimationTimer timer = null;
    static int heat = 0;
    static int cool = 0;
    public static void start()
    {
        if(timer!=null)
        timer.stop();
        Rand.restart();
        Fscan.erase();
        Fscan.reset();
        Fscan.insertLine(1,1,0,0);
        Menu.mainMenu();
    }
    public static void next()
    {
    if(timer!=null)
    timer.stop();
    Relic.gain();
    R.nextRound();
    }
    public static void play()
    {
        Ui.pane.getChildren().clear();
        p = new Player();
        Wall.i = 0;
        Wall.wall(500,200,1000,5);
        Wall.wall(500,700,1000,5);
        Wall.wall(1500,200,5,505);
        Wall.wall(500,200,5,500);
        heat = Fscan.readLine(1,3,0);
        Menu.enemyHp();
        loop();
    }
    public static void loop()
    {
         timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                Evade.move();
                p.move();
                if(heat < cool)
                {
                timer.stop();
                R.damage();
                Menu.enemyHp();
                cool = 0;
                timer.start();
                }
                if (Fscan.readLine(2,1,0)<=0)
                {
                timer.stop();
                Screens.next();
                }
                cool++;
                if(p.obsCol()){
                timer.stop();
                if(p.obsCol()){
                System.out.println("hit");
                Circles.i = 0;
                Screens.start();
                }
                }
            }
        };
    timer.start();
    }
    }// int t;
    // Round R = new Round(0);
    // Rand.restart();
    // Fscan.erase();
    // Fscan.reset();
    // Fscan.insertLine(1,1,0,0);
    // t = 1;
    // while(t == 1)
    // {
    // t = Fscan.readLine(1,0,0);
    // Relic.gain();
    // R.nextRound();
    // while(Fscan.readLine(2,1,0) > 0 && t == 1)
    // {
    // System.out.println(Fscan.readLine(2,1,0));
    // t = Evade.round();
    // R.damage();
    // }
    // }

