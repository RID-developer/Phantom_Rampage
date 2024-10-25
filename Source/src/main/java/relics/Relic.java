package relics;
import input.*;
import graphics.*;
import utils.*;
import runtime.*;
public class Relic
{
    public static String one;
    public static String two;
    public static String three;

    public static int damage(int damage)
    {
    double buff = Fscan.readWide(5,0,1,2);
    buff = buff/2;
    damage = (int)(damage + buff);
    return damage;
    }
    public static void evasion()
    {
    int buff = Fscan.readWide(5,1,1,2);
    buff = buff * 2;
    buff = buff + Fscan.readLine(1,2,0);
    if(buff > 10)
    {Fscan.insertLine(1,buff,2,0);}
    buff = Fscan.readWide(5,2,1,2);
    buff = Fscan.readLine(1,3,0) - buff*100;
    Fscan.insertLine(1,buff,3,0);

    return;
    }
    public static void gain()
    {
    one = "Power";
    two = "Quantity";
    if (Rand.intIn()%10 == 0)
    three = "Speed";
    else
    three = "Unavailable";
    Menu.gain(one,two,three);
    // int x;
    // int y;
    // x = Terminal.scanInt();
    // if(x == 3 && three.equals("Unavailable"))
    // x = x - 1;
    // y = Fscan.readWide(5,x-1,1,2);
    // Fscan.insertWide(5,y+1,x-1,1,2);
    }
    public static void one()
    {
    int y = Fscan.readWide(5,0,1,2);
    Fscan.insertWide(5,y+1,0,1,2);
    Screens.play();
    }
    public static void two()
    {
    int y = Fscan.readWide(5,1,1,2);
    Fscan.insertWide(5,y+1,1,1,2);
    Screens.play();
    }
    public static void three()
    {
    if(three.equals("Unavailable"))
    {Relic.two();}
    else
    {
    int y = Fscan.readWide(5,2,1,2);
    if(y > 0)
    y = -1;
    Fscan.insertWide(5,y+1,2,1,2);
    Screens.play();
    }
    }
}
