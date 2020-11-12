package Dogs;

public abstract class Dog {
    protected int age;
    protected String color;
    protected String breed;

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void SetAll(int age,String color,String breed) {
        setAge(age);
        setColor(color);
        setBreed(breed);
    }

    public void Out() {
        System.out.println("Собака: " + "\n" +
                "Цвет: " + getColor() + "\n" +
                "Возвраст: " + getAge());
    }
}
