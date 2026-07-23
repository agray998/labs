package oo2;

public class StringsLab {

	public static void main(String[] args) {
		String name = "John";
		System.out.println(name.charAt(2));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		for (char c : name.toCharArray()) {
			System.out.printf("%c\t", c);
		}
		System.out.println();
		System.out.println(name.startsWith("Jo"));
		System.out.println(name.endsWith("foo"));
		System.out.println(name.indexOf('h'));
		// String fullname = name + " " + "Smith";
		String fullname = String.format("%s %s", name, "Smith");
		System.out.println(fullname);
		
		StringBuilder sb = new StringBuilder("Bruce Springsteen ");
		sb.append("is the artist ever");
		sb.insert(25, "coolest ");
		sb.replace(25, 32, "best");
		sb.replace(sb.toString().indexOf("artist"), sb.toString().indexOf("artist") + "artist".length(), "rockstar");
		sb.delete(sb.toString().indexOf("Springsteen"), sb.toString().indexOf("Springsteen") + "Springsteen".length());
		System.out.println(sb.toString());
	}

}
