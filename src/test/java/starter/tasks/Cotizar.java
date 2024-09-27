package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.CotizarPage;

public class Cotizar implements Task {

    public static Cotizar Solicitud() {
        return Tasks.instrumented(Cotizar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("50000").into(CotizarPage.text_amount),
                Click.on (CotizarPage.Btn_cotizar)
                );
    }

}


