
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class MyForm extends JFrame{

        private JPanel panel1;
        private JButton team1Button;
        private JButton team2Button;
        private JLabel team1Label;
        private JLabel team2Label;
        private JButton totalButton;
        private JLabel scoreLabel;

        public MyForm(Team team1, Team team2) throws HeadlessException {
            setVisible(true);
            setSize(600, 400);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            add(panel1);

            scoreLabel.setText("0 x 0");

            team1Label.setText(team1.getName());
            team2Label.setText(team2.getName());
            team1Button.setText(team1.getName() + " + 1.");
            team2Button.setText(team2.getName() + " + 1.");
            totalButton.setText("Узнать победителя");
            team1Button.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    team1.increaseScore();
                    scoreLabel.setText(String.valueOf(team1.getScore()) + " " + "x" + " " + String.valueOf(team2.getScore()));
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            team2Button.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    team2.increaseScore();
                    scoreLabel.setText(String.valueOf(team1.getScore()) + " " + "x" + " " + String.valueOf(team2.getScore()));
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });


            totalButton.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (team1.getScore() > team2.getScore()) {
                        JOptionPane.showMessageDialog(MyForm.this, "Команда: " + team1.getName() + " победила!");
                    } else if (team1.getScore() < team2.getScore()) {
                        JOptionPane.showMessageDialog(MyForm.this, "Команда: " + team2.getName() + " победила!");
                    }
                    else {
                        JOptionPane.showMessageDialog(MyForm.this, "Ничья");
                    }
                    team1.setScore(0);
                    team2.setScore(0);
                    scoreLabel.setText("0 x 0");
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
        }

    }

