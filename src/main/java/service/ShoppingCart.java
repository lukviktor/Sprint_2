package service;

import model.Food;

//        получить общую сумму товаров в корзине без скидки,
//        получить общую сумму товаров в корзине со скидкой,
//        получить общую сумму всех вегетарианских продуктов в корзине без скидки.
public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getFullPrise() {
        double sum = 0;
        for (Food food : foods) {
            sum = sum + food.getAmount() * food.getPrice();
        }
        return sum;
    }
    public double getDiscountPrise() {
        double sum = 0;
        for (Food food : foods) {
            double priseWithDiscount = food.getAmount() * food.getPrice()* (1 - food.getDiscount() / 100.0);
            sum += priseWithDiscount;
        }
        return sum;
    }
    public double getFullVegetarianPrise() {
        double sum = 0;
        for (Food food : foods) {
            if (food.isVegetarian() )
                sum += food.getAmount() * food.getPrice();
        }
        return sum;
    }
}


