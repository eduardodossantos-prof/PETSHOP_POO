package com.petshop.telas;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TelaDeAnimais {
    public void mostrar(Stage FourthScreen){
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root, 1000, 650);
        
        FourthScreen.setTitle("Sistema de Gestão - Tela de Animais");
        FourthScreen.setScene(scene);
        FourthScreen.show();
    }
}
