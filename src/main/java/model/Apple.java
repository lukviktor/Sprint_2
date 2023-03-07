package model;

import model.constants.Colour;
import model.constants.Discount;


/*
Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.
 */
public class Apple extends Food {
    String color;

    public Apple(int amount, double prise, String color) {
        super(amount, prise, true);
        this.color = color;
    }

    @Override
    public double getDiscount() {
        if (color.equals(Colour.RED)) return Discount.DISCUNT;
        return super.getDiscount();
    }
}


