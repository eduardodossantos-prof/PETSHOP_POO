    package com.petshop;

    import javafx.application.Application;
    import javafx.geometry.Insets;
    import javafx.geometry.Pos;
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.scene.control.TextField;
    import javafx.scene.layout.BorderPane;
    import javafx.scene.layout.HBox;
    import javafx.scene.layout.Pane;
    import javafx.scene.text.Font;
    import javafx.scene.text.FontPosture;
    import javafx.stage.Stage;

    public class App extends Application {

        public void TelaCliente(Stage SecondScreen){
            //Podemos colocar a posição dos elementos de forma manual (Por Coordenadas)
            Pane root = new Pane();

            //Titulo
            javafx.scene.control.Label name = new javafx.scene.control.Label("CADASTRO DO CLIENTE");
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
        
        @Override
        // Inicia a janela do Windows
        public void start(Stage FirstScreen) {
            // Divide a janela em: topo, esquerda, Centro, Direita e Baixo
            BorderPane root = new BorderPane();

            // Criando botões de Menu no centro da janela 
            Button Produtos = new Button("Produtos");
            Button Agendamentos = new Button("Agendamentos");
            Button Vendas = new Button("Vendas");
            Button Clientes = new Button("Clientes");
            //Ela serve para definir o que o programa deve fazer quando o usuário
            //interage com um componente, por exemplo, quando clica em um botão
            //ou pressiona uma tecla enter
            Clientes.setOnAction(e -> {
               TelaCliente(FirstScreen);
            });
            Button Animais = new Button("Animais");

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