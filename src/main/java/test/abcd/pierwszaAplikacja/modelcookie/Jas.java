package test.abcd.pierwszaAplikacja.modelcookie;

import org.springframework.stereotype.Component;

@Component
public class Jas {

    public Jas(Ciastka ciastka) {
        if (ciastka.ugryz()) {
            System.out.println("Jas : MNIAM");
        } else {
            System.out.println("Jas : juz ugryzione");
        }
    }


}
