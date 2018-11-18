package MahJong;
public enum Suits {
		Character('c'), //0
		Bamboo('b'), //1
		Dot('d'), //2
		NorthWind('n'), //3
		EastWind('e'), //4
		SouthWind('s'), //5
		WestWind('w'), //6
		RedDragon('r'), //7
		GreenDragon('g'), //8
		WhiteDragon('_'); //9
		//Flower('f');
	
		private final char suit;
	
		private Suits(char suit) {
			this.suit = suit;
		}
		
		public static Suits suitCharToEnum(char x) {
			switch (x) {
			case 'c':
				return Character;
			case 'b':
				return Bamboo;
			case 'd':
				return Dot;
			case 'n':
				return NorthWind;
			case 'e':
				return EastWind;
			case 's':
				return SouthWind;
			case 'w':
				return WestWind;
			case 'r':
				return RedDragon;
			case 'g':
				return GreenDragon;
			case '_':
				return WhiteDragon;
			//case 'f':
				//return Flower;
			}
			return null;
		}

		public char getSuit(){
			return suit;
		}
		
}