package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {

	AlienDictionary a=new AlienDictionary();

	@FXML
	private ResourceBundle resources;
	@FXML
	private URL location;
	@FXML
	private TextField txtWord;
	@FXML
	private TextArea txtResult;
	@FXML
	private Button doTranslate;
	@FXML
	private Button btnReset;


	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
		assert doTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
		assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";

	}


	@FXML
	void doTranslate(ActionEvent event) {

		String risultato=txtWord.getText().toLowerCase();

		//String alienWord=risultato.substring(0,risultato.indexOf(" "));
		//String traduction=risultato.substring(risultato.indexOf(" "+1, risultato.length()));
		StringTokenizer st=new StringTokenizer(risultato, " ");

		String parolaAliena = st.nextToken();
		String traduzione=null;
		if(st.hasMoreTokens()){
			traduzione = st.nextToken();
		}
		if(traduzione==null){
			a.translateWord(parolaAliena);
			txtResult.setText(a.translateWord(parolaAliena));
		} else{
			a.addWord(parolaAliena, traduzione);
			txtResult.setText("parola aggiunta" +a.getDizionario());
		}

	}


	@FXML
	void doReset(ActionEvent event) {
		txtWord.clear();
        
	}

}
