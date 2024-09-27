package input;
import java.util.Scanner;
import java.io.*;
public class Fscan{
    static RandomAccessFile save = new RandomAccessFile("BattleStats");
    static Scanner sc = new Scanner(save);
    public static void read(int bytes)
    {
        int i;
        int d;
        for (i = 1; i <= bytes; ++i)
        d = sc.nextByte();
        File.seek();
    }
}
