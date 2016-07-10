package project.vehicle.management.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import project.vehicle.management.data.access.CarManager;
import project.vehicle.management.ui.DearlerMainScreen.MyTableModel;

@SuppressWarnings("serial")
public class DealerDelFunc extends JFrame {
	private JButton yes;
	private JButton no;
	private JLabel confirm;
	private JPanel temp;
	private JPanel button;
	private JPanel label;
	private Container con;
	String dealerid;
	public List<Integer> ret;
	public CarManager dealer;
	private MyTableModel tableM;

	//main constructor
	public DealerDelFunc(CarManager dealerRes, List<Integer> res, MyTableModel tableM) {
		setTitle("Delete");
		create();
		add();
		addListeners();
		setSize(300,90);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
		this.tableM = tableM;
		this.ret = res;
		this.dealer = dealerRes;

	}
// add listeners to buttons
	private void addListeners() {
		ButtonClick bc = new ButtonClick();
		yes.addActionListener(bc);
		no.addActionListener(bc);

	}
// create buttons and panels
	private void create() {
		yes = new JButton("Yes");
		no = new JButton("No");
		confirm = new JLabel("Delete selected rows ?");
		label = new JPanel();
		temp = new JPanel();
		con = super.getContentPane();
		button = new JPanel(new CardLayout());

	}

	//add components to panel
	private void add() {

		temp.add(yes);
		temp.add(no);
		label.add(confirm);
		button.add(temp);
		con.add(button, BorderLayout.CENTER);
		con.add(label, BorderLayout.PAGE_START);

	}

	// define listener button click
	class ButtonClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == yes)
				try {
					delete(ret);
					dispose();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			else
				dispose();
		}
	}
// delete function
	private void delete(List<Integer> ret) throws IOException {
		for (int i = 0; i<ret.size(); i++){
			dealer.deleteCar(tableM.getCars().get(ret.get(i)).getID());
		}
		tableM.deleteTable(ret);
	}

}