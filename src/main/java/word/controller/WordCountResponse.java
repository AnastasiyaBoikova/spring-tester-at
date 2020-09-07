package word.controller;

import java.io.Serializable;
import java.util.List;

public class WordCountResponse implements Serializable {


    private String nameWord;
    private int quantity;
  //  List<WordCountResponse> arrayWord;


    public WordCountResponse(String nameWord, int quantity) {
        this.nameWord = nameWord;
        this.quantity = quantity;
    }


    public String getNameWord() {
        return nameWord;
    }

    public void setNameWord(String nameWord) {
        this.nameWord = nameWord;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "WordCountResponse{"+ "'" + nameWord + "':"  + quantity +
                '}';
    }

}
