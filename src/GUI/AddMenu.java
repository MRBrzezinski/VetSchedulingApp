/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
// This class creates the Add Menu
public class AddMenu extends JFrame {

	// Object references, buttons, labels,
	// text fields, and other variables
	private ExtraProceduresPanel extraProcedures;
	private PersonalDetailsPanel personalDetails;;
	private JLabel costLabel;
	private JTextField costTextField;
	private JPanel buttonPanel;
	private JButton saveButton;
	private JButton cancelButton;
        private JButton calculateCost;
	String firstName;
	String lastName;
	String phoneNumber;
	String petName;
	String petSex;
	String petType;
	String petWeight;
        String addProcedures;
	double extraProceduresCost;
        double surgeryCost;
        double totalCost;
        
        private final int WINDOW_WIDTH = 800;
    	private final int WINDOW_HEIGHT = 500;
        
	// Constructor
	public AddMenu() {

		// Display title
		setTitle("Add Appointment");
		
			// Set size of window
			setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		// Specify action for close button
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Create a Border layout
		setLayout(new BorderLayout(15, 15));

		// Create the custom panels
		extraProcedures = new ExtraProceduresPanel();
		personalDetails = new PersonalDetailsPanel();

		// Create the button panel
		buildButtonPanel();

		// Add the components to the content pane
		add(personalDetails, BorderLayout.WEST);
		add(extraProcedures, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);

		// Pack the contents of the window and display it
		// pack();
		setVisible(true);
	}

	// Builds the button panel
	public void buildButtonPanel() {

		// Create a panel for the buttons and cost counter
		buttonPanel = new JPanel();

		// Create the buttons, textfield, and label
		costLabel = new JLabel("Cost of Appointment");
		costTextField = new JTextField(10);
		costTextField.setEditable(false);
		costTextField.setText("0.0");
                calculateCost = new JButton("Calculate Cost");
		saveButton = new JButton("Save Changes");
		cancelButton = new JButton("Cancel Changes");

		// Register the action listeners
		saveButton.addActionListener(new SaveButtonListener());
		cancelButton.addActionListener(new CancelButtonListener());
		// Add the buttons, label, and textfield to the panel
		buttonPanel.add(costLabel);
		buttonPanel.add(costTextField);
		buttonPanel.add(saveButton);
		buttonPanel.add(cancelButton);
                
	}

	// Private inner class that handles the event when
	// the user clicks on the save button
	private class SaveButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			// Initialize the variables
			firstName = personalDetails.getFirstName();
			lastName = personalDetails.getLastName();
			phoneNumber = personalDetails.getPhoneNumber();
			petName = personalDetails.getPetName();
			petSex = personalDetails.getPetSex();
                        petType = personalDetails.getPetType();
			petWeight = personalDetails.getPetWeight();
                        if(petSex == "Male" && petType == "Dog" && petWeight == "< 50 lbs.")  {
                            surgeryCost = 75;
                        }
                        else if(petSex == "Female" && petType == "Dog" && petWeight == "< 50 lbs."){
                            surgeryCost = 85;
                        }
                        else if(petSex == "Male" && petType == "Dog" && petWeight == "50 - 100 lbs."){
                            surgeryCost = 100;
                        }
                         else if(petSex == "Female" && petType == "Dog" && petWeight == "50 - 100 lbs."){
                            surgeryCost = 125;
                        }
                        else if(petSex == "Male" && petType == "Dog" && petWeight == "101+ lbs."){
                            surgeryCost = 160;
                        }
                        else if(petSex == "Female" && petType == "Dog" && petWeight == "101+ lbs."){
                            surgeryCost = 200;
                        }
                        else if(petSex == "Male" && petType == "Cat"){
                            surgeryCost = 40;
                        }
                        else if (petSex == "Female" && petType == "Cat"){
                            surgeryCost = 55;
                        }
			extraProceduresCost = extraProcedures.getProceduresCost();
                        addProcedures = extraProcedures.getProcedures();
                        totalCost = surgeryCost + extraProceduresCost;
			costTextField.setText(String.valueOf(totalCost));

			// Printing for test purposes
			JOptionPane.showMessageDialog(null,
					"Name: " + firstName + " " + lastName + "\nPhone Number: " + phoneNumber + "\nPet Name: " + petName
							+ "\nPet Sex: " + petSex + "\nPet Type: " + petType + "\nPet Weight Range: " + petWeight
                                                        + "\nAdditional Procedures: " + addProcedures + "\nTotal Cost: $" + totalCost);
                        String fullName = firstName+lastName;
                        try {
                            File file = new File(fullName+".txt");
                            file.createNewFile();
                            FileWriter writer = new FileWriter(file);
                            BufferedWriter newWriter = new BufferedWriter(writer);
                            newWriter.write("OwnerName:" + firstName + " " +  lastName);
                            newWriter.write("\r\nPhoneNumber:" + phoneNumber);
                            newWriter.write("\r\nPetName:" + petName);
                            newWriter.write("\r\nPetSex:" + petSex);
                            newWriter.write("\r\nPetType:" + petType);
                            newWriter.write("\r\nPetWeight:" +petWeight);
                            newWriter.write("\r\nExtraProcedures:" + addProcedures);
                            newWriter.write("\r\nTotalCost:$"+totalCost);
                            newWriter.close();
                        }
                        catch (Exception newException){
                                    newException.printStackTrace();
                        }
                        
		}
	}
	// Private inner class that handles the event when
	// the user clicks the cancel button
	private class CancelButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			dispose();

		}
	}
}
