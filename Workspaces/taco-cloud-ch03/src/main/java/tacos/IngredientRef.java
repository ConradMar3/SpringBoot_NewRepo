package tacos;

import lombok.Data;

@Data
public class IngredientRef {

  private final String ingredient = "";

public IngredientRef(Object id) {
	// TODO Auto-generated constructor stub
}

public String getIngredient() {
	return ingredient;
}
  
}
