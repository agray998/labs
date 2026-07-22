package lab6;

public class RegistrationPlate {
	private String number;
	
	RegistrationPlate(String number) {
		this.number = number;
	}

	public String getNumber() {
		return this.number;
	}
}

class RegistrationPlateFactory {
	private static int index;
	private static String[] registrationPlates = {
			"LA05 XYZ",
			"NG58 JKL",
			"MA13 HYP",
			"BX06 TUV",
			"CF67 QRS"
	};
	
	public static RegistrationPlate getNextRegistrationPlate() {
		String number = RegistrationPlateFactory.registrationPlates[RegistrationPlateFactory.index];
		RegistrationPlateFactory.index++;
		RegistrationPlate plate = new RegistrationPlate(number);
		return plate;
	}
}
