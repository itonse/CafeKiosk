package sample.cafekiosk.unit;

import java.util.ArrayList;
import java.util.List;

public class CafeKiosk {

    private final List<Beverage> beverages = new ArrayList<>();

    public void add(Beverage beverage) {
        beverages.add(beverage);
    }

    public void remove(Beverage beverage) {
        beverages.remove(beverage);
    }

    public void clear() {
        beverages.clear();
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (Beverage beverage : beverages) {
            totalPrice += beverage.getPrice();    // 장바구니에 담은 모든 음료 값 합계
        }
        return totalPrice;
    }
}
