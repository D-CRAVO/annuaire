package cda.annuaire.common;

import java.util.ArrayList;
import java.util.List;

public abstract class ListUtils {
    public static <T> List<T> safe(List<T> l){
        return l == null ? new ArrayList<>() : l;
    }
}
