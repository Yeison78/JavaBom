package javabomb;

import javax.swing.*;
import java.awt.*;

public class VentanaInicio extends JFrame {

    public VentanaInicio() {
        setTitle("JavaBomb - Juego Educativo");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel titulo = new JLabel("💣 JavaBomb", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel subtitulo = new JLabel("Juego cooperativo para aprender Java", SwingConstants.CENTER);

        JButton botonIniciar = new JButton("Iniciar Juego");
        botonIniciar.setFont(new Font("Arial", Font.PLAIN, 18));

        botonIniciar.addActionListener(e -> {
            String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
            if (nombre != null && !nombre.isEmpty()) {
                dispose();
                new VentanaPuzzle().setVisible(true);
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));
        panel.add(titulo);
        panel.add(subtitulo);
        panel.add(new JLabel());
        panel.add(botonIniciar);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaInicio().setVisible(true);
        });
    }
}


