package javabomb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPuzzle extends JFrame {

    public VentanaPuzzle() {
        setTitle("Desactiva la bomba - Puzzle 1");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel pregunta = new JLabel("<html><center>¿Cuál es el tipo de dato correcto<br>para almacenar números decimales en Java?</center></html>", SwingConstants.CENTER);
        pregunta.setFont(new Font("Arial", Font.PLAIN, 16));

        JTextField campoRespuesta = new JTextField();
        JButton botonEnviar = new JButton("Enviar");

        JLabel resultado = new JLabel("", SwingConstants.CENTER);
        resultado.setFont(new Font("Arial", Font.BOLD, 14));

        botonEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String respuesta = campoRespuesta.getText().trim().toLowerCase();
                if (respuesta.equals("double") || respuesta.equals("float")) {
                    JOptionPane.showMessageDialog(null, "Prepárate para el siguiente desafío...");
dispose(); // Cierra esta ventana
new VentanaPuzzle2().setVisible(true); // Abre el siguiente puzzle
                    resultado.setForeground(new Color(0, 128, 0));
                    botonEnviar.setEnabled(false);
                } else {
                    resultado.setText("❌ Incorrecto. Intenta de nuevo.");
                    resultado.setForeground(Color.RED);
                }
            }
        });

        setLayout(new BorderLayout(10, 10));
        add(pregunta, BorderLayout.NORTH);
        add(campoRespuesta, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel(new GridLayout(2, 1));
        panelInferior.add(botonEnviar);
        panelInferior.add(resultado);

        add(panelInferior, BorderLayout.SOUTH);
    }
}
