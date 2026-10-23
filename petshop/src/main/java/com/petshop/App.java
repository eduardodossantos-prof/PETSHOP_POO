package com.petshop;

import com.petshop.telas.TelaCadastroAgendamento;
import com.petshop.telas.TelaCadastroCliente;
import com.petshop.telas.TelaDeAnimais;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    // Inicia a janela do Windows
    public void start(Stage FirstScreen) {
        // Divide a janela em: topo, esquerda, Centro, Direita e Baixo
        BorderPane root = new BorderPane();
        
        // Criando botões de Menu no centro da janela 
        Button Produtos = new Button("Produtos");
        Button Agendamentos = new Button("Agendamentos");
        //Ela serve para definir o que o programa deve fazer quando o usuário
        //interage com um componente, por exemplo, quando clica em um botão
        //ou pressiona uma tecla enter
        Agendamentos.setOnAction(e -> {
            TelaCadastroAgendamento CadastroAgendamento = new TelaCadastroAgendamento();
            CadastroAgendamento.mostrar(FirstScreen);
        });
        Button Vendas = new Button("Vendas");
        Button Clientes = new Button("Clientes");
        //Ela serve para definir o que o programa deve fazer quando o usuário
        //interage com um componente, por exemplo, quando clica em um botão
        //ou pressiona uma tecla enter
        Clientes.setOnAction(e -> {
            TelaCadastroCliente CadastroCliente = new TelaCadastroCliente();
            CadastroCliente.mostrar(FirstScreen);
        });
        Button Animais = new Button("Animais");
        //Ela serve para definir o que o programa deve fazer quando o usuário
        //interage com um componente, por exemplo, quando clica em um botão
        //ou pressiona uma tecla enter
        Animais.setOnAction(e -> {
            TelaDeAnimais telaanimais = new TelaDeAnimais();
            telaanimais.mostrar(FirstScreen);
        });
        
        //Definindo o tamanho de cada botão individualmente e estilizando
        Button[] botoes = {
            Produtos,
            Agendamentos,
            Vendas,
            Clientes,
            Animais
        };
        //Definindo o estilo em cada botão de estilização.
        for (Button b: botoes){
            b.setPrefSize(200, 100);
            b.setStyle("-fx-font-size: 13px; -fx-font-weight: bold;");
        }
        
        //Organiza os conteúdos das variáveis na horizontal;
        HBox menucentro = new HBox(10, Produtos, Agendamentos, Vendas, Clientes, Animais);
        menucentro.setAlignment(Pos.CENTER);
        menucentro.setPadding(new Insets(15));
        menucentro.setStyle("-fx-background-color: #F0E7E7;");
        
        //Centraliza o conteúdo deduzido no menucentro;
        root.setCenter(menucentro);
        
        // Inicializa a cena, definindo os componentes (root), largura (1000) e altura (650)
        Scene scene = new Scene(root, 1000, 650);

        // Configura o palco para inicializar as cenas
        FirstScreen.setTitle("Sistema de Gestão - Meu PetShop");
        FirstScreen.setScene(scene);
        FirstScreen.show();
    }

    public static void main(String[] args) {
        launch();
    }
}