package Dogs;

    public class Dog1 extends Dog {
        private int weight;


        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
        public void Out() {
            super.Out();
            System.out.println("Порода: " + getBreed() + "\n" +
                    "Вес: " + getWeight());
        }
}
