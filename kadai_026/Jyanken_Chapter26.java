package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");
            
            String input = scanner.next();
            if (input.equals("r") || input.equals("s") || input.equals("p")) {
    			scanner.close();
    			return input;
    		} else {
    			System.out.println("正しい手を入力してください");
    		}
		}
	}	
		
	public String getRandom () {
			String[] npc = {"r","s","p"};
			int random = (int)(Math.floor(Math.random()*3));
			return npc[random];
		
		
	}
   
	public void playGame() {
		HashMap<String, String> list = new HashMap<String, String>();
		list.put("r","グー");
		list.put("s","チョキ");
		list.put("p","パー");
		
		String me = this.getMyChoice();
		String you = this.getRandom();
		
		System.out.println("自分の手は" + list.get(me) + ",対戦相手の手は" + list.get(you));
		
		if (me.equals(you)) {
			System.out.println("あいこです");
		} else if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p"))|| (me.equals("p") && you.equals("r"))){
		    System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
	    }
   }
}
