package com.example.allertdialog;

public interface OrderBuilder {

    OrderBuilder setOdertype(OrderType orderType);
    OrderBuilder setBreadtype(BreadType breadType);
    OrderBuilder setSaucetype(SauceType sauceType);
    OrderBuilder setVegetabletype(VegetableType vegetableType);

    Order buil();

}
