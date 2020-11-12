package Furni;

public class Chair extends Furniture {
    protected String view;

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
    public Chair(int height,int width ,int length, int price, String view) {
        setHeight(height);
        setWidth(width);
        setLength(length);
        setPrice(price);
        setView(view);
    }
}
