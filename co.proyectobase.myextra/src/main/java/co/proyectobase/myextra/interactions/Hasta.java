package co.proyectobase.myextra.interactions;

import co.proyectobase.myextra.util.Evidencia;
import co.proyectobase.myextra.util.myextra.MyExtra_init;
import co.proyectobase.myextra.util.myextra.Screen;
import co.proyectobase.myextra.util.myextra._Session;
import co.proyectobase.myextra.util.myextra._System;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Hasta implements Interaction{
	
	public _System sSystem = null;
	public Screen screen = null;
	public _Session Sess0 = null;
	public int g_HostSettleTime = 3000;
	
	private String texto;
	private int fila;
	private int columna;
	
	
	public Hasta(String texto, int fila, int columna) {
		
		this.texto = texto;
		this.fila = fila;
		this.columna = columna;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		

		sSystem = MyExtra_init.crearSistema();
		Sess0 = MyExtra_init.crearSesion(sSystem);
		screen = MyExtra_init.crearPantalla(Sess0);
		int i=0;
		String textoPantalla;
		try {
		
		while (true) {
			i++;
			Thread.sleep(2000);			
			textoPantalla = screen.getString(fila, columna, texto.length(), screen);
			if (!textoPantalla.equals(texto)) {
				screen.sendKeys("<Enter>");
				screen.waitHostQuiet(g_HostSettleTime);
			} else {
				break;
			}
			if (i == 5) {
				break;
			}
		}
		Evidencia.captureScreen();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	

}
