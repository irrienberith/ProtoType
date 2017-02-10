package com.ray.tools.prototype.utils;

import org.json.JSONArray;

/**
 * Created by Ray on 2016/9/10.
 */
public class InstanceManager {
    private JSONArray instanceArray;
    private static InstanceManager THIS;

    public static InstanceManager getInstance(){
        if(THIS==null){
            THIS = new InstanceManager();
            readFromPreference();
        }
        return THIS;
    }

    private static void readFromPreference(){
        // TODO: 2016/9/10
    }

    public void saveToPreference(){

    }

    public void importFromStorage(){

    }


    public void exportToStorage(){

    }

    public JSONArray getInstanceArray(){
        return instanceArray;
    }
}
