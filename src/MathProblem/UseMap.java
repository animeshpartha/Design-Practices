package MathProblem;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Map<String, String> state = new HashMap<String, String>();
        state.put("USA", "NY");
        state.put("USA", "NJ");
        state.put("USA", "FL");

        System.out.println(state.get("USA"));


    }
}
