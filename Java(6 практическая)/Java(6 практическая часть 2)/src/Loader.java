public class Loader {
    public static void main(String[] args) {
        Team team1 = new Team("Команда 1");
        Team team2 = new Team("Команда 2");

        new MyForm(team1, team2);
    }
}
