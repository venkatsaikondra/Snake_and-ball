import javax.swing.*;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Snake Game");
        f.setBounds(10, 10, 905, 700);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePlay gameplay = new GamePlay();
        f.setBackground(Color.darkGray); 

        f.add(gameplay);
        f.setVisible(true); 
    }
}
