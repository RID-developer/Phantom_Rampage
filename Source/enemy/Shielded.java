package enemy;
import java.math.*;
public class Shielded extends Enemy
{
    protected Shielded()
    {
    maxhp = 5 + round * 2;
    hp = maxhp;
    maxshield = 2 + round;
    shield = maxshield;
    }
}
