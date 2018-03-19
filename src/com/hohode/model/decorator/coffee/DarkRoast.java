package com.hohode.model.decorator.coffee;

import com.hohode.model.decorator.Beverage;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "DarkRoast";
    }

    public double cost() {
        return .99;
    }
}
