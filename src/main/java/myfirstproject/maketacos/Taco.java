package myfirstproject.maketacos;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Taco {
    private String name;
    private String wrap;
    private ArrayList<String> ingredients;

}
