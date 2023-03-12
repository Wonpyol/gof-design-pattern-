package com.study.creational_pattern.abstract_factory._02_after;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip(String name) {
        return new BlackShip(name);
    }
}
