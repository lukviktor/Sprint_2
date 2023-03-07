package model;

import model.constants.Discount;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;



    public Food(int amount, double prise, boolean isVegetarian) {
        this.amount = amount;
        this.price = prise;
        this.isVegetarian = isVegetarian;
    }
    @Override
    public double getDiscount() {
        return Discount.DEFOLT_DISCUNT;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
