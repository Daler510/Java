package Dogs;

public class Dog2 extends Dog {
    private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public void Out() {
        super.Out();
        System.out.println("Порода: " + getBreed() + "\n" +
                "Вес: " + getWeight());
    }
}
