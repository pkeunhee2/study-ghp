package kr.pe.ghp.study.dp.builder;

/**
 * 
 * @author geunhui park
 *
 */
public class PersonInfo {
	private final String name;
	private final int age;
	private final String address;
	private final String telephone;

	public PersonInfo(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.address = builder.address;
		this.telephone = builder.telephone;
	}

	public static class Builder {
		private final String name;
		private final int age;

		private String address;
		private String telephone;

		public Builder(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder telephone(String telephone) {
			this.telephone = telephone;
			return this;
		}

		public PersonInfo build() {
			return new PersonInfo(this);
		}
	}

	@Override
	public String toString() {
		return "PersonInfo [name=" + name + ", age=" + age + ", address=" + address + ", telephone=" + telephone + "]";
	}
}
