package roboto;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Ufo {
	private List<FotoNave> listaNave;
	private BufferedImage nave;
	
	private Personaje personaje;
	
	public Ufo(int width, Personaje personaje) {
		this.personaje = personaje;
		nave = Recursos.getResourceImage("nave.png");
		listaNave = new ArrayList<FotoNave>();
		
		FotoNave fotoNave = new FotoNave();
		fotoNave.posX = 0;
		fotoNave.posY = 30;
		listaNave.add(fotoNave);
		
		fotoNave = new FotoNave();
		fotoNave.posX = 150;
		fotoNave.posY = 40;
		listaNave.add(fotoNave);
		
		fotoNave = new FotoNave();
		fotoNave.posX = 300;
		fotoNave.posY = 50;
		listaNave.add(fotoNave);
		
		fotoNave = new FotoNave();
		fotoNave.posX = 450;
		fotoNave.posY = 20;
		listaNave.add(fotoNave);
		
		fotoNave = new FotoNave();
		fotoNave.posX = 600;
		fotoNave.posY = 60;
		listaNave.add(fotoNave);
	}
	
	public void update(){
		Iterator<FotoNave> itr = listaNave.iterator();
		FotoNave firstElement = itr.next();
		firstElement.posX -= personaje.getSpeedX()/8;
		while(itr.hasNext()) {
			FotoNave element = itr.next();
			element.posX -= personaje.getSpeedX()/8;
		}
		if(firstElement.posX < -nave.getWidth()) {
			listaNave.remove(firstElement);
			firstElement.posX = Ventana.SCREEN_WIDTH;
			listaNave.add(firstElement);
		}
	}
	
	public void draw(Graphics g) {
		for(FotoNave imgLand : listaNave) {
			g.drawImage(nave, (int) imgLand.posX, imgLand.posY, null);
		}
	}
	
	private class FotoNave {
		float posX;
		int posY;
	}
}

