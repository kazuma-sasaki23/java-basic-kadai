package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 extends DictionaryExec_Chapter21 {

	HashMap<String,String> wordMap = new HashMap<String,String>();
	
	String word;

	public void tuika() {
		wordMap.put("apple","りんご");
		wordMap.put("peach","桃");
		wordMap.put("banana","バナナ");
		wordMap.put("lemon","レモン");
		wordMap.put("pear","梨");
		wordMap.put("kiwi","キウイ");
		wordMap.put("strawberry","いちご");
		wordMap.put("grape","ぶどう");
		wordMap.put("muscat","マスカット");
		wordMap.put("cherry","さくらんぼ");
		
	}
	
	public void setSearchWord(String word) {
	     this.word = word;
        }
	
	public void serch() {
		if(wordMap.containsKey(word) ) {
			System.out.println(word + "の意味は" + wordMap.get(word) + "です" );
		}  else {
			System.out.println(word + "は辞書に存在しません");
	}
	
	}
}
    