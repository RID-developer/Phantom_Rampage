package enemy;
import java.math.*;
public class Armored extends Enemy
{
    protected Armored()
    {
    maxhp = 7 + round * 3;
    hp = maxhp;
    armor = 1 + round/2;
    }
}
