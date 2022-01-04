import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;
import java.util.Map;
import java.util.HashMap;
import org.json.simple.JSONObject;
public class Program
{
    public static void main(String[] args) throws Exception
    {
        APIClient client = new APIClient("https://ceztherm.testrail.io");
        client.setUser("rosamis.fortun@idneo.com");
        client.setPassword("xmr");
        JSONObject c = (JSONObject) client.sendGet("get_case/30909");
        System.out.println(c.get("title"));


    }
}


