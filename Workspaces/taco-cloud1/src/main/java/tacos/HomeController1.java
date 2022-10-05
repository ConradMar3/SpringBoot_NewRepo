package tacos;


import lombok.Data;

@Data
public class HomeController1 {
private final String id = "";
private final String name = "";
private final String type = "";
public enum Type {
WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
}
}