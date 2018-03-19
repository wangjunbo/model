package com.hohode.model.decorator.coffee;

import com.hohode.model.decorator.Beverage;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffee";
    }
    public double cost() {
        return .89;
    }

}
