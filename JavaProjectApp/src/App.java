import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {

        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("UserDetailsScreen.fxml"));           
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(new Scene(root, 300, 250));
            primaryStage.show();
        }
        catch(Exception exception){

        }       
        
    }
}