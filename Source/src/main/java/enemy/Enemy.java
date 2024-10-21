package enemy;
import input.*;
import java.lang.*;
public class Enemy
{
    static Enemy enemy;
    int round = Fscan.readLine(1,1,0);
    int hp;
    int maxhp;
    int shield;
    int maxshield;
    int armor;
    public static String name()
    {
    int ID = Fscan.readWide(2,0,0,2);
    switch(ID)
    {
    case 1:
    return "Tanky";
    case 2:
    return "Shielded";
    case 3:
    return "Armored";
    default:
    return null;
    }
    }
    public static void spawn()
    {
    int ID = Fscan.readWide(2,0,0,2);
    switch(ID)
    {
    case 1:
    enemy = new Tanky();
    break;
    case 2:
    enemy = new Shielded();
    break;
    case 3:
    enemy = new Armored();
    break;
    default:
    return;
    }
    stats();
    }
    public static void stats()
    {
    Fscan.insertWide(2,enemy.maxhp,1,1,2);
    Fscan.insertWide(2,enemy.maxhp,1,0,2);
    Fscan.insertWide(2,enemy.maxshield,2,1,2);
    Fscan.insertWide(2,enemy.maxshield,2,0,2);
    Fscan.insertWide(2,enemy.armor,3,0,2);
    }
    public static void apply()
    {
    enemy.shield = enemy.maxshield;
    return;
    }
    public static void damage(int damage)
    {
    damage = damage - enemy.armor;
    if(enemy.shield > 0)
    enemy.shield = enemy.shield - damage;
    damage = damage + enemy.shield;
    if(enemy.shield <= 0)
    enemy.hp = enemy.hp - damage;
    if(enemy.shield <= 0)
    apply();

    update();
    }
    public static void update()
    {
    Fscan.insertWide(2,enemy.hp,1,0,2);
    Fscan.insertWide(2,enemy.maxhp,1,1,2);
    Fscan.insertWide(2,enemy.shield,2,0,2);
    Fscan.insertWide(2,enemy.maxshield,2,1,2);
    Fscan.insertWide(2,enemy.armor,3,0,2);
    }
}
