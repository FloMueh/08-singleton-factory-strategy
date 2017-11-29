package de.fhro.inf.prg3.a08.strategy;

import static de.fhro.inf.prg3.a08.strategy.MealType.*;

/**
 * Created by flmueh on 29.11.17.
 */

public class MealsFilterFactory {
    public static MealsFilter getStrategy(MealType strategy) {
        switch (strategy) {
            case NO_PORK:
                return new NoPorkStrategy();
            case NO_SOY:
                return new NoSoyStrategy();
            case VEGETARIAN:
                return new VegetarianStrategy();
            default:
                return new AllMealsStrategy();
        }
    }
}
