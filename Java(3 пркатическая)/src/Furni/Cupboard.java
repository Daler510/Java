package Furni;

public class Cupboard extends Furniture {
    protected int Numb_of_shelves;

    public int getNumb_of_shelves() {
        return Numb_of_shelves;
    }

    public void setNumb_of_shelves(int numb_of_shelves) {
        Numb_of_shelves = numb_of_shelves;
    }
    public Cupboard(int height,int width ,int length, int price, int Numb_of_shelves) {
        setNumb_of_shelves(Numb_of_shelves);
        setHeight(height);
        setWidth(width);
        setLength(length);
        setPrice(price);
    }
}
