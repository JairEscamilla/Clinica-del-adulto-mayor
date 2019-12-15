package controllers;

// Importamos las bibliotecas necesarias
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

// Definimos la clase para el objeto de Correo
public class Correo {
	private String correo, asunto, cuerpo;
	private final Properties properties = new Properties();
	private Session session;
	public Correo(String correo, String asunto, String cuerpo) {
		this.correo = correo;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.mail.sender", "sistemaclinico123@gmail.com");
		properties.put("mail.smtp.user", "sistemaclinico123");
		properties.put("mail.smtp.auth", "true");
		session = Session.getDefaultInstance(properties);
	}


	
	public void EnviarCorreo() {
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress((String)properties.get("mail.smtp.mail.sender")));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(this.correo));
			message.setSubject(this.asunto);
			message.setText(this.cuerpo);
			Transport t = session.getTransport("smtp");
			t.connect((String)properties.get("mail.smtp.user"), "SistemaClinico123");
			t.sendMessage(message, message.getAllRecipients());
			t.close();
			JOptionPane.showMessageDialog(null, "Se ha enviado un correo de verificacion", "Envio de correo", JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception e) {
                        System.out.println(e);
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error al enviar el correo electrónico):", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}