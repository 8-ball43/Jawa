import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame okno = new JFrame();

        okno.setTitle("Wprowadzane danych do paszportu: 00000 ");
        okno.setSize(600, 400);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);

        okno.getContentPane().setBackground(Color.decode("#5F9EA0"));

        JLabel tekst = new JLabel("Numer");
        tekst.setForeground(Color.decode("#000000"));
        okno.setLayout(new FlowLayout());
        okno.add(tekst);

        JLabel text = new JLabel("Imie");
        tekst.setForeground(Color.decode("#000000"));
        okno.add(text);
    }
}