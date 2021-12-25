package roboto;


import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class Recursos {
	
	public static BufferedImage getResourceImage(String resource) {
		BufferedImage img = null;
		try {
			String path = Paths.get(Recursos.class.getClassLoader().getResource(resource).toURI()).toString();
		    img = ImageIO.read(new File(path));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return img;
	}
	
}

