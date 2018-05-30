/**
 *
 */
package person;

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person taro=new Person();
		taro.name="taro";
		taro.age=18;
		taro.phoneNumber="070-0000-0000";
		taro.address="埼玉";
		taro.country="日本";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		System.out.println(taro.country);
		taro.talk();
		taro.walk();
		taro.run();


		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="0120-0000-0000";
		jiro.address="東京";
		jiro.country="日本";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.println(jiro.country);


		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="090-0000-0000";
		hanako.address="神奈川";
		hanako.country="日本";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println(hanako.country);

		Person saburo=new Person("saburo",0);
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person none=new Person("名前なし",25);
		System.out.println(none.name);
		System.out.println(none.age);

		Person woman=new Person("hanako",17);
		System.out.println(woman.name);
		System.out.println(woman.age);



		Robot aibo=new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo=new Robot();
		asimo.name="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper=new Robot();
		pepper.name="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();

		Robot doraemon=new Robot();
		doraemon.name="ドラえもん";
		doraemon.talk();
		doraemon.walk();
		doraemon.run();
	}

}
