package enemy;
public class Tanky extends Enemy{
    protected Tanky()
    {
    maxhp = 10 + round * 5;
    hp = maxhp;
    }
}
