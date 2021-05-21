package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;


public class Controller {
    private float min = -171.0f;
    private float max = 171.0f;


    @FXML
    public ImageView dardo;
    public void lanzarDado(ActionEvent event){
        double randomX = min + Math.random() * (max - min);
        double randomY = min + Math.random() * (max - min);
        dardo.setX(randomX);
        dardo.setY(randomY);
    }
}
