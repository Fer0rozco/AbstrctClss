package abstractPlay;

public abstract class Play {

	// Attributes
	String name;

	// Methods
	public abstract void move();

	public abstract void calls();

}

class OedipusRex extends Play {

	@Override
	public void move() {
		System.out.println("Used as the exemplar of dramatic writing in Aristotle's Poetics.");
	}

	@Override
	public void calls() {
		System.out.println("This one stands the test of time simply because it's good stage storytelling.");
	}

}

class TwelfthNight extends Play {

	@Override
	public void move() {
		System.out.println("The Bard of Avon is the only writer to get two slots on this list.");
	}

	@Override
	public void calls() {
		System.out.println("The cross-dressing of one character also gives the play, for modern audiences, a homoerotic vibe, and this aspect, combined with a certain darkness in the end, makes the play feel unquestionably contemporary.");
	}

}

class Hamlet extends Play {

	@Override
	public void move() {
		System.out.println("What doesn't this tragedy have? There's sublime poetry, rich psychology for characters of both sexes, a hefty dose of comedy to leaven the mood.");

	}

	@Override
	public void calls() {
		System.out.println("Shakespeare took a standard-issue—for the period—genre and used it to create a monument in Western literature, dramatic or non.");

	}

}

class Tartuffe extends Play {

	@Override
	public void move() {
		System.out.println("Simultaneously riotous and scathing, this comedy explores and exposes the hypocrisy that can often lie underneath religious fervor.");
	}

	@Override
	public void calls() {
		System.out.println("The play might have been originally written as an indictment of members of Louis XIV's court.");
	}

}

class TheHumans extends Play {

	@Override
	public void move() {
		System.out.println("In this acclaimed drama a family's seemingly innocuous Thanksgiving gathering on the Lower East Side beats in tune with the tense pulse of the country.");
	}

	@Override
	public void calls() {
		System.out.println("A quiet rumination in the style of Chekhov or Thornton Wilder, the play quickly moved from its berth Off Broadway to one on Broadway.");
	}

}
