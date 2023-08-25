package com.example.taco_cloud.dto;

import com.example.taco_cloud.entity.Ingredient;
import lombok.Data;
import java.util.List;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
