/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.*;

// This class contains the details of the owner and pet
// which will form the left grid panel of the AddMenu class.
// The left grid panel itself consists of subpanels for the names,
// sex, type, and weight of the pet.
public class PersonalDetailsPanel extends JPanel {

	// References for panels, labels, text fields, and buttons
	// that will occupy the personal details panel
	private JPanel namesPanel;
	private JPanel petSexPanel;
	private JPanel petTypePanel;
	private JPanel petWeightPanel;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel phoneNumberLabel;
	private JLabel petNameLabel;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField phoneNumberTextField;
	private JTextField petNameTextField;
	public JRadioButton maleButton;
	public JRadioButton femaleButton;
	private ButtonGroup sexButtonGroup;
	private JRadioButton catButton;
	private JRadioButton dogButton;
	private ButtonGroup typeButtonGroup;
	private JRadioButton lightWeightButton;
	private JRadioButton mediumWeightButton;
	private JRadioButton heavyWeightButton;
	private ButtonGroup weightButtonGroup;
	private String firstName = "";
	private String lastName = "";
	private String phoneNumber = "";
	private String petName = "";
	private String petSex = "";
	private String petType = "";
	private String petWeight = "";

	// Constructor
	public PersonalDetailsPanel() {

		// Create a Border Layout
		setLayout(new BorderLayout(15, 15));
		
		// Create an empty border
		setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

		// Create the panels
		namesPanel();
		petSexPanel();
		petTypePanel();
		petWeightPanel();

		add(namesPanel, BorderLayout.NORTH);
		add(petSexPanel, BorderLayout.WEST);
		add(petTypePanel, BorderLayout.CENTER);
		add(petWeightPanel, BorderLayout.SOUTH);

	}

	// Creates and builds the subpanel for the names
	public void namesPanel() {

		// Create the names labels and textfields
		firstNameLabel = new JLabel("Owner's First Name");
		lastNameLabel = new JLabel("Owner's Last Name");
		phoneNumberLabel = new JLabel("Phone Number");
		petNameLabel = new JLabel("Pet Name");
		firstNameTextField = new JTextField(20);
		lastNameTextField = new JTextField(20);
		phoneNumberTextField = new JTextField(20);
		petNameTextField = new JTextField(20);

		// Create the names subpanel
		namesPanel = new JPanel();

		// Creates a Grid Layout for the names subpanel
		namesPanel.setLayout(new GridLayout(4, 2));

		// Add the labels and the names to the names subpanel
		namesPanel.add(firstNameLabel);
		namesPanel.add(firstNameTextField);
		namesPanel.add(lastNameLabel);
		namesPanel.add(lastNameTextField);
		namesPanel.add(phoneNumberLabel);
		namesPanel.add(phoneNumberTextField);
		namesPanel.add(petNameLabel);
		namesPanel.add(petNameTextField);

	}
        public void preventEdit()
        {
                firstNameTextField.setEditable(false);
                lastNameTextField.setEditable(false);
                phoneNumberTextField.setEditable(false);
                petNameTextField.setEditable(false);
                maleButton.setEnabled(false);
                femaleButton.setEnabled(false);
                lightWeightButton.setEnabled(false);
                mediumWeightButton.setEnabled(false);
                heavyWeightButton.setEnabled(false);
		catButton.setEnabled(false);
		dogButton.setEnabled(false);
        }

	// Creates the Pet Sex subpanel
	public void petSexPanel() {

		// Creates the radiobuttons
		maleButton = new JRadioButton("Male", true);
		femaleButton = new JRadioButton("Female");

		// Group the radio buttons
		sexButtonGroup = new ButtonGroup();
		sexButtonGroup.add(maleButton);
		sexButtonGroup.add(femaleButton);

		// Creates the Pet Sex subpanel
		petSexPanel = new JPanel();

		// Creates a Grid Layout for the Pet Sex subpanel
		petSexPanel.setLayout(new GridLayout(2, 1));

		// Add a border around the Pet Sex section
		petSexPanel.setBorder(BorderFactory.createTitledBorder("Pet Sex"));

		// Add the buttons to the subpanel
		petSexPanel.add(maleButton);
		petSexPanel.add(femaleButton);

	}
        
