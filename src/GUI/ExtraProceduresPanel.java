/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;
import java.awt.*;

// This class contains the additional procedures which
// will form the right grid panel of the AddMenu class.
public class ExtraProceduresPanel extends JPanel {

	// The following constants are used to indicate
	// the cost of additional procedures
	public final double RABIES_VACCINE = 15.0;
	public final double CANINE_DISTEMPER = 15.0;
	public final double BORTADELLA_VACCINE = 15.0;
	public final double LYME_VACCINE = 25.0;
	public final double FELINE_DISTEMPER = 15.0;
	public final double FELINE_LEUKEMIA = 25.0;
	public final double BLOOD_WORK = 75.0;
	public final double MICROCHIP = 30.0;
	public final double NAIL_TRIM = 5.0;
	public final double FLEA_TREATMENT = 15.0;
	public final double PAIN_MEDS = 15.0;
	public final double E_COLLAR = 15.0;

	// Cost for total number of procedures
	private double proceduresCost = 0.0;
        private String extraProcedures = "";
	// JCheckBox references
	private JCheckBox rabiesVaccine;
	private JCheckBox canineDistemper;
	private JCheckBox bortadellaVaccine;
	private JCheckBox lymeVaccine;
	private JCheckBox felineDistemper;
	private JCheckBox felineLeukemia;
	private JCheckBox bloodWork;
	private JCheckBox microchip;
	private JCheckBox nailTrim;
	private JCheckBox fleaTreatment;
	private JCheckBox painMeds;
	private JCheckBox eCollar;
        
	// Constructor
	public ExtraProceduresPanel() {

		// Create a GridLayout with 12 rows and 1 column
		setLayout(new GridLayout(12, 1));

		// Create the check boxes
		rabiesVaccine = new JCheckBox("Rabies Vaccine - $15");
		canineDistemper = new JCheckBox("Canine Distemper Vaccine (Dogs Only) - $15");
		bortadellaVaccine = new JCheckBox("Bortadella Vaccine (Dogs Only) - $15");
		lymeVaccine = new JCheckBox("Lyme Vaccine (Dogs Only) - $25");
		felineDistemper = new JCheckBox("Feline Distemper Vaccine (Cats Only) - $15");
		felineLeukemia = new JCheckBox("Feline Leukemia Vaccine (Cats Only) - $25");
		bloodWork = new JCheckBox("Pre-Anesthetic Blood Work - $75");
		microchip = new JCheckBox("Microchip - $30");
		nailTrim = new JCheckBox("Nail Trim - $5");
		fleaTreatment = new JCheckBox("Flea Treatment - $15");
		painMeds = new JCheckBox("Pain Meds - $15");
		eCollar = new JCheckBox("E-Collar - $15");

		// Create border
		setBorder(BorderFactory.createTitledBorder("Additional Procedures"));

		// Add the check boxes to the panel
		add(rabiesVaccine);
		add(canineDistemper);
		add(bortadellaVaccine);
		add(lymeVaccine);
		add(felineDistemper);
		add(felineLeukemia);
		add(bloodWork);
		add(microchip);
		add(nailTrim);
		add(fleaTreatment);
		add(painMeds);
		add(eCollar);
	}

	// This method gets the total cost of additional procedures
	public double getProceduresCost() {

		proceduresCost = 0.0;

		if (rabiesVaccine.isSelected())
			proceduresCost += RABIES_VACCINE;
		if (canineDistemper.isSelected())
			proceduresCost += CANINE_DISTEMPER;
		if (bortadellaVaccine.isSelected())
			proceduresCost += BORTADELLA_VACCINE;
		if (lymeVaccine.isSelected())
			proceduresCost += LYME_VACCINE;
		if (felineDistemper.isSelected())
			proceduresCost += FELINE_DISTEMPER;
		if (felineLeukemia.isSelected())
			proceduresCost += FELINE_LEUKEMIA;
		if (bloodWork.isSelected())
			proceduresCost += BLOOD_WORK;
		if (microchip.isSelected())
			proceduresCost += MICROCHIP;
		if (nailTrim.isSelected())
			proceduresCost += NAIL_TRIM;
		if (fleaTreatment.isSelected())
			proceduresCost += FLEA_TREATMENT;
		if (painMeds.isSelected())
			proceduresCost += PAIN_MEDS;
		if (eCollar.isSelected())
			proceduresCost += E_COLLAR;

		return proceduresCost;
	}
        public void setProcedures(String procedures)
        {
            if (procedures.contains("RabiesVaccine"))
                rabiesVaccine.setSelected(true);
            if (procedures.contains("CanineDistemper"))
                canineDistemper.setSelected(true);
            if (procedures.contains("BortadellaVaccine"))
                bortadellaVaccine.setSelected(true);
            if (procedures.contains("LymeVaccine"))
                lymeVaccine.setSelected(true);
            if (procedures.contains("FelineDistemper"))
                felineDistemper.setSelected(true);
            if (procedures.contains("FelineLeukemia"))
                felineLeukemia.setSelected(true);
            if(procedures.contains("BloodWorkd"))
                bloodWork.setSelected(true);
            if(procedures.contains("Microchip"))
                microchip.setSelected(true);
            if(procedures.contains("NailTrim"))
                nailTrim.setSelected(true);
            if(procedures.contains("PainMeds"))
                painMeds.setSelected(true);
            if(procedures.contains("ECollar"))
                eCollar.setSelected(true);
         }
        public String getProcedures()
        {
            if (rabiesVaccine.isSelected())
			extraProcedures += " RabiesVaccine";
		if (canineDistemper.isSelected())
			extraProcedures += " CanineDistemper";
		if (bortadellaVaccine.isSelected())
			extraProcedures += " BortadellaVaccine";
		if (lymeVaccine.isSelected())
			extraProcedures += " LymeVaccine";
		if (felineDistemper.isSelected())
			extraProcedures += " FelineDistemper";
		if (felineLeukemia.isSelected())
			extraProcedures += " FelineLeukimia";
		if (bloodWork.isSelected())
			extraProcedures += " BloodWork";
		if (microchip.isSelected())
			extraProcedures += " Microchip";
		if (nailTrim.isSelected())
			extraProcedures += " NailTrim";
		if (fleaTreatment.isSelected())
			extraProcedures += " FleaTreatment";
		if (painMeds.isSelected())
			extraProcedures += " PainMeds";
		if (eCollar.isSelected())
			extraProcedures += " ECollar";
                
                return extraProcedures;
        }
        public void preventEdit()
        {
            rabiesVaccine.setEnabled(false);
            canineDistemper.setEnabled(false);
            bortadellaVaccine.setEnabled(false);
            lymeVaccine.setEnabled(false);
            felineDistemper.setEnabled(false);
            felineLeukemia.setEnabled(false);
            bloodWork.setEnabled(false);
            microchip.setEnabled(false);
            nailTrim.setEnabled(false);
            fleaTreatment.setEnabled(false);
            painMeds.setEnabled(false);
            eCollar.setEnabled(false);
        }
}