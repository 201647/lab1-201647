package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String translation;
	
	
	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
	}
	
	public String getAlienWord() {
		return alienWord;
	}

	public String getTranslation() {
		return translation;
	}
	
	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public String compare(String altraWord){
		if(this.alienWord.compareTo(altraWord)==0){
		return this.translation;
	} else{
		return null;
	}

}
}
