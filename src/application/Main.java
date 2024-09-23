package application;

import models.IPhone;

public class Main {
	public static void main(String[] args) {
		
		IPhone iPhone = new IPhone();

		iPhone.call("+55 9 9999-9999");
		iPhone.selectMusic("Country Roads");
		iPhone.showPage("https://www.dio.me/");

	}
}