	// Creates the Pet Type subpanel
	public void petTypePanel() {

		// Creates the radiobuttons
		catButton = new JRadioButton("Cat", true);
		dogButton = new JRadioButton("Dog");

		// Group the radio buttons
		typeButtonGroup = new ButtonGroup();
		typeButtonGroup.add(catButton);
		typeButtonGroup.add(dogButton);

		// Creates the Pet Type subpanel
		petTypePanel = new JPanel();

		// Creates a Grid Layout for the Pet Type subpanel
		petTypePanel.setLayout(new GridLayout(2, 1));

		// Add a border around the Pet Type section
		petTypePanel.setBorder(BorderFactory.createTitledBorder("Pet Type"));

		// Add the buttons to the subpanel
		petTypePanel.add(catButton);
		petTypePanel.add(dogButton);

	}

	// Creates the Pet Weight subpanel
	public void petWeightPanel() {

		// Creates the radiobuttons
		lightWeightButton = new JRadioButton("< 50 lbs.", true);
		mediumWeightButton = new JRadioButton("50 - 100 lbs.");
		heavyWeightButton = new JRadioButton("101+ lbs.");

		// Group the radio buttons
		weightButtonGroup = new ButtonGroup();
		weightButtonGroup.add(lightWeightButton);
		weightButtonGroup.add(mediumWeightButton);
		weightButtonGroup.add(heavyWeightButton);

		// Creates the Pet Weight subpanel
		petWeightPanel = new JPanel();

		// Creates a Grid Layout for the Pet Weight subpanel
		petWeightPanel.setLayout(new GridLayout(3, 1));

		// Add a border around the Pet Weight section
		petWeightPanel.setBorder(BorderFactory.createTitledBorder("Estimated Weight"));

		// Add the buttons to the subpanel
		petWeightPanel.add(lightWeightButton);
		petWeightPanel.add(mediumWeightButton);
		petWeightPanel.add(heavyWeightButton);
	}
        public void setFirstName(String fname)
        {
            firstNameTextField.setText(fname);
        }
	// Returns the input from the first name textfield
	public String getFirstName() {

		firstName = firstNameTextField.getText();

		return firstName;
	}
        public void setLastName(String lname)
        {
            lastNameTextField.setText(lname);
        }
	// Returns the input from the last name textfield
	public String getLastName() {

		lastName = lastNameTextField.getText();

		return lastName;
	}
        public void setPhoneNumber(String phoneNumber)
        {
            phoneNumberTextField.setText(phoneNumber);
        }
	// Returns the input from the phone number textfield
	public String getPhoneNumber() {

		phoneNumber = phoneNumberTextField.getText();

		return phoneNumber;
	}
       public void setPetName(String petName)
       {
           petNameTextField.setText(petName);
       }
	// Returns the input from the Pet Name textfield
	public String getPetName() {

		petName = petNameTextField.getText();

		return petName;
	}

	// Returns the sex of the pet
        public void setPetSex(String petSex)
        {
            if(petSex.equals("Male"))
                maleButton.setSelected(true);
            else if(petSex.equals("Female"))
                femaleButton.setSelected(true);
        }
	public String getPetSex() {

		petSex = "";

		if (maleButton.isSelected())
			petSex = "Male";
		else if (femaleButton.isSelected())
			petSex = "Female";

		return petSex;
	}
        public void setPetType(String petType)
        {
                if (petType.equals("Dog"))
                    dogButton.setSelected(true);
                else if (petType.equals("Cat"))
                    catButton.setSelected(true);
        }
	// Returns the pet type
	public String getPetType() {

		petType = "";

		if (catButton.isSelected())
			petType = "Cat";
		else if (dogButton.isSelected())
			petType = "Dog";

		return petType;
	}
        public void setPetWeight(String petWeight)
        {
            if(petWeight.equals( "< 50 lbs."))
                lightWeightButton.setSelected(true);
            else if (petWeight.equals("50 - 100 lbs."))
                mediumWeightButton.setSelected(true);
            else if(petWeight.equals("101+ lbs."))
                heavyWeightButton.setSelected(true);
        }
	// Returns the pet weight range
	public String getPetWeight() {

		petWeight = "";

		if (lightWeightButton.isSelected())
			petWeight = "< 50 lbs.";
		else if (mediumWeightButton.isSelected())
			petWeight = "50 - 100lbs.";
		else if (heavyWeightButton.isSelected())
			petWeight = "101+ lbs.";

		return petWeight;
	}
}