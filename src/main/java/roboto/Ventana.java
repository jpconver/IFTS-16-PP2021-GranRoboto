package roboto;


import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	public static final int SCREEN_WIDTH = 600;
	private PantallaJuego pantallaJuego;
	
	public Ventana() {
		super("NoMuerasRoboto -GarciaBasualdoGiusti-");
		setSize(SCREEN_WIDTH, 300);
		setLocation(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		pantallaJuego = new PantallaJuego();
		addKeyListener(pantallaJuego);
		add(pantallaJuego);
	}
	
	public void startGame() {
		setVisible(true);
		pantallaJuego.startGame();
	}
	
	public static void main(String args[]) {
		(new Ventana()).startGame();
	}
}
