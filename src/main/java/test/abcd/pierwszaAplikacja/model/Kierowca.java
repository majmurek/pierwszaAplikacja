package test.abcd.pierwszaAplikacja.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Kierowca {

    private Kluczyki kluczyki;
    private PrawoJazdy prawoJazdy;

    public Kierowca(Kluczyki kluczyki, PrawoJazdy prawoJazdy) {
        this.kluczyki = kluczyki;
        this.prawoJazdy = prawoJazdy;
    }
}
