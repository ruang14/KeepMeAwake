/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keepmewoke;

import com.sun.glass.ui.Window;
import java.awt.AWTException;
import java.awt.Robot;

/**
 *
 * @author ruang
 */
public class KeepMeWoke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        System.out.println("Starting bot...");
        Robot robot = new Robot();

        System.out.println("Bot will move the mouse to position 0, 0. (Top right of the screen)");
        while (1 == 1) {
            try {                
                Thread.sleep(2000);
                robot.mouseMove(0, 0);
                System.out.println("Moved");
                Thread.sleep(500);
                robot.mouseMove(0, 1);
                System.out.println("Process can be cancelled by pressing the close button on this window or pressing Ctrl + C to bring up the cancel prompt.");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
