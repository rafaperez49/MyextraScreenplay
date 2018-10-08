# language:es
#Author: yarias@choucairtesting.com

@Regresion
Característica: Trabajar con MyExtra
  	"Como" usuario
		"Quiero" ingresar
		 "A" myextra para hacer transacciones
	   
	@CasoExitoso
  Escenario: Ingresar a MyExtra
    Dado que Yeison desea realizar una consulta en AS400
    Cuando el realiza la autenticación con el usuario
    |usuario|contraseña|texto|
    |cyearias|pruebas08|Ubicarse:|
    Y el navega al menú
    Entonces el verifica que inicio sesión correctamente

