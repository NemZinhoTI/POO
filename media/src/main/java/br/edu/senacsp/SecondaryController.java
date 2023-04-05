package br.edu.senacsp;

import javafx.fxml.FXML;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SecondaryController {

    @FXML
    private TextField numero1;
    @FXML
    private TextArea taboada;

   public void gerador(){
    int numero = Integer.valueOf(numero1.getText());
    int resultado;
    String resposta="";

    int multiplicador = 0;

    while(multiplicador <= 10){
        resultado = numero * multiplicador;
        multiplicador++;
        resposta+= resultado+"\n";

        
    }
    
    taboada.setText("Resultado\n " + resposta);
        
   }
}