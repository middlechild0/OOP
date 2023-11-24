package cat2;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RegisterForm extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField nameTxt;
    private JTextField usernameTxt;
    private JTextField passwordTxt;
    private JTextField confirmPasswordTxt;
    private JTextField emailTxt;
    private JTextField phoneTxt;
    private JTextField addressTxt;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegisterForm frame = new RegisterForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Registerform() {
		setBackground(new Color(153, 193, 241));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegForm = new JLabel("Register Form");
		lblRegForm.setFont(new Font("Dialog", Font.BOLD, 18));
		lblRegForm.setBounds(12, 12, 247, 29);
		contentPane.add(lblRegForm);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(65, 69, 70, 15);
		contentPane.add(lblName);
		
		Nametxt = new JTextField();
		Nametxt.setBounds(222, 67, 560, 19);
		contentPane.add(Nametxt);
		Nametxt.setColumns(10);
		
		JLabel lblUsrName = new JLabel("Username:");
		lblUsrName.setBounds(65, 96, 95, 15);
		contentPane.add(lblUsrName);
		
		JLabel lblPasswd = new JLabel("Password:");
		lblPasswd.setBounds(65, 137, 114, 15);
		contentPane.add(lblPasswd);
		
		JLabel lblPswdconfm = new JLabel("Confirm Password:");
		lblPswdconfm.setBounds(65, 182, 139, 15);
		contentPane.add(lblPswdconfm);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(65, 229, 70, 15);
		contentPane.add(lblEmail);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(65, 277, 70, 15);
		contentPane.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(65, 329, 70, 15);
		contentPane.add(lblAddress);
		
		Usrnmetxt = new JTextField();
		Usrnmetxt.setBounds(222, 94, 560, 19);
		contentPane.add(Usrnmetxt);
		Usrnmetxt.setColumns(10);
		
		pwdtxt = new JTextField();
		pwdtxt.setBounds(222, 135, 560, 19);
		contentPane.add(pwdtxt);
		pwdtxt.setColumns(10);
		
		Pwdconftxt = new JTextField();
		Pwdconftxt.setBounds(222, 180, 560, 19);
		contentPane.add(Pwdconftxt);
		Pwdconftxt.setColumns(10);
		
		emailtxt = new JTextField();
		emailtxt.setBounds(222, 227, 560, 19);
		contentPane.add(emailtxt);
		emailtxt.setColumns(10);
		
		phonetxt = new JTextField();
		phonetxt.setBounds(222, 275, 560, 19);
		contentPane.add(phonetxt);
		phonetxt.setColumns(10);
		
		Addresstxt = new JTextField();
		Addresstxt.setBounds(222, 327, 560, 19);
		contentPane.add(Addresstxt);
		Addresstxt.setColumns(10);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    
                    String name = nameTxt.getText();
                    String username = usernameTxt.getText();
                    String password = passwordTxt.getText();
                    String confirmPassword = confirmPasswordTxt.getText();
                    String email = emailTxt.getText();
                    String phone = phoneTxt.getText();
                    String address = addressTxt.getText();
                   
                    System.out.println("Form submitted successfully!");
                } catch (Exception e) {
                    e.printStackTrace();
                    
                }
            }
        });
        contentPane.add(btnSubmit);

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
              
                for (int i = 0; i < textFields.length; i++) {
                    textFields[i].setText("");
                }
            }
        });
        contentPane.add(btnReset);

        JButton btnClose = new JButton("Close");
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        contentPane.add(btnClose);
    }
}