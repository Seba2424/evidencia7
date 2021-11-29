import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    Trabajador trabajador=new Trabajador("Sebastian","Calfunao","20973990-9","isapre","modelo");
    public JTextField cajatexto;
    public JPanel panel;
    public Ventana (){

        this.setSize(500,500);
        setTitle("Evidencia7");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        colocarPaneles();
        //colocarEtiquetas();
        colocarBotones();
        //colocarCajasDeTexto();

    }
    private void colocarPaneles(){
        panel = new JPanel();
        //panel.setBackground(Color.CYAN);
        panel.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel);
    }
    private void colocarEtiquetas(){
        JLabel etiqueta = new JLabel();
        etiqueta.setText("HOLA"); // establecemos al texto de la etiqueta
        etiqueta.setBounds(20,20,100,40);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Estableze la alineasion horizontal del texto
        etiqueta.setForeground(Color.blue); //establecemos el color de la letra
        etiqueta.setOpaque(true);//establecemos pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.yellow);//cambiamos el color del fondo de la etiqueta
        etiqueta.setFont(new Font("arial",Font.ITALIC,20));//establemos la fuente del texto
        panel.add(etiqueta); //agregamos la etiqueta al panel

    }
    private void colocarBotones(){
        JButton boton1= new JButton();
        boton1.setText("Mostar datos");
        boton1.setBounds(100,100,120,40);
        boton1.setEnabled(true); //desactiva la interaccion del boton(false), en true funciona
        panel.add(boton1);

        JLabel acompañamiento = new JLabel();
        acompañamiento.setBounds(50,200,500,40);
        panel.add(acompañamiento);
        //agregar evento
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acompañamiento.setText("datos..... \n"+trabajador.trabajadores );
            }
        };
        boton1.addActionListener(oyenteDeAccion);

    }
    private void colocarCajasDeTexto(){
        cajatexto= new JTextField();
        cajatexto.setBounds(50,50,200,30);
        //cajatexto.setText("escriba el nuevo nombre");
        panel.add(cajatexto);
    }
}
