package com.petshop.telas;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TelaCadastroAgendamento {
    public void mostrar(Stage ThirdScreen){
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root, 1000, 650);
        
        ThirdScreen.setTitle("Sistema de Gestão - Tela de Agendamento");
        ThirdScreen.setScene(scene);
        ThirdScreen.show();
    }
}
