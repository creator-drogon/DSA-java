import java.util.LinkedHashMap;
import java.util.Map;


public class test {

    static {

        LinkedHashMap<Integer, String> mymao = new LinkedHashMap<>();
        mymao.put(1, "j");
        mymao.put(2,"k");

        for(Map.Entry mao : mymao.entrySet()){
            System.out.println(mao.getValue());
        }
    }

}
