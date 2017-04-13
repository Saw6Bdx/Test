
package jfxui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Charlotte
 */

public class AppWindowController {

    @FXML
    private AnchorPane content;
    
    @FXML
    private void handleMenuFileChangeUser(ActionEvent event) throws IOException {
        TitledPane loader = (TitledPane)FXMLLoader.load(getClass().getResource("LoginWindow.fxml"));
        Scene scene = new Scene(loader);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        //Hide current window, ne fonctionne pas, à voir plus tard
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    
    @FXML
    private void handleMenuFileNewUser(ActionEvent event) throws IOException {
        TitledPane loader = (TitledPane)FXMLLoader.load(getClass().getResource("NewUserWindow.fxml"));
        Scene scene = new Scene(loader);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        //Hide current window, ne fonctionne pas, à voir plus tard
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    
    @FXML
    private void handleMenuEditNewAccount(ActionEvent event) throws IOException {
        // création nouveau compte + nouveau bouton compte dans AppWindow
    }
    
    @FXML
    private void handleButtonAccountCurrent(ActionEvent event) throws IOException {
        Pane loader = (Pane)FXMLLoader.load(getClass().getResource("TransactionsWindow.fxml"));
        // appeler le TransactionsWindow du compte correspondant au bouton
        Scene scene = new Scene(loader);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void handleButtonAccountSaving(ActionEvent event) throws IOException {
        Pane loader = (Pane)FXMLLoader.load(getClass().getResource("TransactionsWindow.fxml"));
        // appeler le TransactionsWindow du compte correspondant au bouton
        Scene scene = new Scene(loader);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
}
