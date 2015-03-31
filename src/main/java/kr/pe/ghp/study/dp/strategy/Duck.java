package kr.pe.ghp.study.dp.strategy;

/**
 * behavior 를 interface 로 정의
 * @author geunhui park
 *
 */
public class Duck {
	QuackStrategy quackStrategy;
	FlyStrategy flyStragegy;

	public void setQuackStrategy(QuackStrategy quackStrategy) {
		this.quackStrategy = quackStrategy;
	}

	public void setFlyStragegy(FlyStrategy flyStragegy) {
		this.flyStragegy = flyStragegy;
	}

	public void fly() {
		flyStragegy.fly();
	}

	public void quack() {
		quackStrategy.quack();
	}
}
