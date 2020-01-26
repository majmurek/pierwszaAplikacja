package test.abcd.pierwszaAplikacja.modelcookie;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Component
public class Ciastka {

    private boolean ugryzione = true;

    public boolean ugryz() {
        if (ugryzione) {
            return false;
        }
        System.out.println("Chummm!");
        ugryzione = true;
        return true;

    }
}
