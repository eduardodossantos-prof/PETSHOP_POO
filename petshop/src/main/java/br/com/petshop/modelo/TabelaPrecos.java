package br.com.petshop.modelo;

public class TabelaPrecos { 
    //1.5 Constante Primitiva 
        //O que é?  - É um atributo da Linguagem de Programação, onde qualquer valor atribuído a está não pode ser alterado
        // posteriormente, para declarar que é uma constante, coloca-se o parametro "final" (junto de "static") no início para declarar que 
        // aquele atributo é designiado uma "constante".
        // Justificativa: Ela atribui-se a taxa fixa na taxa_urgência para ser usada nos programas posteriormente
    private static final float TAXA_URGENCIA = 35.5f;
    
    public static float adicionalUrgencia(boolean urgente){
        //2.2 método Estático
            //Justificativa: Permite que Consulta.calculartotal() consulte o acrescimo de urgência sem precisar instânciar TabelaPreços
        return urgente ? TAXA_URGENCIA : 0.0f;
    }
    
}
