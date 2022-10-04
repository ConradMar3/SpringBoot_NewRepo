package tacos;

import lombok.Data;

@Data
public class Ingredient {

    private final String id = "";
    private final String name = "";
    private final Type type;
    public Ingredient(String string, String string2, Type wrap) {
        this.type = null;
        // TODO Auto-generated constructor stub
    }

    public Object getType() {
        // TODO Auto-generated method stub
        return null;
    }

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
