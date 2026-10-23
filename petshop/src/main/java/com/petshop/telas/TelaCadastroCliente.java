package com.petshop.telas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class TelaCadastroCliente{

    public void mostrar(Stage SecondScreen) {
        //Podemos colocar a posição dos elementos de forma manual (Por Coordenadas)
        Pane root = new Pane();
        
        //Titulo
        Label name = new Label("CADASTRO DO CLIENTE");
            //Define a posição e as fontes do Label
            name.setFont(Font.font("Sans-serif", FontPosture.ITALIC, 20));
            name.setLayoutX(380);
            name.setLayoutY(200);
        
        //Primeiro Label
        TextField tfUser = new TextField();
            //Largura e Altura do Primeiro Label
            tfUser.setPrefWidth(500);
            tfUser.setPrefHeight(20);
            tfUser.setMaxWidth(500);
            tfUser.setMaxHeight(20);
            //Posição do Primeiro Label
            tfUser.setLayoutX(250);
            tfUser.setLayoutY(250);
        
        //Segundo Label
        TextField tfPhone = new TextField();
            //Largura e Altura do Segundo Label
            tfPhone.setPrefHeight(20);
            tfPhone.setPrefWidth(500);
            tfPhone.setMaxHeight(20);
            tfPhone.setMaxWidth(500);
            //Posição do Segundo Label
            tfPhone.setLayoutX(250);
            tfPhone.setLayoutY(290);
        
        //Terceiro Label
        TextField tfCPF = new TextField();
            //Largura e Altura do Segundo Label
            tfCPF.setPrefHeight(20);
            tfCPF.setPrefWidth(500);
            tfCPF.setMaxHeight(20);
            tfCPF.setMaxWidth(500);
            //Posição do Segundo Label
            tfCPF.setLayoutX(250);
            tfCPF.setLayoutY(330);
        
        //Botão de Cadastrar
        Button BtnCadastrar = new Button("Cadastrar");
            //Largura, Altura e Posiçõoes do Label
            BtnCadastrar.setPrefSize(200, 40);
            BtnCadastrar.setLayoutX(400);
            BtnCadastrar.setLayoutY(400);
        
        //Serve para colocar todos os componentes na janela
        root.getChildren().addAll(name, tfUser, tfPhone, tfCPF, BtnCadastrar);
        
        Scene scene = new Scene(root, 1000, 650);
        
        SecondScreen.setTitle("Sistema de Gestão - Tela de Cadastro de Clientes");
        SecondScreen.setScene(scene);
        SecondScreen.show();
    }
}
