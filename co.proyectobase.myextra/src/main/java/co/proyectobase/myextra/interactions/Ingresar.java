package co.proyectobase.myextra.interactions;

import co.proyectobase.myextra.util.myextra.Screen;
import co.proyectobase.myextra.util.myextra._Session;
import co.proyectobase.myextra.util.myextra._System;
import co.proyectobase.myextra.util.myextra.MyExtra_init;
import  co.proyectobase.myextra.model.Credenciales;
import  co.proyectobase.myextra.util.InfoUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ingresar implements Interaction{
	
	public _System sSystem = null;
	public Screen screen = null;
	public _Session Sess0 = null;
	public int g_HostSettleTime = 3000;
	
	private String usuario;

	public Ingresar(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		sSystem = MyExtra_init.crearSistema();
		Sess0 = MyExtra_init.crearSesion(sSystem);
		screen = MyExtra_init.crearPantalla(Sess0);
		
		Credenciales credenciales = InfoUsuario.valueOf(usuario.toUpperCase()).getCredenciales();
		
		screen.putString(credenciales.getusuario(), 6, 53, null);
		screen.putString(credenciales.getcontraseña(), 7, 53, null);
		screen.sendKeys("<Enter>");
		screen.waitHostQuiet(g_HostSettleTime);
		//Ir.hastaVerTexto("Ubicarse:").en(5, 7);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public static Ingresar Datos(String usuario) {
		return instrumented(Ingresar.class, usuario);
	}

}
