import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener {
	private Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);

	private JTextField textbox = new JTextField("0");
	private int operator = 0;
	private float result = 0;
	private float fnumber = 0, bnumber = 0;

	public Calculator(String title) throws HeadlessException {
		super(title);
		setupFrame();
		setupControls();
	}

	private void setupControls() {
		setupDisplayPanel(); // Set display panel
		setupButtonsPanel(); // Set button panel
	}

	private void setupButtonsPanel() {
		JPanel panel = new JPanel();
		panel.setBorder(border);
		panel.setLayout(new GridLayout(4, 4, 3, 3));

		createButtons(panel,
				new String[] { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/", });

		this.add(panel, BorderLayout.CENTER);
	}

	private void createButtons(JPanel panel, String[] labels) {
		for (String label : labels) {
			JButton b = new JButton(label);
			b.addActionListener(this); // add listener
			panel.add(b);
		}
	}

	private void setupDisplayPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(border);

		setupTextbox();
		panel.add(textbox, BorderLayout.CENTER);
		this.add(panel, BorderLayout.NORTH);
	}

	private void setupTextbox() {
		textbox.setHorizontalAlignment(JTextField.RIGHT); // align text right
		textbox.setEditable(false); // set textfield read only
		textbox.setBackground(Color.white); // set background color
	}

	private void setupFrame() {
		this.setSize(300, 200); // set window size
		this.setResizable(false); // set window size unchangeable
	}

	public void actionPerformed(ActionEvent e) {// add listener action
		String s = e.getActionCommand();
		if (s.equals("+")) {
			this.fnumber = Float.parseFloat(this.textbox.getText());
			this.textbox.setText("");
			this.operator = 1;
		} else if (s.equals("-")) {
			this.fnumber = Float.parseFloat(this.textbox.getText());
			this.textbox.setText("");
			this.operator = 2;
		} else if (s.equals("*")) {
			this.fnumber = Float.parseFloat(this.textbox.getText());
			this.textbox.setText("");
			this.operator = 3;
		} else if (s.equals("/")) {
			this.fnumber = Float.parseFloat(this.textbox.getText());
			this.textbox.setText("");
			this.operator = 4;
		} else if (s.equals(".")) {
			if (textbox.equals("")) {
				textbox.setText("0.");
			} else {
				textbox.setText(textbox.getText() + ".");
			}
		} else if (s.equals("=")) {
			this.bnumber = Integer.parseInt(this.textbox.getText());
			switch (this.operator) {
			case 1:
				result = fnumber + bnumber;
				this.textbox.setText(String.valueOf(result));
				break;
			case 2:
				result = fnumber - bnumber;
				this.textbox.setText(String.valueOf(result));
				break;
			case 3:
				result = fnumber * bnumber;
				this.textbox.setText(String.valueOf(result));
				break;
			case 4:
				result = fnumber / bnumber;
				this.textbox.setText(String.valueOf(result));
				break;
			}
		} else {
			if (textbox.getText().equals("0")) {
				textbox.setText(e.getActionCommand());
			} else {
				textbox.setText(textbox.getText() + e.getActionCommand());
			}
		}
	}

	public static void main(String[] args) {
		Calculator frame = new Calculator("Calculator"); // create new
															// calculator
															// 'calculator'
		frame.setVisible(true);
	}

}
