package Calculadora;

import java.awt.*;
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

	String Mcampo1 = "0";
	String Mcampo2 = "0";

	public Calculadora() {
		super.setTitle("Calculadora");
		this.setLayout(new FlowLayout());

		// cambiar icona App
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image miIcono = mipantalla.getImage("src\\Calculadora\\calculadora.png");
		setIconImage(miIcono);

		// Caixes de text
		JLabel Lbl1 = new JLabel("Primer operador");
		JLabel Lbl2 = new JLabel("Segun operandor");
		JLabel Lbl3 = new JLabel("Resultat");
		JLabel Lbl4 = new JLabel("Llista resultats");
		Lbl1.setHorizontalAlignment(JLabel.CENTER);
		Lbl2.setHorizontalAlignment(JLabel.CENTER);
		Lbl3.setHorizontalAlignment(JLabel.CENTER);
		Lbl4.setHorizontalAlignment(JLabel.CENTER);

		// Titol Superior i inferior
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

		// Variables
		final JTextField campo1 = new JTextField();
		final JTextField campo2 = new JTextField(10);
		final JTextField resultado = new JTextField(10);
		// campo1.setText(Integer.toString(Mcampo1));
		// campo2.setText(Integer.toString(Mcampo2));

		// Botons
		JButton suma = new JButton("+");
		JButton resta = new JButton("-");
		JButton mult = new JButton("*");
		JButton div = new JButton("/");
		JButton modul = new JButton("%");
		JButton sortir = new JButton("Sortir");
		JButton borrar = new JButton("Clear");
		JButton ms = new JButton("MS");
		JButton mr = new JButton("MR");
		JButton mc = new JButton("MC");
		JButton arrelquadrada = new JButton("√₂");
		JButton exponencial = new JButton("xⁿ");

		JList lista = new JList();
		JComboBox combo = new JComboBox();
		JTextArea jta = new JTextArea();

		// Combo borrar llista

		combo.addItem("Escull una oprción");
		combo.addItem("borrar lista");

		Container cp = getContentPane();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		JPanel Central = new JPanel();

		cp.setLayout(new BorderLayout());

		p1.setLayout(new GridLayout(2, 3));
		p2.setLayout(new GridLayout(1, 4));
		p3.setLayout(new GridLayout(1, 2));
		p4.setLayout(new GridLayout(1, 1));
		p5.setLayout(new GridLayout(2, 1));
		p6.setLayout(new GridLayout(2, 1));

		Central.setLayout(new GridLayout(6, 1));

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
		p3.add(ms);
		p3.add(mr);
		p3.add(mc);
		p4.add(arrelquadrada);
		p4.add(exponencial);
		p5.add(lista);
		p5.add(Lbl4);
		p6.add(combo);
		p6.add(jta);
		pack();
		resultado.setEditable(false);

		Vector datos = new Vector();

		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double suma = 0.0;
				suma = Double.valueOf(campo1.getText()) + Double.valueOf(campo2.getText());
				resultado.setText(Double.toString(suma));
				String p = campo1.getText() + "+" + campo2.getText() + "=" + resultado.getText();
				datos.add(p);
				lista.setListData(datos);
			}
		});

		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double resta = 0.0;
				resta = Double.valueOf(campo1.getText()) - Double.valueOf(campo2.getText());
				resultado.setText(Double.toString(resta));
				String p = campo1.getText() + "-" + campo2.getText() + "=" + resultado.getText();
				datos.add(p);
				lista.setListData(datos);
			}
		});

		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double multi = 0.0;
				multi = Double.valueOf(campo1.getText()) * Double.valueOf(campo2.getText());
				resultado.setText(Double.toString(multi));
				String p = campo1.getText() + "X" + campo2.getText() + "=" + resultado.getText();
				datos.add(p);
				lista.setListData(datos);
			}
		});

		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double divi = 0.0;
				divi = Double.valueOf(campo1.getText()) / Double.valueOf(campo2.getText());
				resultado.setText(Double.toString(divi));
				String p = campo1.getText() + "/" + campo2.getText() + "=" + resultado.getText();
				datos.add(p);
				lista.setListData(datos);
			}
		});

		modul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double modul = 0.0;
				modul = Double.valueOf(campo1.getText()) % Double.valueOf(campo2.getText());
				resultado.setText(Double.toString(modul));
				String p = campo1.getText() + "%" + campo2.getText() + "=" + resultado.getText();
				datos.add(p);
				lista.setListData(datos);
			}
		});

		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (combo.getSelectedIndex() == 0) {
					campo1.setText("");
					campo2.setText("");
					resultado.setText("");
				} else if (combo.getSelectedIndex() == 1) {
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

		// Borrar memoria
		mc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo1.setText("");
				campo2.setText("");
				resultado.setText("");
				Mcampo1 = "0";
				Mcampo2 = "0";
				// Verif consola

				System.out.println(Mcampo1 + "-" + Mcampo2);
			}

		});

		// Enregistrar Memoria
		ms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (campo1.getText() == "") {
					campo2.setName("0");
				} else {
					Mcampo1 = campo1.getText();

				}

				if (campo2.getText() == "") {
					campo2.setName("0");
				} else {
					Mcampo2 = campo2.getText();
				}

				// Verif consola

				System.out.println(Mcampo1 + "-" + Mcampo2);
			}

		});

		// Invocar memoria
		mr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				campo1.setText(Mcampo1);
				campo2.setText(Mcampo2);

				System.out.println(Mcampo1 + "-" + Mcampo2);
			}

		});

		// Arrel quadrada
		arrelquadrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double raiz = 0.0;
				raiz = (Double) Math.sqrt(Double.valueOf(campo1.getText()));

				campo2.setText("0");

				resultado.setText(Double.toString(raiz));
				String p = "√₂ de : " + campo1.getText() + "=" + resultado.getText();
				datos.add(p);
				lista.setListData(datos);

			}

		});

		// Exponencial
		exponencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double expo = 0.0;
				expo = (Double) Math.pow(Double.valueOf(campo1.getText()), Double.valueOf(campo2.getText()));

				resultado.setText(Double.toString(expo));
				String p = campo1.getText() + "^" + campo2.getText() + "=" + resultado.getText();
				datos.add(p);
				lista.setListData(datos);

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

		// menu salir
		mi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculadora().setVisible(true);

	}

}
