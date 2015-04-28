package ex3f;





import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;

public class Form extends JFrame {

	private JPanel contentPane;
	private JTextField EmployeeIdtxt;
	private JTextField EmployeeNametxt;
	private JTextField Positiontxt;
	private JList list;
	private DefaultListModel employeeList;
	private JComboBox Departmentdrop;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 486, 187);
		contentPane.add(scrollPane);
		
		employeeList = new DefaultListModel();
		list = new JList(employeeList);
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel = new JLabel("Employee Id:");
		lblNewLabel.setBounds(20, 209, 112, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name:");
		lblNewLabel_1.setBounds(20, 234, 142, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Department:");
		lblNewLabel_2.setBounds(20, 259, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Position:");
		lblNewLabel_3.setBounds(20, 284, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		EmployeeIdtxt = new JTextField();
		EmployeeIdtxt.setText("101");
		EmployeeIdtxt.setBounds(135, 205, 147, 20);
		contentPane.add(EmployeeIdtxt);
		EmployeeIdtxt.setColumns(10);
		
		EmployeeNametxt = new JTextField();
		EmployeeNametxt.setText("Ryan Hogan");
		EmployeeNametxt.setBounds(135, 230, 147, 20);
		contentPane.add(EmployeeNametxt);
		EmployeeNametxt.setColumns(10);
		
		Positiontxt = new JTextField();
		Positiontxt.setText("Lead");
		Positiontxt.setBounds(135, 280, 147, 20);
		contentPane.add(Positiontxt);
		Positiontxt.setColumns(10);
		
		JButton btnNoArgs = new JButton("No Args");
		btnNoArgs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNoArgs_actionPerformed(e);
			}
		});
		btnNoArgs.setBounds(30, 305, 142, 50);
		contentPane.add(btnNoArgs);
		
		JButton btn2Args = new JButton("2 Args");
		btn2Args.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btn2Args_actionPerformed(e);
			}
		});
		btn2Args.setBounds(195, 305, 142, 50);
		contentPane.add(btn2Args);
		
		JButton btn4Args = new JButton("4 Args");
		btn4Args.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btn4Args_actionPerformed(e);
			}
		});
		btn4Args.setBounds(347, 305, 112, 50);
		contentPane.add(btn4Args);
		
		Departmentdrop = new JComboBox();
		Departmentdrop.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Humman Resorces", "Manufacturing", "Shipping", "Maninance"}));
		Departmentdrop.setBounds(135, 256, 147, 20);
		contentPane.add(Departmentdrop);
	}
	protected void do_btnNoArgs_actionPerformed(ActionEvent e) {
		
		Employee emp = new Employee();
		employeeList.addElement(emp.emp1());
	}
	protected void do_btn2Args_actionPerformed(ActionEvent e) {
		String SempId = this.EmployeeIdtxt.getText(); 
		int empId = Integer.parseInt(SempId);
		String empName = this.EmployeeNametxt.getText();
		
		Employee emp = new Employee();
		employeeList.addElement(emp.emp2(empId, empName));
		
		//employeeList.addElement(emp);
	}
	protected void do_btn4Args_actionPerformed(ActionEvent e) {
		String SempId = this.EmployeeIdtxt.getText();
		int empId = Integer.parseInt(SempId);
		String empName = this.EmployeeNametxt.getText();
		String empDepartment = (String) Departmentdrop.getSelectedItem();
		String empPosition = this.Positiontxt.getText(); 
		
		Employee emp = new Employee();
		employeeList.addElement(emp.emp3(empId, empName, empDepartment, empPosition));
	}
}
