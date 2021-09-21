package Calculadora;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Calculadora extends JFrame {

	public Calculadora() {
		super.setTitle("Calculadora");
		
		//cambiar icona App
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image miIcono = mipantalla.getImage("src\\Calculadora\\calculadora.png");
		setIconImage (miIcono);
		
		//Caixes de text
		JLabel Lbl1 = new JLabel("Primer operador");
		JLabel Lbl2 = new JLabel("Segun operandor");
		JLabel Lbl3 = new JLabel("Resultat");
		JLabel Lbl4 = new JLabel("Lista resultats");
		Lbl1.setHorizontalAlignment(JLabel.CENTER);
		Lbl2.setHorizontalAlignment(JLabel.CENTER);
		Lbl3.setHorizontalAlignment(JLabel.CENTER);
		Lbl4.setHorizontalAlignment(JLabel.CENTER);
		/*JLabel Lbl5 = new JLabel("Opciones del combo");
		Lbl5.setHorizontalAlignment(JLabel.CENTER);
		JLabel Lbl6 = new JLabel("Contenido TextArea");
		Lbl6.setHorizontalAlignment(JLabel.CENTER);*/
		//
		JLabel lnorte = new JLabel("Calculadora ITAcademi");
		JLabel lsur = new JLabel("Copyright Todos los derechos reservados");

		// menu
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("Archivo");
		JMenuItem mi1 = new JMenuItem("Exportar como texto");
		JMenuItem mi2 = new JMenuItem("Salir");
		setJMenuBar(mb);
		mb.add(menu);
		menu.add(mi1);
		menu.add(mi2);

		
		final JTextField campo1 = new JTextField(10);
		final JTextField campo2 = new JTextField(10);
		final JTextField resultado = new JTextField(10);
		
		//Botons
		JButton suma = new JButton("+");
		JButton resta = new JButton("-");
		JButton mult = new JButton("*");
		JButton div = new JButton("/");
		JButton modul = new JButton("%");
		JButton sortir = new JButton("Sortir");
		JButton borrar = new JButton("C");
		//JButton Btn6 = new JButton("Color");

		JList lista = new JList();
		JComboBox combo = new JComboBox();
		JTextArea jta = new JTextArea();
		//JSpinner spinner = new JSpinner();
		
		/*Canviar font
		
		JRadioButton radio1 = new JRadioButton("Gabriola");
		JRadioButton radio2 = new JRadioButton("Algerian");
		JRadioButton radio3 = new JRadioButton("Helvetica");
		ButtonGroup radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(radio1);
		radioButtonGroup.add(radio2);
		radioButtonGroup.add(radio3);
		
		final Font a= new Font("Gabriola",Font.BOLD + Font.PLAIN,15);
		final Font b= new Font("Algerian",Font.BOLD + Font.PLAIN,15);
		final Font c= new Font("Helvetic",Font.BOLD + Font.PLAIN,15);
		*/
		
		///////////////////////////////////////////////////////////

		combo.addItem("Escoge una oprción");
		//combo.addItem("Borrar textFields");
		combo.addItem("borrar lista");
		//combo.addItem("mostrar lista como texto");

		//Checkbox check1 = new Checkbox("Texto rojo-negro");
		//Checkbox check2 = new Checkbox("Bloquear Todo");

		Container cp = getContentPane();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		JPanel Central = new JPanel();

		// cp.setLayout(new GridLayout(6, 1));
		cp.setLayout(new BorderLayout());

		p1.setLayout(new GridLayout(2, 3));
		p2.setLayout(new GridLayout(1, 4));
		p3.setLayout(new GridLayout(1, 2));
		p4.setLayout(new GridLayout(1, 1));
		p5.setLayout(new GridLayout(2, 1));
		p6.setLayout(new GridLayout(2, 1));

		Central.setLayout(new GridLayout(6, 1));
		
		// cp.add(p1); cp.add(p2); cp.add(p3); cp.add(p4); cp.add(p5); cp.add(p6);
		 
		Central.add(p1);
		Central.add(p2);
		Central.add(p3);
		Central.add(p4);
		Central.add(p5);
		Central.add(p6);

		cp.add(Central, BorderLayout.CENTER);
		cp.add(lnorte, BorderLayout.NORTH);
		cp.add(lsur, BorderLayout.SOUTH);

		p1.add(Lbl1);
		p1.add(Lbl2);
		p1.add(Lbl3);
		p1.add(campo1);
		p1.add(campo2);
		p1.add(resultado);
		p2.add(suma);
		p2.add(resta);
		p2.add(mult);
		p2.add(div);
		p2.add(modul);
		p2.add(sortir);
		p3.add(borrar);
		p4.add(lista);
		p5.add(Lbl4);
		p6.add(combo);
		//p5.add(Lbl5);
		p6.add(jta);
		//p6.add(Lbl6);
		pack();
		resultado.setEditable(false);

		Vector datos = new Vector();

		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int suma = 0;
				suma = Integer.valueOf(campo1.getText()) + Integer.valueOf(campo2.getText());
				resultado.setText(Integer.toString(suma));
				String p = campo1.getText() + "+" + campo2.getText() + "=" + resultado.getText();
				datos.add(p);
				lista.setListData(datos);
			}
		});

		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resta = 0;
				resta = Integer.valueOf(campo1.getText()) - Integer.valueOf(campo2.getText());
				resultado.setText(Integer.toString(resta));
				String p = campo1.getText() + "-" + campo2.getText() + "=" + resultado.getText();
				datos.add(p);
				lista.setListData(datos);
			}
		});

		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int multi = 0;
				multi = Integer.valueOf(campo1.getText()) * Integer.valueOf(campo2.getText());
				resultado.setText(Integer.toString(multi));
				String p = campo1.getText() + "X" + campo2.getText() + "=" + resultado.getText();
				datos.add(p);
				lista.setListData(datos);
			}
		});

		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int divi = 0;
				divi = Integer.valueOf(campo1.getText()) / Integer.valueOf(campo2.getText());
				resultado.setText(Integer.toString(divi));
				String p = campo1.getText() + "/" + campo2.getText() + "=" + resultado.getText();
				datos.add(p);
				lista.setListData(datos);
			}
		});
		
		modul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int modul = 0;
				modul = Integer.valueOf(campo1.getText()) % Integer.valueOf(campo2.getText());
				resultado.setText(Integer.toString(modul));
				String p = campo1.getText() + "%" + campo2.getText() + "=" + resultado.getText();
				datos.add(p);
				lista.setListData(datos);
			}
		});
		
		
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (combo.getSelectedIndex()==0) {
				campo1.setText("");
				campo2.setText("");
				resultado.setText("");
			}else if (combo.getSelectedIndex()==1) {
				datos.clear();
				lista.setListData(datos);
			}
			}
		});

		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo1.setText("");
				campo2.setText("");
				resultado.setText("");
			}
		});
		sortir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		

		

		// Exportar a texto

		mi1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String nombre = "";
					JFileChooser file = new JFileChooser(System.getProperty("user.dir"));
					file.showSaveDialog(jta);
					File guardar = file.getSelectedFile();

					if (guardar != null) {
						BufferedWriter writer = new BufferedWriter(new FileWriter(guardar));
						String p = jta.getText();
						p = p.replace(" ", "\r\n");
						writer.write(p);
						writer.close();
					}

				} catch (IOException exp) {
					System.out.println(exp);
				}

			}

		});
		
		//menu salir
		mi2.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				System.exit(0);
			}
		});
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculadora().setVisible(true);

	}

}
