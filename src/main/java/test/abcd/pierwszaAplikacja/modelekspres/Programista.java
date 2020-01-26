package test.abcd.pierwszaAplikacja.modelekspres;

import org.springframework.stereotype.Component;

@Component
public class Programista {

    private EkspresDoKawy ekspresDoKawy;
    private Komputer komputer;

    public Programista(EkspresDoKawy ekspresDoKawy, Komputer komputer) {
        this.ekspresDoKawy = ekspresDoKawy;
        this.komputer = komputer;
    }


}
