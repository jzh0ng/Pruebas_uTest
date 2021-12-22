package pruebas.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pruebas.automatizacion.userinterface.UTestLoginPage;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestLoginPage.LOGIN_BUTTON),
                Enter.theValue("ColocarSuEmailDeUTest").into(UTestLoginPage.INPUT_EMAIL),
                Enter.theValue("ColocarSuPasswordDeUTest").into(UTestLoginPage.INPUT_PASSWORD),
                Click.on(UTestLoginPage.ENTER_BUTTON)
        );

    }
}
