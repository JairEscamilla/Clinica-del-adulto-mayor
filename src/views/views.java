/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.*;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import controllers.*;

public class views extends JFrame {
  public views() {
    super("Administrador de citas - Clinica del Adulto Mayor");
    setSize(900, 600);
    setLocation (150, 100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setIconImage(new ImageIcon(getClass().getResource("ClinicaLogoBorde.png")).getImage());
    EntradasClinica Entradas = new EntradasClinica();
    this.add(Entradas);
    Controller Manejador = new Controller();
    EntradasClinica.BotonAgendar.addActionListener(Manejador);
  }
}