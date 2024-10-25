package battle;
import input.*;
import enemy.*;
import utils.*;
import relics.*;
public class Round
{
    int round;
    int damage = 10;
    public Round(int x)
    {
    this.round = x;
    }
    public void nextRound()
    {
    int ID;
    damage = 10;
    ID = Rand.intIn()%3+1;
    Fscan.insertLine(2,ID,0,0);
    round = Fscan.readLine(1,1,0);
    Fscan.insertLine(1,round + 1,1,0);
    Fscan.insertLine(1,1000+round*20,3,0);
    Evade.update();
    Enemy.spawn();
    }
    public void damage()
    {
    damage = Relic.damage(damage);
    Enemy.damage(damage);
    return;
    }
}
