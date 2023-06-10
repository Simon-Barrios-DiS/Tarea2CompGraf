//Simon Barrios C.I. 27750642

package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		
		MarcoCentrado miMarco = new MarcoCentrado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
		
		miMarco.setTitle("Computacion Grafica");
	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado(){
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension screenSize = miPantalla.getScreenSize();
		
		int alturaPantalla = screenSize.height;
		
		int anchoPantalla = screenSize.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		Image miIcono = miPantalla.getImage("C:/Users/M3 2-7/workspace/computacionGraficaSimonBarrios/src/graficos/Images.png");
		
		setIconImage(miIcono);
	}
}	