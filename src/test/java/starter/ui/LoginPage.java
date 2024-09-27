package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target txt_usuario = Target.the("usuario").located(AppiumBy.id("com.consubanco.ecsb:id/editTextUser"));
    public static final Target txt_contrasena = Target.the("Contrasena").located(AppiumBy.id("com.consubanco.ecsb:id/editTextPass"));
    public static final Target Btn_login = Target.the("btn_login").located(AppiumBy.id("com.consubanco.ecsb:id/btnLogin"));

}
