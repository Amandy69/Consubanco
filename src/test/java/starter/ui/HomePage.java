package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage  {
    public static final Target label_app = Target.the("label APP").located(By.xpath("/hierarchy/android.widget.FrameLayout"));

}
