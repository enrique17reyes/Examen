import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.util.Scanner;

public class Examen extends JFrame {


    //double distancia;
    private JButton btnAceptar;

    private JTextField distancia;

    private JTextField tiempo ;
    private JTextField velocidad;

    private int intentos = 0;
    private JButton btnCancelar;



    public Examen(String titulo, Color colorfondo) {

        Scanner in = new Scanner(System.in);

        this.setTitle(titulo);
        Container panelPrincipal = this.getContentPane();

        panelPrincipal.setBackground(colorfondo);
        panelPrincipal.setLayout(null);

        JLabel dist = new JLabel("Ingresa la distancia : ");
        dist.setBounds(10, 20, 300, 30);
        panelPrincipal.add(dist);
        distancia = new JTextField();
        distancia.setBounds(150, 20, 150, 30);
        panelPrincipal.add(distancia);


        JLabel tiemp = new JLabel("Ingresa el tiempo : ");
        tiemp.setBounds(10, 60, 300, 30);
        panelPrincipal.add(tiemp);
        tiempo = new JTextField();
        tiempo.setBounds(150, 60, 150, 30);
        panelPrincipal.add(tiempo);

        JLabel vel = new JLabel("Ingresa la velocidad : ");
        vel.setBounds(10, 100, 300, 30);
        panelPrincipal.add(vel);
        velocidad = new JTextField();
        velocidad.setBounds(150, 100, 150, 30);
        panelPrincipal.add(velocidad);


        btnAceptar = new JButton("Calcular");
        btnAceptar.setBounds(40, 140, 100, 30);
        panelPrincipal.add(btnAceptar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(150, 140, 100, 30);
        panelPrincipal.add(btnCancelar);



        //Creación de objetos oyentes
        AccionBoton oyenteBtnAceptar = new AccionBoton();
        AccionBoton oyenteBtnCancelar = new AccionBoton();
        AccionBoton oyenteBtnllave = new AccionBoton();

        //Vincular los oyentes a los objetos que generan el evento
        btnAceptar.addActionListener(oyenteBtnAceptar);
        btnCancelar.addActionListener(oyenteBtnCancelar);
        //btnllave.addActionListener(oyenteBtnllave);
    }


        public static void main (String[] args)
        {
            Examen f = new Examen("Primera Ventana", Color.blue);
            f.setSize(350, 300);
            f.setLocation(200, 200);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setResizable(false);
            f.setVisible(true);

        }

    //Declaración de clase interna
    class AccionBoton implements ActionListener {

        //Método controlador del evento ActionEvent
        @Override
        public void actionPerformed(ActionEvent e) {
            double valorDistancia = Double.parseDouble(distancia.getText());
            double valortiempo = Double.parseDouble(tiempo.getText());
            double valorvelocidad = Double.parseDouble(velocidad.getText());

            System.out.println("Haz presionado el botón "
                    + ((JButton) e.getSource()).getText() );




            if ((JButton) e.getSource()== btnAceptar) {
                if (valorvelocidad == 0) {
                    valorvelocidad= valorDistancia/valortiempo;
                    System.out.println("");
                    JOptionPane.showMessageDialog(null,
                            "la velocidad es de :" + valorvelocidad , "se realizo el calculo",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                /*
                else {

                    if(intentos<3) {
                        System.out.println("Acceso denegado. Intente de nuevo");
                        JOptionPane.showMessageDialog(null,
                                "no calculo ", "acceso denegado",
                                JOptionPane.ERROR_MESSAGE);

                        intentos++;

                    }*/

                    {
                        JOptionPane.showMessageDialog(null,
                                "CERRANDO APLICACIÓN ", "se cerro la aplicacion",
                                JOptionPane.ERROR_MESSAGE);
                        System.exit(0); //Cerrar toda la aplicación

                    }
                
            }
            else {
                //this.dispose();
                System.exit(0); //Cerrar toda la aplicación


            }
        }
    } //Class AccionBoton


}//Class MiVentana


