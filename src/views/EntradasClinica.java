/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class EntradasClinica extends JPanel {
  public static JButton BotonAgendar;
  public static JTextField CuadroNombre, CuadroApellidoMaterno, CuadroApellidoPaterno;
  public static JLabel LabelDia, LabelMes, LabelAño;
  EntradasClinica() {
    JLabel LabelFondo, LabelBanner, LabelInterfaz;
    Icon IconoFondo, IconoBanner, IconoInterfaz, IconoBoton;
    setLayout(null);
    CuadroNombre = new JTextField("", 1);
    CuadroNombre.setBounds(50, 151, 160, 25);
    add(CuadroNombre);
    CuadroApellidoMaterno = new JTextField("", 1);
    CuadroApellidoMaterno.setBounds(225, 151, 200, 25);
    add(CuadroApellidoMaterno);
    CuadroApellidoPaterno = new JTextField("", 1);
    CuadroApellidoPaterno.setBounds(440, 151, 190, 25);
    add(CuadroApellidoPaterno);
    LabelDia = new JLabel("31");
    LabelDia.setBounds(685, 162, 50, 25);
    add(LabelDia);
    LabelMes = new JLabel("12");
    LabelMes.setBounds(744, 162, 50, 25);
    add(LabelMes);
    LabelAño = new JLabel("2019");
    LabelAño.setBounds(793, 162, 50, 25);
    add(LabelAño);
    BotonAgendar = new JButton("");
    IconoBoton = new ImageIcon(getClass().getResource("ClinicaBoton.png"));
    BotonAgendar.setIcon(IconoBoton);
    BotonAgendar.setBounds(665, 485, 175, 50);
    add(BotonAgendar);
    LabelBanner = new JLabel();
    IconoBanner = new ImageIcon(getClass().getResource("ClinicaBanner.png"));
    LabelBanner.setIcon(IconoBanner);
    LabelBanner.setBounds(0, 25, 900, 75);
    add(LabelBanner);
    LabelInterfaz = new JLabel();
    IconoInterfaz = new ImageIcon(getClass().getResource("ClinicaInterfaz.png"));
    LabelInterfaz.setIcon(IconoInterfaz);
    LabelInterfaz.setBounds(0, 0, 900, 600);
    add(LabelInterfaz);
    LabelFondo = new JLabel();
    IconoFondo = new ImageIcon(getClass().getResource("ClinicaFondo.png"));
    LabelFondo.setIcon(IconoFondo);
    LabelFondo.setBounds(0, -200, 900, 900);
    add(LabelFondo);
  }
}