import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener {

    private JLabel Titulo, Subtitulos;

    private String[] NumerosD = new String[6];
    private String[] NumerosO = new String[6];

    public JLabel[] Numeros = new JLabel[6];

    public JLabel[] Organizadas = new JLabel[6];

    JButton Click;

    public Ventana() {
        setLayout(null);
        setTitle("ORGANIZAR");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // getContentPane().setBackground(new Color(217, 217, 217));

        // titulos NUMEROS
        Titulo = new JLabel("Numeros");
        Titulo.setFont(new Font("Calibri bold", 3, 18));
        Titulo.setBounds(100, -115, 200, 300);
        add(Titulo);

        // LOS NUmeros
        Numeros[0] = new JLabel("N");
        Numeros[0].setFont(new Font("Calibri mono", 1, 50));
        Numeros[0].setBounds(100, -80, 200, 300);
        add(Numeros[0]);

        Numeros[1] = new JLabel("N");
        Numeros[1].setFont(new Font("Calibri mono", 1, 50));
        Numeros[1].setBounds(175, -80, 200, 300);
        add(Numeros[1]);

        Numeros[2] = new JLabel("N");
        Numeros[2].setFont(new Font("Calibri mono", 1, 50));
        Numeros[2].setBounds(250, -80, 200, 300);
        add(Numeros[2]);

        Numeros[3] = new JLabel("N");
        Numeros[3].setFont(new Font("Calibri mono", 1, 50));
        Numeros[3].setBounds(325, -80, 200, 300);
        add(Numeros[3]);

        Numeros[4] = new JLabel("N");
        Numeros[4].setFont(new Font("Calibri mono", 1, 50));
        Numeros[4].setBounds(400, -80, 200, 300);
        add(Numeros[4]);

        Numeros[5] = new JLabel("N");
        Numeros[5].setFont(new Font("Calibri mono", 1, 50));
        Numeros[5].setBounds(475, -80, 200, 300);
        add(Numeros[5]);

        // subtitulos ORGANIZADAS
        Subtitulos = new JLabel("Organizadas");
        Subtitulos.setFont(new Font("Calibri bold", 3, 18));
        Subtitulos.setBounds(100, -20, 200, 300);
        add(Subtitulos);

        // LOS ORganizadas
        Organizadas[0] = new JLabel("N");
        Organizadas[0].setFont(new Font("Calibri mono", 1, 50));
        Organizadas[0].setBounds(100, 15, 200, 300);
        add(Organizadas[0]);

        Organizadas[1] = new JLabel("N");
        Organizadas[1].setFont(new Font("Calibri mono", 1, 50));
        Organizadas[1].setBounds(175, 15, 200, 300);
        add(Organizadas[1]);

        Organizadas[2] = new JLabel("N");
        Organizadas[2].setFont(new Font("Calibri mono", 1, 50));
        Organizadas[2].setBounds(250, 15, 200, 300);
        add(Organizadas[2]);

        Organizadas[3] = new JLabel("N");
        Organizadas[3].setFont(new Font("Calibri mono", 1, 50));
        Organizadas[3].setBounds(325, 15, 200, 300);
        add(Organizadas[3]);

        Organizadas[4] = new JLabel("N");
        Organizadas[4].setFont(new Font("Calibri mono", 1, 50));
        Organizadas[4].setBounds(400, 15, 200, 300);
        add(Organizadas[4]);

        Organizadas[5] = new JLabel("N");
        Organizadas[5].setFont(new Font("Calibri mono", 1, 50));
        Organizadas[5].setBounds(475, 15, 200, 300);
        add(Organizadas[5]);

        // Iniciar el BOTON
        Click = new JButton("PULSAR");
        Click.setFont(new Font("Calibri", 1, 18));
        Click.setBounds(475, 210, 100, 40);
        Click.setForeground(new Color(11, 53, 133));
        // Click.setBackground(new Color(0, 255, 133));
        add(Click);
        Click.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Click) {

            Organizar6E Ordenalo = new Organizar6E();
            Ordenalo.Variables();
            NumerosD[0] = "" + Ordenalo.A;
            NumerosD[1] = "" + Ordenalo.B;
            NumerosD[2] = "" + Ordenalo.C;
            NumerosD[3] = "" + Ordenalo.D;
            NumerosD[4] = "" + Ordenalo.E;
            NumerosD[5] = "" + Ordenalo.F;

            for (int i = 0; i <= 5; i++) {
                Numeros[i].setText(NumerosD[i]);
            }

            Ordenalo.Ordenando();
            NumerosO[0] = "" + Ordenalo.A;
            NumerosO[1] = "" + Ordenalo.B;
            NumerosO[2] = "" + Ordenalo.C;
            NumerosO[3] = "" + Ordenalo.D;
            NumerosO[4] = "" + Ordenalo.E;
            NumerosO[5] = "" + Ordenalo.F;

            for (int i = 0; i <= 5; i++) {
                Organizadas[i].setText(NumerosO[i]);
            }

        }
    }

    public static void main(String args[]) {
        Ventana Laventana = new Ventana();
        Laventana.setBounds(0, 0, 600, 300);
        Laventana.setVisible(true);
        Laventana.setResizable(false);
        Laventana.setLocationRelativeTo(null);

    }

}
