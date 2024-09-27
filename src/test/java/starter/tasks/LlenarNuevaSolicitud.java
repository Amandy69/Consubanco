package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.CotizarPage;
import java.time.Duration;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LlenarNuevaSolicitud implements Task {

    public static LlenarNuevaSolicitud Llenar() {
        return Tasks.instrumented(LlenarNuevaSolicitud.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on (CotizarPage.label_nuevaSolicitud),
                Click.on (CotizarPage.comboBox_sucursal),
                Click.on (CotizarPage.text_sucursal),
                Click.on (CotizarPage.comboBox_grupoConvenio),
                Click.on (CotizarPage.text_gconvenio),
                Click.on (CotizarPage.comboBox_convenio),
                Click.on (CotizarPage.text_convenio),
                Click.on (CotizarPage.Btn_No),
                Click.on (CotizarPage.comboBox_porMonto),
                Click.on (CotizarPage.text_porMonto)
        );
    }
}
