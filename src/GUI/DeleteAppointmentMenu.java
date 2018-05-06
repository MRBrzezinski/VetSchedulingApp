/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class DeleteAppointmentMenu extends JFrame {
    public DeleteAppointmentMenu()
    {
         deleteFile();
    }
    public File selectFile()
    {
         setTitle("Delete Appointment");
         File file = null;
         JFileChooser jFileChooser = new JFileChooser(".");
         jFileChooser.setDialogTitle("Please Select Appointment You Would Like to Delete");
         jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);                
         if (jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                  file = jFileChooser.getSelectedFile();
         }               
         else {
               dispose();
              }
         return file;
    }
    public void deleteFile()
    {
        File newFile = selectFile();
        newFile.delete();
        
    }
   
}
