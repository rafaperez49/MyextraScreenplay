package co.proyectobase.myextra.util.myextra;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class MyExtra_init 
{

	public boolean seCreoElSistema(_System elSistema)
	{
		if(elSistema==null)
			return false;
		else
			return true;
	}
	
	public static void cerrarMyExtraAbierto() throws IOException
	{
		_System s= ClassFactory.createExtraSystem();
		_Session sesion= s.activeSession();
		if (sesion != null) {sesion.closeEx(1);}
		else { destroyProceso(); }
	}
	
	public static void destroyProceso() throws IOException
	{
		Runtime rt = Runtime.getRuntime();
		rt.exec("taskkill /IM EXTRA.exe");
	}
	
	public static void abrirArchivoDeMyExtra(String laRutaDelArchivo) throws IOException
	{
		Desktop  desk =Desktop.getDesktop();
		File file = new File(laRutaDelArchivo);
		desk.open(file);
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
