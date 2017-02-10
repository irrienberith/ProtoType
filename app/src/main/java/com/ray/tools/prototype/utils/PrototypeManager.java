package com.ray.tools.prototype.utils;

/**
 * Created by Ray on 2016/9/10.
 */
public class PrototypeManager {
    private static PrototypeManager THIS;

    public static PrototypeManager getInstance() {
        if (THIS == null) {
            THIS = new PrototypeManager();
            readFromPreference();
        }
        return THIS;
    }

    private static void readFromPreference() {
        // TODO: 2016/9/10
    }

    public void saveToPreference() {

    }

    public void importFromStorage() {

    }


    public void exportToStorage() {

    }
}