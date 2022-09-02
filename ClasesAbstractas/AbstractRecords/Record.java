package abstractRecords;

public abstract class Records {

	// Attributes
	String name;

	// Methods
	public abstract void move();

	public abstract void calls();

}

class PlasticBeach extends Records {

	@Override
	public void move() {
		System.out.println("Plastic Beach is the third studio album by British virtual band Gorillaz.");
	}

	@Override
	public void calls() {
		System.out.println(" It was released on 3 March 2010 by Parlophone internationally");
	}

}

class Jungle extends Records {

	@Override
	public void move() {
		System.out.println("Jungle is the debut studio album by London-based modern musical collective Jungle.");
	}

	@Override
	public void calls() {
		System.out.println("It was released on 14 July 2014 through XL Recordings.");
	}

}

class Funeral extends Records {

	@Override
	public void move() {
		System.out.println("Funeral is the debut studio album by Canadian indie rock band Arcade Fire.");
	}

	@Override
	public void calls() {
		System.out.println("Released on September 14, 2004 by Merge Records.");
	}

}

class Odyssey extends Records {

	@Override
	public void move() {
		System.out.println("Somewhere in my mind when listening to this album, I knew the only thing I was doing was abusing nostalgia to get into this record, but I can’t say I’m even remotely upset with that.");
	}

	@Override
	public void calls() {
		System.out.println("Odyssey isn’t an album itself that makes me nostalgic, but it’s sound and style is incredibly indicative of its time it came out, and I’m amazed that I never stumbled upon it back in 2014 when all I knew was EDM.");
	}

}

class Floralshoppe extends Records {

	@Override
	public void move() {
		System.out.println("Floral Shoppe is the ninth studio album by the American electronic musician Vektroid under the alias Macintosh Plus.");
	}

	@Override
	public void calls() {
		System.out.println("Released on December 9, 2011 by the independent record label Beer on the Rug.");
	}

}
