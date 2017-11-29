package de.fhro.inf.prg3.a08.strategy;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Created by flmueh on 29.11.17.
 */

public class VegetarianStrategy extends FilterBase {
    @Override
    public boolean include(Meal m) {
        if(m.isVegetarian())
            return true;
        return false;
    }
}
