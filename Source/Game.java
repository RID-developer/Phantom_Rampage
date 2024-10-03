import graphics.*;
import utils.*;
import input.*;
import battle.*;
import java.io.*;
import relics.*;
public class Game{

    public static void main(String[] args)
    {
        start();
    }
    private static void start()
    {
        while(true)
        {
        Menu.instructions();
        Terminal.byteRead();
        Control.refresh();
        run();
        System.out.println("Game over");
        Menu.instructions();
        Terminal.byteRead();
        Control.refresh();
        }
    }
    private static void run()
    {
    int t;
    Round R = new Round(0);
    Rand.restart();
    Fscan.erase();
    Fscan.reset();
    Fscan.insertLine(1,1,0,0);
    t = 1;
    while(t == 1)
    {
    t = Fscan.readLine(1,0,0);
    Relic.gain();
    R.nextRound();
    while(Fscan.readLine(2,1,0) > 0 && t == 1)
    {
    Time.pause(1000);
    Graphics_Manager.run();
    System.out.println(Fscan.readLine(2,1,0));
    t = Evade.round();
    R.damage();
    }
    }
    }
}
