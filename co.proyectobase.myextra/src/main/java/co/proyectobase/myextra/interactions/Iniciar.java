package co.proyectobase.myextra.interactions;

import java.io.IOException;

import co.proyectobase.myextra.util.Evidencia;
import co.proyectobase.myextra.util.MyExtra;
import co.proyectobase.myextra.util.ProcessUtility;
import co.proyectobase.myextra.util.myextra.Screen;
import co.proyectobase.myextra.util.myextra._Session;
import co.proyectobase.myextra.util.myextra._System;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Iniciar implements Interaction{
	
	public static _System sSystem=null;
	public static Screen Screen=null;
	public static _Session Sess0=null;
	public static int g_HostSettleTime = 3000; 

	@Override
	public <T extends Actor> void performAs(T actor) {	try
	{
		if(ProcessUtility.isProcessRunning("EXTRA.exe"))
			MyExtra.cerrarMyExtraAbierto();

		MyExtra.abrirArchivoDeMyExtra("C:\\Users\\yarias\\Desktop\\Calidad.EDP");
		Thread.sleep(3000);
		sSystem= MyExtra.crearSistema();
		Sess0=MyExtra.crearSesion(sSystem);
		Screen=MyExtra.crearPantalla(Sess0);
		sSystem.timeoutValue(g_HostSettleTime);		
		Evidencia.captureScreen();
		Thread.sleep(2000);
	}catch (IOException | InterruptedException e) {
		
		e.printStackTrace();
	}
	}

	public static Iniciar attachmateMyExtra() {
		
		return new Iniciar();
	}

}
