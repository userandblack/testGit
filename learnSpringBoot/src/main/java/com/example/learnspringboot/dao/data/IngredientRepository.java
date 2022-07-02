package com.example.learnspringboot.dao.data;

import com.example.learnspringboot.dao.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
