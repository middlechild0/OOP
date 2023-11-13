import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employee_Payroll {

	private JFrame frame;
	private JTextField Employeename;
	private JTextField txtHourlySalary;
	private JTextField txtMonday1;
	private JTextField txtTuesday1;
	private JTextField txtWednesday1;
	private JTextField txtThursday1;
	private JTextField txtFriday1;
	private JTextField txtSaturday1;
	private JTextField txtSunday1;
	private JTextField txtMonday2;
	private JTextField txtTuesday2;
	private JTextField txtWednesday2;
	private JTextField txtThursday2;
	private JTextField txtFriday2;
	private JTextField txtSaturday2;
	private JTextField txtSunday2;
	private JLabel lblMonday;
	private JLabel lblTuesday;
	private JLabel lblWednesday;
	private JLabel lblThursday;
	private JLabel lblFriday;
	private JLabel lblSaturday;
	private JLabel lblSunday;
	private JTextField txtHoursR;
	private JTextField txtHoursOv;
	private JTextField txtAmountR;
	private JTextField txtAmountO;
	private JTextField txtNet;
	private JButton btnProcessIt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Payroll window = new Employee_Payroll();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Employee_Payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 861, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Employee Identification:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 825, 75);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Employee Name :");
		lblEmployeeName.setBounds(39, 34, 102, 15);
		panel.add(lblEmployeeName);
		
		Employeename = new JTextField();
		Employeename.setBounds(156, 32, 140, 17);
		panel.add(Employeename);
		Employeename.setColumns(10);
		
		JLabel lblHourlySalary = new JLabel("Hourly Salary:");
		lblHourlySalary.setBounds(412, 34, 102, 14);
		panel.add(lblHourlySalary);
		
		txtHourlySalary = new JTextField();
		txtHourlySalary.setBounds(502, 31, 124, 17);
		panel.add(txtHourlySalary);
		txtHourlySalary.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Timesheet:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 84, 825, 150);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFirstWeek = new JLabel("First Week :");
		lblFirstWeek.setBounds(33, 56, 79, 14);
		panel_1.add(lblFirstWeek);
		
		JLabel lblSecondWeek = new JLabel("Second Week :");
		lblSecondWeek.setBounds(33, 97, 92, 14);
		panel_1.add(lblSecondWeek);
		
		txtMonday1 = new JTextField();
		txtMonday1.setBounds(153, 53, 86, 20);
		panel_1.add(txtMonday1);
		txtMonday1.setColumns(10);
		
		txtTuesday1 = new JTextField();
		txtTuesday1.setBounds(249, 53, 86, 20);
		panel_1.add(txtTuesday1);
		txtTuesday1.setColumns(10);
		
		txtWednesday1 = new JTextField();
		txtWednesday1.setBounds(345, 53, 86, 20);
		panel_1.add(txtWednesday1);
		txtWednesday1.setColumns(10);
		
		txtThursday1 = new JTextField();
		txtThursday1.setBounds(441, 53, 86, 20);
		panel_1.add(txtThursday1);
		txtThursday1.setColumns(10);
		
		txtFriday1 = new JTextField();
		txtFriday1.setBounds(537, 53, 86, 20);
		panel_1.add(txtFriday1);
		txtFriday1.setColumns(10);
		
		txtSaturday1 = new JTextField();
		txtSaturday1.setBounds(633, 53, 86, 20);
		panel_1.add(txtSaturday1);
		txtSaturday1.setColumns(10);
		
		txtSunday1 = new JTextField();
		txtSunday1.setBounds(729, 53, 86, 20);
		panel_1.add(txtSunday1);
		txtSunday1.setColumns(10);
		
		txtMonday2 = new JTextField();
		txtMonday2.setColumns(10);
		txtMonday2.setBounds(153, 94, 86, 20);
		panel_1.add(txtMonday2);
		
		txtTuesday2 = new JTextField();
		txtTuesday2.setBounds(249, 94, 86, 20);
		panel_1.add(txtTuesday2);
		txtTuesday2.setColumns(10);
		
		txtWednesday2 = new JTextField();
		txtWednesday2.setBounds(345, 94, 86, 20);
		panel_1.add(txtWednesday2);
		txtWednesday2.setColumns(10);
		
		txtThursday2 = new JTextField();
		txtThursday2.setBounds(441, 94, 86, 20);
		panel_1.add(txtThursday2);
		txtThursday2.setColumns(10);
		
		txtFriday2 = new JTextField();
		txtFriday2.setBounds(537, 94, 86, 20);
		panel_1.add(txtFriday2);
		txtFriday2.setColumns(10);
		
		txtSaturday2 = new JTextField();
		txtSaturday2.setBounds(633, 94, 86, 20);
		panel_1.add(txtSaturday2);
		txtSaturday2.setColumns(10);
		
		txtSunday2 = new JTextField();
		txtSunday2.setBounds(729, 94, 86, 20);
		panel_1.add(txtSunday2);
		txtSunday2.setColumns(10);
		
		lblMonday = new JLabel("Monday");
		lblMonday.setBounds(160, 26, 79, 14);
		panel_1.add(lblMonday);
		
		lblTuesday = new JLabel("Tuesday");
		lblTuesday.setBounds(256, 26, 79, 14);
		panel_1.add(lblTuesday);
		
		lblWednesday = new JLabel("Wednesday");
		lblWednesday.setBounds(352, 26, 79, 14);
		panel_1.add(lblWednesday);
		
		lblThursday = new JLabel("Thursday");
		lblThursday.setBounds(448, 26, 79, 14);
		panel_1.add(lblThursday);
		
		lblFriday = new JLabel("Friday");
		lblFriday.setBounds(544, 26, 79, 14);
		panel_1.add(lblFriday);
		
		lblSaturday = new JLabel("Saturday");
		lblSaturday.setBounds(640, 26, 79, 14);
		panel_1.add(lblSaturday);
		
		lblSunday = new JLabel("Sunday");
		lblSunday.setBounds(736, 26, 79, 14);
		panel_1.add(lblSunday);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Payroll Processing:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 245, 825, 109);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		btnClose.setBounds(713, 22, 102, 76);
		panel_2.add(btnClose);
		
		JLabel lblRegular = new JLabel("Regular:");
		lblRegular.setBounds(122, 47, 56, 14);
		panel_2.add(lblRegular);
		
		JLabel lblOvertime = new JLabel("Overtime:");
		lblOvertime.setBounds(122, 72, 56, 14);
		panel_2.add(lblOvertime);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setBounds(217, 22, 56, 14);
		panel_2.add(lblHours);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(332, 22, 79, 14);
		panel_2.add(lblAmount);
		
		JLabel lblNetPay = new JLabel("Net Pay:");
		lblNetPay.setBounds(446, 47, 79, 14);
		panel_2.add(lblNetPay);
		
		txtHoursR = new JTextField();
		txtHoursR.setColumns(10);
		txtHoursR.setBounds(217, 44, 86, 20);
		panel_2.add(txtHoursR);
		
		txtHoursOv = new JTextField();
		txtHoursOv.setColumns(10);
		txtHoursOv.setBounds(217, 69, 86, 20);
		panel_2.add(txtHoursOv);
		
		txtAmountR = new JTextField();
		txtAmountR.setColumns(10);
		txtAmountR.setBounds(314, 44, 86, 20);
		panel_2.add(txtAmountR);
		
		txtAmountO = new JTextField();
		txtAmountO.setColumns(10);
		txtAmountO.setBounds(313, 69, 86, 20);
		panel_2.add(txtAmountO);
		
		txtNet = new JTextField();
		txtNet.setColumns(10);
		txtNet.setBounds(499, 44, 86, 20);
		panel_2.add(txtNet);
		
		btnProcessIt = new JButton("Process It");
		btnProcessIt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float hourpay=Float.valueOf(txtHourlySalary.getText());
				float monday=Float.valueOf(txtMonday1.getText());
				float mon=Float.valueOf(txtMonday2.getText());
				float tuesday=Float.valueOf(txtTuesday1.getText());
				float tue=Float.valueOf(txtTuesday2.getText());
				float wednesday=Float.valueOf(txtWednesday1.getText());
				float wed=Float.valueOf(txtWednesday2.getText());
				float thursday=Float.valueOf(txtThursday1.getText());
				float thu=Float.valueOf(txtThursday2.getText());
				float friday=Float.valueOf(txtFriday1.getText());
				float fri=Float.valueOf(txtFriday2.getText());
				float saturday=Float.valueOf(txtSaturday1.getText());
				float sat=Float.valueOf(txtSaturday2.getText());
				float sunday=Float.valueOf(txtSunday1.getText());
				float sun=Float.valueOf(txtSunday2.getText());
				float net=(mon+monday+tuesday+tue+wednesday+wed+thursday+thu+friday+fri+saturday+sat+sunday+sun)*hourpay;
				txtNet.setText(String.valueOf(net));
				
				float totalhours=mon+monday+tue+tuesday+wed+wednesday+thu+thursday+fri+friday+sat+saturday+sun+sunday;
				float normalHours=Math.min(totalhours,8);//WE HAVE 8 HOURS A DAY
				float overtimeHours=Math.max(totalhours -8, 0);
				
				float normalpay=normalHours*hourpay;
				float overtimepay=overtimeHours*hourpay;
				
				txtHoursR.setText(String.valueOf(normalHours));
				txtHoursOv.setText(String.valueOf(overtimeHours));
				txtAmountR.setText(String.valueOf(normalpay));
				txtAmountO.setText(String.valueOf(overtimepay));
				
			}
		});
		btnProcessIt.setBounds(10, 22, 102, 76);
		panel_2.add(btnProcessIt);
	}
}