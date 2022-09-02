package abstractKanye;

public abstract class Kanye {

	// Attributes
	String name;

	// Methods
	public abstract void move();

	public abstract void calls();

}

class BlackSkinhead extends Kanye {

	@Override
	public void move() {
		System.out.println("Sure, Kanye loves talking about himself (he is a god, after all), but let’s not lie – he’s really good at it.");
	}

	@Override
	public void calls() {
		System.out.println(" There’s even a knowing glimpse into his psyche: ‘I’m outta control now, but there’s nowhere to go now, and there’s no way to slow down’.");
	}

}

class BloodOnTheLeaves extends Kanye {

	@Override
	public void move() {
		System.out.println("Think vocoders are only for warbling divas? Not when Ye’s on the case in this huge, fearsome track, co-produced by TNGHT.");
	}

	@Override
	public void calls() {
		System.out.println("His vitriol leads him through everything from out-of-body experiences on MDMA to his hatred of phonies to what sounds like a bitter divorce story.");
	}

}

class Fade extends Kanye {

	@Override
	public void move() {
		System.out.println("Kanye the auto-tune singer tries mightily to break through on Fade, but he simply, mercifully can’t.");
	}

	@Override
	public void calls() {
		System.out.println("This is Kanye as an architect of sound working at the peak of his powers on a track with so much raw power that the rapper’s vocals.");
	}

}

class NewSlaves extends Kanye {

	@Override
	public void move() {
		System.out.println("New Slaves is too real to me. It’s like a freestyle of real talk, with the sickest beat.");
	}

	@Override
	public void calls() {
		System.out.println("It’s like the beat was made for the verses themselves. Too nang – trust me.");
	}

}

class GhostTown extends Kanye {

	@Override
	public void move() {
		System.out.println("A bright light on the otherwise shrugged-off Ye, ‘Ghost Town’ indulges Kanye’s impulses to sing.");
	}

	@Override
	public void calls() {
		System.out.println("And once the guitar hook kicks in and 070 Shake sings the soaring refrain ‘nothing hurts anymore,’ it’s hard not to cave into the comfortable numbness.");
	}

}