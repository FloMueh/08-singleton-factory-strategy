package de.fhro.inf.prg3.a08.strategy;

import java.util.List;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Created by flmueh on 29.11.17.
 */

public class AllMealsStrategy implements MealsFilter {
    @Override
    public List<Meal> filter(List<Meal> meals) {
        return meals;
    }
}
