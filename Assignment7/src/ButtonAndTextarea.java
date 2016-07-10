import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ButtonAndTextarea extends JFrame {

	JButton input; // Set launch button
	JTextArea ta; // Set textarea
	int i = 0; // Set a variable to count if the number of clicks are more than
				// numbers of lines

	public ButtonAndTextarea() {
		setTitle("Stray Birds"); // set frame name
		create();
		add();
		addListeners();
		setSize(900, 500); // set window size
		setVisible(true); // set it show on the desktop
	}

	private void create() {
		input = new JButton("Launch"); //Set the buttonname and textareasize
		ta = new JTextArea(20, 60);
	}

	private void addListeners() {
		ButtonClick bc = new ButtonClick(); // Initialize listener
		input.addActionListener(bc); // Add listener to button
	}

	private void add() {
		BorderLayout bl = new BorderLayout();
		Container con = super.getContentPane();
		con.setLayout(bl);
		JPanel p = new JPanel();
		p.add(ta);
		con.add("North", p);
		con.add("South", input); // Add button and textarea to the panel
	}

	class ButtonClick implements ActionListener { // Define buttonclik which
													// declare above

		@Override
		public void actionPerformed(ActionEvent e) {
			File file = new File("/Users/kk/desktop/stray birds.txt"); // New
																		// file

			try {
				ArrayList<String> ret = ReverseImportLine.readFile(file);

				ta.append(ret.get(i) + "\n");
				i++;
				if (i >= ret.size()) {
					IOException e1 = new IOException();
					throw e1; // Throw error when reach the end of the arraylist
				}
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "The ArrayList ends there", "Error", JOptionPane.ERROR_MESSAGE);
				System.exit(0); // Catch exception and exit the program
			}

		}

	}

	public static void main(String[] args) {
		new ButtonAndTextarea();	//New object

	}
}
