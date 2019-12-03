package BehavioralDesignPatterns.Strategy.Ordek;

import TestDesignPatern.Test;

public class zzTestStrategyOrdek extends Test {

    @Override
    public void start() {
        super.start();

        Ordek ordek = new YesilOrdek();
        ordek.ot();
        ordek.uc();

        ordek.setUcabilme(new Ucamama());
        ordek.setOtebilme(new Vikvik());

        ordek.uc();
        ordek.ot();
    }
}
