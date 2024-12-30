package kadai_026;

import java.util.HashMap;
import java.util.Scanner; 

public class Jyanken_Chapter26 {
	public static final String rock = "r";
	public static final String paper = "p";
	public static final String scissors = "s";
	
	private String[] choices = {rock, paper, scissors};
	
	//getMyChoiceのメソッド
	public String getMyChoice () {
		 Scanner scanner = new Scanner(System.in);
		 
		 while (true) {
			 System.out.println("自分のじゃんけんの手を入力しましょう\n"
			 		+ "グーはrockのrを入力しましょう\n"
			 		+ "チョキはscissorsのsを入力しましょう\n"
			 		+ "パーはpaperのpを入力しましょう");
			 String input = scanner.next();
			 if (input.equals(rock) || input.equals(paper) || input.equals(scissors)) {
				 scanner.close();
				 return input;
			 } else {
				 System.out.println("r, p, sのどれかを入力してください");
			 }
		 }
	};//自分のじゃんけんの手を入力する
	
	public String getRandom () {
		int randomNumber = (int) Math.floor(Math.random()*3);
		switch (randomNumber) {
		case 0:
			return rock;
		case 1:
			return paper;
		case 2:
			return scissors;
		default:
			return "エラー：無効な手です";
		}
	};//対戦相手のじゃんけんの手を乱数で選ぶ
	
	public void playGame(String choices, String random) {
		HashMap<String, String> validHand = new HashMap<String, String>();
			validHand.put("r","グー");
			validHand.put("s","チョキ");
			validHand.put("p","パー");
		
		System.out.println("自分の手は" + validHand.get(choices) +",対戦相手の手は" + validHand.get(random));
		
		if (choices.equals(random)) {
			System.out.println("あいこです");
		} else if ((choices.equals(paper) && random.equals(rock))||
		          (choices.equals(rock) && random.equals(scissors)) ||
		          (choices.equals(scissors) && random.equals(paper))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	};//じゃんけんを行う
	
}
