package test.abcd.pierwszaAplikacja.modelcookie;

import org.springframework.stereotype.Component;

@Component
public class Malgosia {

    public Malgosia(Ciastka ciastka) {
        if (ciastka.ugryz()) {
            System.out.println("Malgosia : MNIAM");
        } else {
            System.out.println("Malgosia : juz zjedzone");
        }
    }
}
