import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.SwingConstants;

import javax.swing.JButton;

public class Ventana extends JFrame{

    public Ventana(){
        setLayout(new BorderLayout());
        setSize(1080,720); //Establece el tamaño de la ventas  LARGO x ANCHO
        setLocationRelativeTo(null); //Establece la ubicacion inicial de la ventana en medio de la pantalla
        setTitle("Ventana");  // Establece el titulo de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra la ventana al oprimir X

        Componentes(); //Agrega los componentes a la ventana
    }

    private void Componentes(){
        JPanel contenedor = new JPanel(); //Crea el panel
        contenedor.setBackground(Color.WHITE); //Establece el color del panel
        add(contenedor); //Agrega el panel a la ventana
        this.getContentPane().setBackground(Color.WHITE); //Establece el color de la ventana

        contenedor.setLayout(new BorderLayout()); // Crea el layout de 5 paneles
        JPanel contenedorNorte = new JPanel();
        

        JLabel texto1= new JLabel();
        texto1.setText("CELESTE"); //Establece el texto de la etiqueta
        texto1.setOpaque(true); //Establece si se pinta el fondo de la etiqueta
        texto1.setBackground(Color.CYAN); // Establece el color de fondo de la etiqueta
        texto1.setForeground(Color.DARK_GRAY); // Establece el color de la letra;
        texto1.setFont(new Font("Arial",Font.BOLD,36));
        texto1.setHorizontalAlignment(SwingConstants.CENTER);

        add(contenedorNorte, BorderLayout.NORTH);
        contenedorNorte.setLayout(new GridLayout(1, 1));
        contenedorNorte.add(texto1);
        
        JPanel contenedorOeste= new JPanel();
        add(contenedorOeste, BorderLayout.WEST);


        JLabel texto2= new JLabel();
        texto2.setText("Inicio");
        texto2.setForeground(Color.DARK_GRAY);
        texto2.setFont(new Font("Arial",0,20));

        contenedorOeste.setLayout(new GridLayout(15,1));
        contenedorOeste.add(texto2);

        JPanel contenedorCentro = new JPanel();
        contenedorCentro.setLayout(null);
        add(contenedorCentro, BorderLayout.CENTER);

        JLabel texto3= new JLabel();
        texto3.setText("Bienvenido");
        texto3.setForeground(Color.black);
        texto3.setBackground(Color.black);
        texto3.setFont(new Font("Arial",Font.BOLD,36));
        contenedorCentro.add(texto3);
        texto3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        contenedorCentro.add(texto3);

        JLabel texto4= new JLabel();
        texto4.setText("Información");
        texto4.setForeground(Color.darkGray);
        texto4.setBounds(100,50, 500,500);
        texto4.setFont(new Font("Arial",0,20));
        contenedorOeste.add(texto4);
       
        JButton iniciar = new JButton();
        iniciar.setSize(100,100);
        iniciar.setText("Iniciar sesión");
        iniciar.setFont(new Font("Arial", 0, 20));
        iniciar.setBackground(Color.WHITE);
        contenedorCentro.add(iniciar);

        JButton registrar = new JButton ();
        registrar.setText("Registrar");
        registrar.setFont(new Font("Arial", 0, 20));
        registrar.setBackground(Color.WHITE);
        contenedorCentro.add(registrar);
        
        JButton ayuda = new JButton ();
        ayuda.setText("Necesito ayuda");
        ayuda.setFont(new Font("Arial",0,20));
        ayuda.setBackground(Color.WHITE);
        contenedorCentro.add(ayuda); //

        redimensionar(texto3, iniciar, registrar, ayuda);

        contenedorCentro.setBackground(Color.WHITE);

    }

    public void redimensionar(JLabel texto3, JButton iniciar, JButton registrar, JButton ayuda){
        texto3.setBounds(360,200,300,100);
        texto3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        iniciar.setBounds(250,300,200,50);
        registrar.setBounds(470,300,200,50);
        ayuda.setBounds(360,360,200,50);

    }
    
}
