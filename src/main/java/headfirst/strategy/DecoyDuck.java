package headfirst.strategy;

/**
 * 모조 duck
 * @author geunhui park
 *
 */
public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}

	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
