package it.polito.tdp.alien;

import java.util.List;

public class WordEnhanced {
	
	private String alienWord;
	private String translation;	
	private List<String> translations;
	
	public WordEnhanced(String alienWord, List<String> translations) {
		this.alienWord = alienWord;
		this.translations = translations;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public List<String> getTranslations() {
		return translations;
	}
	

	public void setTranslation(String translation) {
		this.translation = translation;
		translations.add(translation);
	}
	public List compare(String altraWord){
		if(this.alienWord.compareTo(altraWord)==0){
		return this.translations;
	} else{
		return null;
	}
	}
	

}
