package myjscript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by Developer on 6/27/2017.
 */
public class JavaToJS {
    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("JavaScript");

        engine.put("myparam", "world");
        Object eval = null;
        try {
            eval = engine.eval("function hello(p) { return \"Hello, \" + p; } \n" +
                    "hello(myparam)");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        System.out.println(eval);
    }
}
