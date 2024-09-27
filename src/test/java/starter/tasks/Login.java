package starter.tasks;

import starter.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class Login implements Task {
    private String usuario;
    private String password;

    public Login (String usuario,String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Login() {

    }

    public static Login credenciales(String usuario,String password) {
        return Tasks.instrumented(Login.class,usuario,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("0010007424").into(LoginPage.txt_usuario),
                SendKeys.of("Promotor1").into(LoginPage.txt_contrasena),
                Click.on (LoginPage.Btn_login)
        );
    }
}
