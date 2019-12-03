package BehavioralDesignPatterns.Strategy.Ordek;

public abstract class Ordek {

    private Otebilme otebilme;
    private Ucabilme ucabilme;

    public abstract double puanla();

    public abstract void ciz();

    void setOtebilme(Otebilme otebilme) {
        this.otebilme = otebilme;
    }

    void setUcabilme(Ucabilme ucabilme) {
        this.ucabilme = ucabilme;
    }

    void uc() {
        ucabilme.uc();
    }

    void ot() {
        otebilme.ot();
    }
}
