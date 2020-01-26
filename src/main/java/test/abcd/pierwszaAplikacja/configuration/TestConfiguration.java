package test.abcd.pierwszaAplikacja.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import test.abcd.pierwszaAplikacja.model.Kierowca;
import test.abcd.pierwszaAplikacja.model.Kluczyki;
import test.abcd.pierwszaAplikacja.model.PrawoJazdy;
import test.abcd.pierwszaAplikacja.model.Samochod;
import test.abcd.pierwszaAplikacja.modelekspres.EkspresDoKawy;
import test.abcd.pierwszaAplikacja.modelekspres.Komputer;
import test.abcd.pierwszaAplikacja.modelekspres.Programista;
import test.abcd.pierwszaAplikacja.modelnew.Prezent;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class TestConfiguration {

    @Bean
    public Prezent dlaMalgosi() {
        return new Prezent("lalke");
    }

    @Bean
    public Prezent dlaJasia() {
        return new Prezent("samochod");
    }

    @Bean
    public Prezent dlaGrzesia() {
        return new Prezent("klocki");
    }

    @Bean
    public Programista programista1(EkspresDoKawy ekspresDoKawy, Komputer komputer){
        return new Programista(ekspresDoKawy, komputer);
    }

    @Bean
    public Programista programista2(EkspresDoKawy ekspresDoKawy, Komputer komputer){
        return new Programista(ekspresDoKawy, komputer);
    }

    @Bean
    public Programista programista3(EkspresDoKawy ekspresDoKawy, Komputer komputer){
        return new Programista(ekspresDoKawy, komputer);
    }

}
