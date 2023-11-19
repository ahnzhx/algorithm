import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class APITest {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://dummyjson.com/products");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        conn.setRequestProperty("Content-type", "application/json");

        // 받아온 json 데이터 출력 가능 상태로 변경
        conn.setDoOutput(true);

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

        StringBuilder sb = new StringBuilder();
        while(br.ready()){
            sb.append(br.readLine());
        }
        conn.disconnect();

        JSONObject result = (JSONObject) new JSONParser().parse(sb.toString());
        JSONArray array = (JSONArray) result.get("products");

        for (Object obj : array){
            JSONObject tmp = (JSONObject) obj;
            for (Object image : (JSONArray) tmp.get("images")){
                System.out.println(image);
            }
        }


    }
}
