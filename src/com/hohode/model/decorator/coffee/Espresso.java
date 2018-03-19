package com.hohode.model.decorator.coffee;

import com.hohode.model.decorator.Beverage;

public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }

}
