package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {

	//private Word parola;
	private List<WordEnhanced> dizionario=new LinkedList<WordEnhanced>();

	public void addWord(String alienWord, String translation){

		for (WordEnhanced w:dizionario){
			if(w.compare(alienWord)!=null){
				w.setTranslation(translation);
				return;
			} 
		}
		List<String> provvisoria=new LinkedList<String>();
		provvisoria.add(translation);
		WordEnhanced parola=new WordEnhanced(alienWord,provvisoria);
		dizionario.add(parola);	
	}
	public List translateWord(String alienWord){
		for(WordEnhanced w:dizionario){
			if(w.compare(alienWord)==null){
				return null;
			} else{
				return w.getTranslations();
			}
		}
		return null;
	}

	public List<WordEnhanced> getDizionario() {
		return dizionario;
	}



}
