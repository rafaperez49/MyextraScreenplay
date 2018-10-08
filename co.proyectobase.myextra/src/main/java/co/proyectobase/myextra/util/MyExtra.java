package co.proyectobase.myextra.util;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import co.proyectobase.myextra.util.myextra.ClassFactory;
import co.proyectobase.myextra.util.myextra.Screen;
import co.proyectobase.myextra.util.myextra._Session;
import co.proyectobase.myextra.util.myextra._System;



public class MyExtra {
	
	public boolean seCreoElSistema(_System elSistema)
	{
		if(elSistema==null)
			return false;
		else
			return true;
	}
	
	public static void cerrarMyExtraAbierto() throws IOException, InterruptedException
	{
		_System s=ClassFactory.createExtraSystem();
		_Session sesion= s.activeSession();
		if (sesion != null) {sesion.closeEx(1); Thread.sleep(3000);}
		else { destroyProceso();}
	}
	
	public static void destroyProceso() throws IOException, InterruptedException
	{
		Runtime rt = Runtime.getRuntime();
		rt.exec("taskkill /IM EXTRA.exe");
		Thread.sleep(3000);
	}
	
	public static void abrirArchivoDeMyExtra(String laRutaDelArchivo) throws IOException, InterruptedException
	{
		Desktop  desk =Desktop.getDesktop();
		File file = new File(laRutaDelArchivo);
		desk.open(file);
		Thread.sleep(3000);
	}
	
	public static _System crearSistema()
	{
		return ClassFactory.createExtraSystem();		
		
	}
	
	public static _Session crearSesion(_System elSistema)
	{
		return elSistema.activeSession();
	}
	
	public static Screen crearPantalla(_Session laSesion)
	{
		return laSesion.screen();
	}

}
