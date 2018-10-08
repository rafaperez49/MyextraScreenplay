package co.proyectobase.myextra.interactions;

import co.proyectobase.myextra.util.Evidencia;
import co.proyectobase.myextra.util.myextra.MyExtra_init;
import co.proyectobase.myextra.util.myextra.Screen;
import co.proyectobase.myextra.util.myextra._Session;
import co.proyectobase.myextra.util.myextra._System;

public class LeerTexto{

	
	private int columna;
	private int fila;
	
	public _System sSystem = null;
	public Screen screen = null;
	public _Session Sess0 = null;
	public int g_HostSettleTime = 3000;
	
	public LeerTexto(int fila, int columna)
	{
		
		this.fila=fila;
		this.columna=columna;
		
	}
	
	
	public String conLongitud(int longitud)
	{
		String textoPantalla="";
		
		try {
			
			sSystem = MyExtra_init.crearSistema();
			Sess0 = MyExtra_init.crearSesion(sSystem);
			screen = MyExtra_init.crearPantalla(Sess0);
			
			Thread.sleep(2000);
			textoPantalla = screen.getString(fila, columna, longitud, screen);
			Evidencia.captureScreen();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		return textoPantalla;
		
	}


}
