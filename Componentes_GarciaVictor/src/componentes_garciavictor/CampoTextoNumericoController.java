package componentes_garciavictor;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Victor Garcia Vera 2DAM
 */
public class CampoTextoNumericoController extends TextField {

    public CampoTextoNumericoController() {
        super();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "CampoTextoNumericoView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

    }

    @Override
    public void replaceText(int start, int end, String text) {
        if (!text.matches("[a-z, A-Z]")) 
            super.replaceText(start, end, text);
        
    }

    @Override
    public void replaceSelection(String text) {
        if (!text.matches("[a-z, A-Z]")) 
            super.replaceSelection(text);
        
    }

}
