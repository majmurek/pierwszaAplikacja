package test.abcd.pierwszaAplikacja.modelekspres;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Component
public class EkspresDoKawy {

    public static int i = 0;

    public EkspresDoKawy() {
        System.out.println("Ekspres do kawy : " + i++);
    }
}
