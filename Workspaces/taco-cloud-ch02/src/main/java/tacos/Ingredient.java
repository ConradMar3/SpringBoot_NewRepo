package tacos;

import lombok.Data;

public class Ingredient {

    public Ingredient(String string, String string2, Type protein) {
		// TODO Auto-generated constructor stub
	}

	private final String id = "";
    private final String name = "";
    private final Type type = null;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
