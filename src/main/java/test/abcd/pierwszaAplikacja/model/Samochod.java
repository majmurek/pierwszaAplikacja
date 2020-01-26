package test.abcd.pierwszaAplikacja.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Samochod {

    private Kierowca kierowca;
    private Czesc kola;
    private Czesc silnik;

    public Samochod(Kierowca kierowca, Czesc kola, Czesc silnik) {
        this.kierowca = kierowca;
        this.kola = kola;
        this.silnik = silnik;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Hello world");
    }


}
