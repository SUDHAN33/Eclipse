package pages;

import java.awt.Graphics2D;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;
import java.net.URL;
/*  w w  w. j a v a2s . c  om*/
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class trial {
	public static BufferedImage rotate(BufferedImage img)
	{

		int width = img.getWidth();
		int height = img.getHeight();

		BufferedImage newImage = new BufferedImage(
			img.getWidth(), img.getHeight(), img.getType());

		Graphics2D g2 = newImage.createGraphics();

		g2.rotate(Math.toRadians(90), width / 2,
				height / 2);
		g2.drawImage(img, null, 0, 0);

		return newImage;
	}

	public static void main(String[] args)
	{
		try {
			BufferedImage originalImg = ImageIO.read( new File("C:\\Users\\arant\\Downloads\\download (4).jpg"));

			BufferedImage SubImg = rotate(originalImg);

			File outputfile = new File("D:\\ImageOutput.jpg");

			ImageIO.write(SubImg, "jpg", outputfile);
			
		}
		catch (IOException e) {

			e.printStackTrace();
		}
	}
}

