package abstractPaint;

public abstract class Paint {

	// Attributes
	String name;

	// Methods
	public abstract void move();

	public abstract void calls();

}

class salvatorMundi extends Paint {

	@Override
	public void move() {
		System.out.println("This is perhaps one of the most famous paintings in the world, in no small part because of its purchase by Saudi Arabian crown prince Mohammed Bin Salman in 2017.");
	}

	@Override
	public void calls() {
		System.out.println(" It is one of the last works by Leonardo da Vinci and seamlessly ties together the physical world with the realms of religion and spirituality.");
	}

}

class  number17A extends Paint {

	@Override
	public void move() {
		System.out.println("Painted by noted American abstract expressionist Jackson Pollock in 1948, Number 17A is one of the earlier works in his ‘drip painting’ series.");
	}

	@Override
	public void calls() {
		System.out.println("A more careful examination of the piece reveals exactly how each colour was applied and the high level of precision that went into it.");
	}

}

class No6 extends Paint {

	@Override
	public void move() {
		System.out.println("Certainly one of the more unusual paintings on this list, No.6 was painted by Latvian-American artist Mark Rothko in 1951.");

	}

	@Override
	public void calls() {
		System.out.println("The most notable aspect of this painting, however, is that it is one of the 36 artworks named in the Bouvier Affair.");

	}

}

class MaertenSoolmans extends Paint {

	@Override
	public void move() {
		System.out.println("In 1634, the Dutch master was commissioned to paint a portrait of a young couple on the occasion of their wedding.");
	}

	@Override
	public void calls() {
		System.out.println("Both were part of the Amsterdam elite, and Oopjen Coppit’s hand in marriage was much sought-after by many suitors in the city.");
	}

}

class LucianFreud extends Paint {

	@Override
	public void move() {
		System.out.println("Irish-born painter Francis Bacon created this delightful triptych to honor fellow artist Lucian Freud.");
	}

	@Override
	public void calls() {
		System.out.println("Freud, the grandson of the famous neurologist and psychoanalyst, met Bacon in 1945 and the two of them painted each other quite a few times.");
	}

}
