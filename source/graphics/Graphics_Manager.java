package graphics;
import utils.*;
import input.*;
import battle.*;
public class Graphics_Manager{
    public static void run()
    {
        Rand.restart();
        char a = '\0';
        while(true)
        {
            Control.refresh();
            System.out.println(battle.Evade.get());
            Time.pause(1000);
        }
    }
}