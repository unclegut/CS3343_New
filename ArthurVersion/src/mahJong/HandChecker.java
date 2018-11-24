package mahJong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import handPattern.AllHonorTiles;
import handPattern.AllinTriplets;
import handPattern.Chicken;
import handPattern.CommonHand;
import handPattern.ContainOneNine;
import handPattern.GreatDragon;
import handPattern.GreatWinds;
import handPattern.GreenDragon;
import handPattern.HandPattern;
import handPattern.MixSuit;
import handPattern.OnlyOneNine;
import handPattern.PrevalentWindTriplet;
import handPattern.RedDragon;
import handPattern.SameSuit;
import handPattern.SeatWindTriplet;
import handPattern.SmallDragon;
import handPattern.SmallWinds;
import handPattern.ThirteenOrphans;
import handPattern.WhiteDragon;


public class HandChecker {
	private static HandChecker instance = new HandChecker();
	private ArrayList<HandPattern> handPatterns;
	private ArrayList<HandPattern> winningHand;
	private Hand hand;

	private HandChecker() {
		handPatterns = new ArrayList<HandPattern>();
		handPatterns.add(new GreatWinds());      // 0 大四喜
		handPatterns.add(new ThirteenOrphans()); // 1 十三么
		handPatterns.add(new OnlyOneNine());     // 2 清么九
		handPatterns.add(new AllHonorTiles());   // 3 字一色
		handPatterns.add(new SameSuit());        // 4 清一色
		handPatterns.add(new SmallWinds());      // 5 小四喜
		handPatterns.add(new GreatDragon());     // 6 大三元
		handPatterns.add(new SmallDragon());     // 7 小三元
		handPatterns.add(new MixSuit());         // 8 混一色
		handPatterns.add(new AllinTriplets());   // 9 對對糊
		handPatterns.add(new ContainOneNine());  //10 花么
		handPatterns.add(new CommonHand());      //11 平糊
		handPatterns.add(new PrevalentWindTriplet());     //12 圈風牌刻子 TODO
		handPatterns.add(new SeatWindTriplet());     	  //13 門風牌刻子 TODO
		handPatterns.add(new RedDragon());       //14 紅中刻子
		handPatterns.add(new GreenDragon());     //15 發財刻子
		handPatterns.add(new WhiteDragon());     //16 白板刻子
		handPatterns.add(new Chicken());         //17 雞糊
	}

	public static HandChecker getInstance() {
		return instance;
	}

	private boolean checkPattern(int index) {
		if (handPatterns.get(index).checkPattern(hand)) {
			if (handPatterns.get(index).getPoint() == -1) {
				winningHand.clear();
			}
			winningHand.add(handPatterns.get(index));

			return true;
		} else
			return false;
	}

	public void checkHand(Hand hand) {
		this.hand = hand;
		boolean hasDragon = false;
		boolean hasWind = false;
		winningHand = new ArrayList<HandPattern>();

		if (checkPattern(17)) {
			for (int i = 14; i < 17; i++)
				if (checkPattern(i))
					hasDragon = true;

			for (int i = 12; i < 14; i++)
				if (checkPattern(i))
					hasWind = true;

			if (hasDragon) {
				if (!checkPattern(3)) {
					checkPattern(8);
					checkPattern(9);
					checkPattern(10);
					if (!checkPattern(6))
						checkPattern(7);
				}
			} else if (hasWind) {
				if (!checkPattern(0)) {
					checkPattern(8);
					checkPattern(9);
					checkPattern(10);
					checkPattern(5);
				}
			} else {
				if (!checkPattern(2)) {
					checkPattern(9);
					checkPattern(10);
					checkPattern(11);
					if (checkPattern(8))
						checkPattern(5);
					else
						checkPattern(4);
				}
			}
		}
		else
			checkPattern(1);

		Collections.sort(winningHand, new Comparator<HandPattern>() {
			@Override
			public int compare(HandPattern hp1, HandPattern hp2) {
				return ((Integer) hp1.getPoint()).compareTo((Integer) hp2.getPoint());
			}
		});

	}
	
	public int calculatePoints() {
		if (!winningHand.isEmpty()) {
			int points = 0;
			System.out.println("Hand patterns: ");		
			for (HandPattern hp : winningHand) {
				System.out.println(hp.toString());
				points += hp.getPoint();
			}
			System.out.println("\nTotal winning point: " + (points == -1 ? "Maximum" : points));
			return points;
		}
		else {
			System.out.println("This hand is a Trick Hand!");
			return -2;
			}
	}
}
