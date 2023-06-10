//Simon Barrios C.I. 27750642

package graficos;

import java.awt.Graphics;

import javax.swing.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		MarcoConTexto miMarco = new MarcoConTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		
	setVisible(true);
	
	setSize(600, 450);
	
	setLocation(400, 200);
	
	setTitle("Primer Texto");
	
	Lamina miLamina = new Lamina();
	add(miLamina);
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.drawString("Clase de Computacion Grafica", 100, 100);
	}
}