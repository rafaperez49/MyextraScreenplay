package co.proyectobase.myextra.util;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.serenitybdd.core.Serenity;

public class Evidencia {
	

	public static void captureScreen() {
		try 
		{
            Robot rbRobot = new Robot();

            Rectangle recCapture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = rbRobot.createScreenCapture(recCapture);
            ImageIO.write(Image, "png", new File("D:/evidencia/evidencia.png"));
            
            Serenity.getWebdriverManager().getCurrentDriver().get("D:/evidencia/evidencia.png");
            Serenity.takeScreenshot();
            
            
        }
        catch (AWTException | IOException ex) {
            System.out.println(ex);
        }
		
	}

}
