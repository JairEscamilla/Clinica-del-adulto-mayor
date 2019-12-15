/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.File;
import views.*;

public class Controller implements ActionListener {
  static int DiaActual, MesActual, AñoActual;
  public void actionPerformed(ActionEvent Evento) {
    if(Evento.getSource() == EntradasClinica.BotonAgendar) {
      try {
        Date Fecha = new Date();
        SimpleDateFormat ObjetoFormato = new SimpleDateFormat("dd");
	SimpleDateFormat ObjetoFormato2 = new SimpleDateFormat("MM");
	SimpleDateFormat ObjetoFormato3 = new SimpleDateFormat("yyyy");
	DiaActual = Integer.parseInt(ObjetoFormato.format(Fecha));
	MesActual = Integer.parseInt(ObjetoFormato2.format(Fecha));
	AñoActual = Integer.parseInt(ObjetoFormato3.format(Fecha));
        EntradasClinica.LabelDia.setText("" + DiaActual);
        EntradasClinica.LabelMes.setText("" + MesActual);
        EntradasClinica.LabelAño.setText("" + AñoActual);
      }catch(Exception E) {
        JOptionPane.showMessageDialog(null, "Algo pasó", "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}