import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;

public class Buscaminas extends JFrame {
    int dimension =4;
    
    public Buscaminas(){
        setLayout(new BorderLayout());
        setSize(1080, 720); //Establece el tamaño de la ventana  LARGO x ANCHO
        setLocationRelativeTo(null); //Establece la ubicacion inicial de la ventana en medio de la pantalla
        setTitle("Buscaminas");  // Establece el titulo de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra la ventana al oprimir X
        componentes();

    }

    public void componentes(){
        JLabel jugadorName = new JLabel();
        JLabel numeroMinas= new JLabel();
        JLabel score = new JLabel();
        JButton generar = new JButton();
        JLabel vacio = new JLabel();
        JTextField nombreJugadorField = new JTextField(); //
        JTextField numeroMinasField = new JTextField();
        JButton minas[]= new JButton[dimension];

        JPanel norte = new JPanel();
        norte.setBackground(new Color(161, 255, 136));
        norte.setLayout(new GridLayout(2, 3,5,5));
        add(norte, NORTH);

        JPanel centro = new JPanel();
        centro.setBackground(Color.WHITE);
        centro.setLayout(new GridLayout(dimension, dimension,5,5));
        add(centro, CENTER);

        JPanel sur = new JPanel();
        sur.setBackground(new Color(161, 255, 136));
        add(sur, SOUTH);

        jugadorName.setText("Nombre del jugador: ");
        jugadorName.setFont(new Font("Arial",Font.BOLD,15));
        nombreJugadorField.setFont(new Font("Arial",0,15));
        norte.add(jugadorName);
        norte.add(nombreJugadorField);
        
        norte.add(vacio);

        numeroMinas.setText("Numero de minas: ");
        numeroMinas.setFont(new Font("Arial",Font.BOLD,15));
        numeroMinasField.setFont(new Font("Arial",0,15));
        
        norte.add(numeroMinas);
        norte.add(numeroMinasField);
        numeroMinas.setText("Numero de minas: ");

        generar.setText("Generar");
        generar.setBackground(new Color(204, 255, 204));
        generar.setFont(new Font("Arial",Font.BOLD,15));
        norte.add(generar);

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
            minas[i] = new JButton();
            minas[i].setBackground(Color.WHITE);
            minas[i].setFont(new Font("Arial",Font.BOLD,20));
            minas[i].setText("?");
            centro.add(minas[i]);
            }
        }

        score.setText("Score: 4,724");
        score.setFont(new Font("Arial",Font.BOLD,20));
        sur.add(score);
    }
}
