package Furni;

public abstract class Furniture {
    protected int height;
    protected int width;
    protected int length;
    protected int price;

    public void setLength(int length) {
        this.length = length;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getPrice() {
        return price;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

}
