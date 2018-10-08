package co.proyectobase.myextra.userinterface;

import co.proyectobase.myextra.model.Target;

public class LoginPage {

	public static final Target USUARIO	=Target.the("usuario").locatedBy(6, 53);
	public static final Target PASSWORD	=Target.the("contraseña").locatedBy(7, 53);
	public static final Target UBICACION=Target.the("ubicarse").locatedBy(5, 7);
}
