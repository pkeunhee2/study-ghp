package kr.pe.ghp.study.dp.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author geunhui park
 *
 */
public class Test {
	public static void main(String[] ar) {
		List<Duck> ducks = new ArrayList<Duck>();
		Duck decoyDuck = new Duck();
		Duck mallardDuck = new Duck();
		ducks.add(decoyDuck);
		ducks.add(mallardDuck);

		decoyDuck.setFlyStragegy(new FlyStrategy() {
			@Override
			public void fly() {
				System.out.println("I can't fly");
			}
		});

		decoyDuck.setQuackStrategy(new QuackStrategy() {
			@Override
			public void quack() {
				System.out.println("<< silent >>");
			}
		});

		mallardDuck.setFlyStragegy(new FlyStrategy() {
			@Override
			public void fly() {
				System.out.println("fly high with wings");
			}
		});

		mallardDuck.setQuackStrategy(new QuackStrategy() {
			@Override
			public void quack() {
				System.out.println("quack quack quack!~~~");
			}
		});

		for (Duck aDuck : ducks) {
			aDuck.fly();
			aDuck.quack();
		}
	}
}
