import javax.swing.*;
import java.awt.event.*;

    public class edad extends JFrame {

        private JTextField txtEdad;
        private JButton btnMostrar;
        private JLabel lblResultado;

        public edad() {
            setTitle("Consulta de Edad");
            setSize(350, 200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);

            JLabel lblEdad = new JLabel("Ingrese su edad:");
            lblEdad.setBounds(20, 20, 120, 25);
            add(lblEdad);

            txtEdad = new JTextField();
            txtEdad.setBounds(150, 20, 100, 25);
            add(txtEdad);

            btnMostrar = new JButton("Mostrar");
            btnMostrar.setBounds(100, 70, 120, 30);
            add(btnMostrar);

            lblResultado = new JLabel("");
            lblResultado.setBounds(20, 120, 300, 25);
            add(lblResultado);

            btnMostrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int edad = Integer.parseInt(txtEdad.getText());
                        lblResultado.setText("Tu edad es: " + edad + " años");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null,
                                "Ingrese una edad válida");
                    }
                }
            });

            setVisible(true);
        }

        public static void main(String[] args) {
            new edad();
        }
}
