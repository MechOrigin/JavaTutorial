package Proper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robo {
	
  public static void main(String[] arg) throws InterruptedException, AWTException {
	    System.out.println("Hello Youtube");
	    try {
			Runtime.getRuntime().exec("notepad.exe");
			
			Thread.sleep(2000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(50);
			r.keyPress(KeyEvent.VK_T);
			Thread.sleep(50);
			r.keyPress(KeyEvent.VK_A);
			Thread.sleep(50);
			r.keyPress(KeyEvent.VK_Y);
			Thread.sleep(50);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(50);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(50);
			r.keyPress(KeyEvent.VK_A);
			Thread.sleep(50);
			r.keyPress(KeyEvent.VK_F);
			Thread.sleep(50);
			r.keyPress(KeyEvent.VK_E);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
