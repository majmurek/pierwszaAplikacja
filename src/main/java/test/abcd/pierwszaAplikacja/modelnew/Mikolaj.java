package test.abcd.pierwszaAplikacja.modelnew;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mikolaj {
    private Dziecko jas;
    private Dziecko malgosia;
    private Dziecko grzes;

    public Mikolaj(@Qualifier("jasiek") Dziecko jas, @Qualifier("gosia") Dziecko malgosia, @Qualifier("grzesiu") Dziecko grzes) {
        this.jas = jas;
        this.malgosia = malgosia;
        this.grzes = grzes;
    }

    @Autowired
    public void setDlaJasia(Prezent dlaJasia) {
        this.jas.daj(dlaJasia);
    }

    @Autowired
    public void setDlaMalgosi(Prezent dlaMalgosi) {
        this.malgosia.daj(dlaMalgosi);
    }

    @Autowired
    public void setDlaGrzesia(Prezent dlaGrzesia) {
        this.grzes.daj(dlaGrzesia);
    }

}
