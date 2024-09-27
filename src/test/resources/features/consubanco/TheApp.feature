Feature: Consubanco

  @id:1 @Login
  Scenario: T-MOVIL-CA1-Loguearse en la apk
    Given que el cliente abre el apk
    When ingresamos usuario "0010007424" y contrasena "Promotor1"
    And damos clic en Ingresar
    Then sistema mostrará la pantalla inicial con la opción “Nueva Solicitud”

  @id:2 @LlenarNuevaSolicitud
  Scenario: T-MOVIL-CA2-Nueva Solicitud
    Given que estamos en el formulario "Nueva Solicitud"
    When  cuando llenamos los campos del formulario
    Then sistema permite ingresar el monto

  @id:3 @Cotizar
  Scenario: T-MOVIL-CA4-Cotizar
    Given ingresa el "monto"
    When da clic en el boton "Cotizar"
    Then redirecciona a la pantalla de “Resultados de cotizaciones”


