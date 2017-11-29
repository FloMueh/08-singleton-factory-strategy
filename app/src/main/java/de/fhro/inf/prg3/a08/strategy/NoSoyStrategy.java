package de.fhro.inf.prg3.a08.strategy;

import java.util.ArrayList;
import java.util.List;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Created by flmueh on 29.11.17.
 */

public class NoSoyStrategy extends FilterBase {
    @Override
    public boolean include(Meal m) {
        boolean containsSoja = false;

        for(String s : m.getNotes()) {
            containsSoja = s.contains("soja");

            if(containsSoja)
                return false;
        }

        return containsSoja;
    }
}
