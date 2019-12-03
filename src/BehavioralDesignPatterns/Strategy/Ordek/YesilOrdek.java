package BehavioralDesignPatterns.Strategy.Ordek;

public class YesilOrdek extends Ordek {

    YesilOrdek() {
        setOtebilme(new Vakvak());
        setUcabilme(new KanatlaUc());
    }

    @Override
    public double puanla() {
        return 10.0;
    }

    @Override
    public void ciz() {
        System.out.println("Yesil Ordek");
    }
}
