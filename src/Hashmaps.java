import java.awt.*;
import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args){
        HashMap<String,Integer> examScores = new HashMap<String,Integer>();
        examScores.put("Math",75);
        examScores.put("Physics",81);
        examScores.put("Chemistry",89);
        examScores.put("Economics",95);
        examScores.putIfAbsent("Math",70);

        System.out.println(examScores.toString());
        System.out.println(examScores.get("Economics"));

        examScores.replace("Math",85);
        System.out.println(examScores.toString());

        System.out.println(examScores.getOrDefault("Religion",-1));

        examScores.remove("Physics");
        System.out.println(examScores.toString());
        System.out.println(examScores.containsValue(100));
        System.out.println(examScores.isEmpty());

//        examScores.clear();
//        System.out.println(examScores.toString());
//        System.out.println(examScores.size());

        examScores.forEach((subject,score) -> {
            System.out.println(subject+"-"+score);
            examScores.replace(subject,score+5);
        });
        System.out.println(examScores.toString());
    }
}
