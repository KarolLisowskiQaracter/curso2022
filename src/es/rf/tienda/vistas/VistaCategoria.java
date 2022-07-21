package es.rf.tienda.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import es.rf.tienda.controladores.ControladorCategoria;
import es.rf.tienda.dominio.Categoria;

public class VistaCategoria{
	private ControladorCategoria controladorCat;
	
	Categoria object;
	JFrame frame;
	JLabel idLabel;
	JLabel nombreLabel;
	JLabel descripcionLabel;
	JTextField idText;
	JTextField nombreText;
	JTextArea descripcionText;
	JButton aceptarBoton;
	JButton cancelarBoton;
	
	public VistaCategoria() {
		controladorCat = new ControladorCategoria(this);
	/*	JFrame vista = new JFrame();
		vista.setTitle("Gestion de categorias");
		vista.setSize(600,400);
		vista.setLocationRelativeTo(null);
		
		JPanel jpanel = new JPanel();*/
	}
	
	public void view() {
		
		frame = new JFrame();
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setSize(500,200);
		frame.setLocationRelativeTo(null);
		
		Container panel = frame.getContentPane();
		
		idLabel = new JLabel("Id.");
		nombreLabel = new JLabel("Nombre");
		descripcionLabel = new JLabel("Descripcion");
		idText = new JTextField();
		nombreText = new JTextField();
		descripcionText = new JTextArea();
		aceptarBoton = new JButton("Aceptar");
		aceptarBoton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					Integer.parseInt(idText.getText());
					if(!idText.getText().equals("") && !idText.getText().equals("") && !idText.getText().equals("")) {
						Categoria cat = new Categoria(Integer.parseInt(idText.getText()),nombreText.getText(),descripcionText.getText());
						controladorCat.crear(cat);
					}
				}catch(Exception exception){
					System.out.println("¡El id debe ser un valor numerico!");
				}
			}
		});
		cancelarBoton = new JButton("Cancelar");
		cancelarBoton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				idText.setText("");
				nombreText.setText("");
				descripcionText.setText("");
			}
		});
		
		GridLayout grid = new GridLayout(4,2);
		panel.setLayout(grid);
		panel.add(idLabel);
		panel.add(idText);
		panel.add(nombreLabel);
		panel.add(nombreText);
		panel.add(descripcionLabel);	
		panel.add(descripcionText);
		panel.add(aceptarBoton);
		panel.add(cancelarBoton);
		
		frame.setVisible(true);
		
	}
	
	    public void sendData(String s1, String s2, String s3) {
	        
	        Map<String, Object> data = new HashMap<String, Object>();
	        data.put("id", s1);
	        data.put("nombre", s2);
	        data.put("descripcion", s3);
	        
	        // generate the event
	    }
	
}
