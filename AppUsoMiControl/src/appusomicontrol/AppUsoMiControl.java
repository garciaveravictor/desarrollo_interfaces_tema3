/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusomicontrol;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import proyectomicontrol.MiControl;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class AppUsoMiControl extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        MiControl miControl = new MiControl();
        
        /*Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        */
        Pane root = new Pane();
        root.getChildren().add(miControl);
        
        Scene scene = new Scene(root, 500, 550);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
