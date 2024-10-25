package input;
import graphics.*;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
public class Key
{
    public static boolean[] key = new boolean[256];
    public static void initiate(Scene scene)
    { scene.setOnKeyPressed(Key::press);
    scene.setOnKeyReleased(Key::release);
    }
    public static void press(KeyEvent e)
    {
      key[e.getCode().getCode()] = true;
    }
    public static void release(KeyEvent e)
    {
      key[e.getCode().getCode()] = false;
    }

}
