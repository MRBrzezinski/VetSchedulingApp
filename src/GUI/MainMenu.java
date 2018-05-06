/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// This class creates the main menu
public class MainMenu extends JFrame {

	// Object references, panels, buttons, labels,
	// and other variables
	private AddMenu addMenuObject;
        private EditMenu editMenuObject;
        private DeleteMenu deleteMenuObject;
        private ViewAppointmentMenu viewAppointmentMenuObject;
        private DeleteAppointmentMenu deleteAppointmentMenuObject;
	private JLabel clinicName;
		private JLabel instructions;
	private JButton addApptButton;
	private JButton viewAppointmentMenuButton;
	private JButton editApptButton;
	private JButton deleteApptButton;
	private JPanel buttonPanel;
	
		private final int WINDOW_WIDTH = 500;
		private final int WINDOW_HEIGHT = 300;

	// Constructor
	public MainMenu() {

		// Display title
		setTitle("Welcome!!!");
		
			// Set size of window
			setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		// Specify action for close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a Border Layout manager
		setLayout(new BorderLayout(15, 15));

		// Create the labels
		clinicName = new JLabel("Spay and Neuter Veterinary Clinic");
			clinicName.setFont(new Font("Serif", Font.BOLD, 24));
			clinicName.setHorizontalAlignment(JLabel.CENTER);
			clinicName.setVerticalAlignment(JLabel.BOTTOM);
			
			instructions = new JLabel("Please Select One of the Following Options");
			instructions.setFont(new Font("Dialog", Font.PLAIN, 18));
			instructions.setHorizontalAlignment(JLabel.CENTER);
			instructions.setVerticalAlignment(JLabel.CENTER);


		// Create the button panel
		buildButtonPanel();

		// Add the components to the content panel
			add(instructions, BorderLayout.CENTER);
			add(clinicName, BorderLayout.NORTH);
			add(buttonPanel, BorderLayout.SOUTH);


		// Pack the contents of the window and display it
		// pack();
			setLocationRelativeTo(null);
		setVisible(true);

	}

	// This method builds the button panel
	public void buildButtonPanel() {

		// Create a panel for the buttons
		buttonPanel = new JPanel();

		// Set layout for the button panel
		buttonPanel.setLayout(new GridLayout(2, 2, 10, 10));

		// Create an empty border
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

		// Create the buttons
		addApptButton = new JButton("Add Appointment");
		viewAppointmentMenuButton = new JButton("View Appointment");
		editApptButton = new JButton("Edit Appointment");
		deleteApptButton = new JButton("Delete Appointment");
			setPreferredSize(new Dimension(30, 30));

		// Register the action listeners
		addApptButton.addActionListener(new addApptButtonListener());
		viewAppointmentMenuButton.addActionListener(new viewAppointmentMenuButtonListener());
		editApptButton.addActionListener(new editApptButtonListener());
		deleteApptButton.addActionListener(new deleteApptButtonListener());

		// Add the buttons to the panel
		buttonPanel.add(addApptButton);
		buttonPanel.add(viewAppointmentMenuButton);
		buttonPanel.add(editApptButton);
		buttonPanel.add(deleteApptButton);
	}

	// Private inner class that handles when user clicks
	// the Add Appointment button
	private class addApptButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			addMenuObject = new AddMenu();

		}
	}
        private class editApptButtonListener implements ActionListener {
               
                public void actionPerformed(ActionEvent e){
                    
                    editMenuObject = new EditMenu();
                    
                }
        }
        private class deleteApptButtonListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                deleteAppointmentMenuObject = new DeleteAppointmentMenu();
            }
        }
        private class viewAppointmentMenuButtonListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                viewAppointmentMenuObject = new ViewAppointmentMenu();
            }
        }
        
}

