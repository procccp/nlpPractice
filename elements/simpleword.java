public class simpleword{

	private String theWord;
	private int theFrequency;

	public word(String theWord, int theFrequency){

		this.theWord = theWord;
		this.theFrequency = theFrequency;

	}

	public String getWord(){
		return theWord;
	}

	public int getFrequency(){
		return theFrequency;
	}

	public void increaseFrequency(){
		this.theFrequency += 1;
	}

}