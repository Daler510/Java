package Furni;

public class Table extends Furniture {
    protected int Number_of_legs;

    public int getNumber_of_legs() {
        return Number_of_legs;
    }

    public void setNumber_of_legs(int number_of_legs) {
        Number_of_legs = number_of_legs;
    }
    public Table(int height,int width ,int length, int price, int Number_of_legs) {
        setNumber_of_legs(Number_of_legs);
        setHeight(height);
        setWidth(width);
        setLength(length);
        setPrice(price);
    }


}