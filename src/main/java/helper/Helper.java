package helper;
import com.google.gson.Gson;
public class Helper {
    public static void generateJson(Object object) {
        Gson gson = new Gson();

        System.out.println(gson.toJson(object));
    }
}
