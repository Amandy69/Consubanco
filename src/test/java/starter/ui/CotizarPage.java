package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CotizarPage {
    public static final Target label_nuevaSolicitud = Target.the("label_nuevaSolicitud").located(AppiumBy.id("com.consubanco.ecsb:id/btnNewRequest"));
    public static final Target comboBox_sucursal = Target.the("searchtableTarget_sucursal").located(By.xpath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[1]"));
    public static final Target text_sucursal = Target.the("textoSucursal").located(By.name("Consupago Cd. de México, D.F. - Corporativo"));
    public static final Target comboBox_grupoConvenio = Target.the("searchtableTarget_grupoConvenio").located(By.xpath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[2]"));
    public static final Target text_gconvenio = Target.the("textoGc onvenio").located(By.name("Educación SNTE"));
    public static final Target comboBox_convenio = Target.the("searchtableTarget_convenio").located(By.xpath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[3]"));
    public static final Target text_convenio = Target.the("textoConvenio").located(By.name("SNTE SECC. 35, COAHUILA"));
    public static final Target Btn_No = Target.the("noRenueva").located(AppiumBy.id("com.consubanco.ecsb:id/buttonNo"));
    public static final Target comboBox_porMonto = Target.the("searchtableTarget_porMonto").located(By.xpath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[4]"));
    public static final Target text_porMonto = Target.the("textoPorMonto").located(By.name("Por Monto"));
    public static final Target text_amount = Target.the("monto").located(AppiumBy.id("com.consubanco.ecsb:id/editTextAmountLoan"));
    public static final Target Btn_cotizar = Target.the("cotizar").located(AppiumBy.id("com.consubanco.ecsb:id/btnNext"));
}