package de.fhro.inf.prg3.a08.strategy;

import java.util.ArrayList;
import java.util.List;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Created by flmueh on 29.11.17.
 */

public abstract class FilterBase implements MealsFilter {
    public abstract boolean include(Meal m);

    public List<Meal> filter(List<Meal> meals) {
        List<Meal> mealsToReturn = new ArrayList<>();
        for(Meal m : meals) {
            if(include(m))
                mealsToReturn.add(m);
        }

        return mealsToReturn;
    }
}
