package com.example.allertdialog;

public class Order {

    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;


    public Order(OrderType orderType, BreadType breadType, SauceType sauceType, VegetableType vegetableType) {
        this.orderType = orderType;
        this.breadType = breadType;
        this.sauceType = sauceType;
        this.vegetableType = vegetableType;
    }

    public Order() {
    }


    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public void setSauceType(SauceType sauceType) {
        this.sauceType = sauceType;
    }

    public VegetableType getVegetableType() {
        return vegetableType;
    }

    public void setVegetableType(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
    }


    static class Builder implements OrderBuilder{

        private OrderType orderType;
        private BreadType breadType;
        private SauceType sauceType;
        private VegetableType vegetableType;

        @Override
        public OrderBuilder setOdertype(OrderType orderType) {
            this.orderType = orderType;
            return this;
        }

        @Override
        public OrderBuilder setBreadtype(BreadType breadType) {
            this.breadType = breadType;
            return this;
        }

        @Override
        public OrderBuilder setSaucetype(SauceType sauceType) {
            this.sauceType = sauceType;
            return this;
        }

        @Override
        public OrderBuilder setVegetabletype(VegetableType vegetableType) {
            this.vegetableType = vegetableType;
            return this;
        }

        @Override
        public Order buil() {
            return new Order(orderType,breadType,sauceType,vegetableType);
        }
    }
}
