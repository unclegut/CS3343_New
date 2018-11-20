package MahJong;

public final class Validation {
	
	private Validation() {} //if no no-argument constructor, the class will be highlighted
							//with red color when testing

	public static boolean validateHand(String[] str) {
		if (str.length != 14) { // length = 14
			System.out.println("Your hand do not have 14 Tiles!");
			return false;
		}

		else { 
			for (int i = 0; i < str.length; i++) {
				
				// Suit validation
				if (Suits.suitCharToEnum(str[i].charAt(0)) == null) {
					System.out.println(str[i].charAt(0) + " is not a valid Suit!");
					System.out.println("Error: " + str[i]);
					return false;
				}
				
				// c,b,d rank
				if (str[i].charAt(0) == 'c' || str[i].charAt(0) == 'b' || str[i].charAt(0) == 'd') {
					if (!(str[i].charAt(1) >= '1' && str[i].charAt(1) <= '9')) {
						System.out.println("Rank of Character, Bamboo and Dot tile should between 1-9.");
						System.out.println("Error: " + str[i]);
						return false;
					}
				}

				// wind, dragon rank
				else if (!(str[i].charAt(1) == '0')) {
					System.out.println("Rank of Winds and Dragon tile should be 0.");
					System.out.println("Error: " + str[i]);
					return false;
				}

				//string length
				if ((str[i].length() > 2)) {
					System.out.println("Tile input should be in String with length 2.");
					System.out.println("For example, c1 for character 1, _0 for White Dragon");
					System.out.println("Error: " + str[i]);
					return false;
				}

				//tile > 4
				int tempCount = 0;
				for (int j = 0; j < str.length; j++) {
					if (str[i].charAt(0) == str[j].charAt(0) && str[i].charAt(1) == str[j].charAt(1))
						tempCount++;
				}

				if (tempCount > 4) {
					System.out.println("A tile can only have 4 copies!");
					System.out.println("Error: " + str[i]);
					return false;
				}

				tempCount = 0;
			}
		}

		return true;

	}

	public static boolean validateWind(char wind) {

		if (!(wind == 'E' || wind == 'S' || wind == 'W' || wind == 'N')) {
			System.out.println("Wind should be E/S/W/N.");
			System.out.println("Error: " + wind);
			return false;
		}

		else
			return true;
	}

}
