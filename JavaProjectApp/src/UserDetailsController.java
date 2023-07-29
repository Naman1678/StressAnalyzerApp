import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

public class UserDetailsController {

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtGender;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextArea txtOutputField;

    @FXML
    private TextField txtPhoneNo;

    @FXML
    private TextField txtSleepHours;

    @FXML
    private TextField txtxEmail;

    @FXML
    void onClickCalculateStressLevel(ActionEvent event) {
        Stage mainWindowStage = (Stage) txtFirstName.getScene().getWindow();
        String firstName = txtFirstName.getText();
        mainWindowStage.setTitle(firstName);    
       
        // Get user details from input fields
        try{ 
            if(IsValid()){          
            int age = Integer.parseInt(txtAge.getText());
            int sleepHours = Integer.parseInt(txtSleepHours.getText());
    
        // Create an instance of the StressLevelAnalyzer and pass the UserDetailsController instance
            StressLevelAnalyzer analyzer = new StressLevelAnalyzer(age, sleepHours);
            String result = analyzer.analyzeUserDetails();
            if(result != null)
            {
                txtOutputField.setWrapText(true);
                txtOutputField.setText(result);
            }
        }
        }
        catch(Exception exception){            
            showAlert(Alert.AlertType.ERROR, mainWindowStage, "Form Error!", "Please enter correct information");                              
        }
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
    

    @FXML
    void onClickClear(ActionEvent event) {
         txtFirstName.setText("");
         txtLastName.setText("");
         txtAge.setText("");
         txtGender.setText("");
         txtOutputField.setText("");
         txtPhoneNo.setText("");
         txtSleepHours.setText("");
         txtxEmail.setText("");
    }

    private boolean IsValid()
    { 
        Stage mainWindowStage = (Stage) txtFirstName.getScene().getWindow();
        String validationMessage = "";

        if(txtFirstName.getText().isEmpty() || !txtFirstName.getText().matches("^[a-zA-Z]+$")){
            validationMessage+="Please enter your First Name(alphabetic characters only)\r\n";                           
        }

        if(txtAge.getText().isEmpty() || txtAge.getText().matches("[1-100]")){
            validationMessage+="Please enter correct age\r\n";                           
        }

         if(txtSleepHours.getText().isEmpty() || txtSleepHours.getText().matches("[1-24]")){
            validationMessage+="Please enter the correct number of sleep hours\r\n";                           
        }

        if(!validationMessage.isBlank() && !validationMessage.isEmpty()){            

            showAlert(Alert.AlertType.ERROR, mainWindowStage, "Form Error!", validationMessage);
            return false;
        }  
        return true;
    }

}


