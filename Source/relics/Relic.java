package relics;
import input.*;
import graphics.*;
import utils.*;
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
    Fscan.insertLine(1,buff,2,0);
    buff = Fscan.readWide(5,2,1,2);
    buff = Fscan.readLine(1,3,0) - buff;
    Fscan.insertLine(1,buff,3,0);

    return;
    }
    public static void gain()
    {
    one = "Power";
    two = "Time";
    if (Rand.intIn()%10 == 0)
    three = "Length";
    else
    three = "Unavailable";
    Menu.gain();
    int x;
    int y;
    x = Terminal.scanInt();
    if(x == 3 && three.equals("Unavailable"))
    x = x - 1;
    y = Fscan.readWide(5,x-1,1,2);
    Fscan.insertWide(5,y+1,x-1,1,2);

    }
}
