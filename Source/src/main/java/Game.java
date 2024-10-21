import graphics.*;
import utils.*;
import input.*;
import battle.*;
import java.io.*;
import relics.*;
public class Game{

    public static void main(String[] args)
    {
        start(args);
    }
    private static void start(String[] args)
    {
        Ui.begin(args);
        while(true)
        {

        run();
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
    System.out.println(Fscan.readLine(2,1,0));
    t = Evade.round();
    R.damage();
    }
    }
    }
}
