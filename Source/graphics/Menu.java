package graphics;
import input.*;
import enemy.*;
import relics.*;
public class Menu{
    public static void instructions() 
    { 
        System.out.println("you last got to round " + Fscan.readLine(1,1,0));
        System.out.println("Choose a Trait\n if the enemy is not defeated\n type the same text as the one on the screeen\n hit enter to confirm\n one hit means death");
        System.out.println("And press enter to continue!");
    }
    public static void enemyHP()
    {   //try{
        int hp;
        int percent;
        double maxhp;
        int i;
        System.out.print("<");
        hp = Fscan.readWide(2,1,0,2);
        maxhp = Fscan.readWide(2,1,1,2);
        percent = hp/(int)Math.ceil(maxhp/10);
        for(i = 0;i < 10;++i)
        { if(i<percent)
            System.out.print("-");
            else
            System.out.print("*");
        }
        System.out.println(">");
    /*}
    catch(IOException e){
    return;}
    */}
    public static void enemyName()
    {
    int ID = Fscan.readWide(2,0,0,2);
    System.out.print(Enemy.name()+" ");
    }
    public static void gain()
    {
    Control.refresh();
    System.out.println("Choose!\n");
    System.out.println("1: "+Relic.one);
    System.out.println("2: "+Relic.two);
    System.out.println("3: "+Relic.three);
    }
}
