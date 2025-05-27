package javabomb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPuzzle2 extends JFrame {

    public VentanaPuzzle2() {
        setTitle("Desactiva la bomba - Puzzle 2");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel pregunta = new JLabel("<html><center>¿Cuál es la salida del siguiente código Java?<br><br>"
            + "int x = 10;<br>"
            + "if (x > 5) {<br>"
            + "&nbsp;&nbsp;&nbsp;&nbsp;System.out.println(\"A\");<br>"
            + "} else {<br>"
            + "&nbsp;&nbsp;&nbsp;&nbsp;System.out.println(\"B\");<br>"
            + "}</center></html>", SwingConstants.CENTER);

        JTextField campoRespuesta = new JTextField();
        JButton botonEnviar = new JButton("Enviar");

        JLabel resultado = new JLabel("", SwingConstants.CENTER);
        resultado.setFont(new Font("Arial", Font.BOLD, 14));

        botonEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String respuesta = campoRespuesta.getText().trim().toUpperCase();
                if (respuesta.equals("A")) {
                    resultado.setText("✅ ¡Correcto! Segunda bomba desactivada.");
                    resultado.setForeground(new Color(0, 128, 0));
                    botonEnviar.setEnabled(false);
                } else {
                    resultado.setText("❌ Incorrecto. Vuelve a intentarlo.");
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
