package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		dictionary.tuika();
		
		String[] wordArray = {"apple", "banana", "grape", "orange"};
		
		for(String word : wordArray) {
			dictionary.setSearchWord(word);
			dictionary.serch();
		}
	}

}
