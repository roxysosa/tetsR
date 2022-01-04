import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;
import java.util.Map;
import java.util.HashMap;
import org.json.simple.JSONObject;
public class Program
{
    public static final int stat = 1;
    public static String TEST_RUN_ID = "410";
    public static String TEST_CASE_ID = "30909";
    public static String sw_version = "30";


    public static void main(String[] args) throws Exception
    {
        APIClient client = new APIClient("servers");
        client.setUser("user");
        client.setPassword("paswaord");
        //JSONObject c = (JSONObject) client.sendGet("get_case/30909");
        JSONObject c = (JSONObject) client.sendGet("get_results/72002");
        System.out.println(c.get("title"));
        System.out.println(c);

        Map data = new HashMap();
        data.put("status_id", stat );
        data.put("custom_sw_version",sw_version);
        //data.put("custom_sw_version", "6.2.3.114" );
        data.put("comment", "This test worked fine!");
       // JSONObject r = (JSONObject) client.sendPost("add_result/30909"  , data);
        JSONObject r = (JSONObject) client.sendPost("add_result_for_case/410/30909", data);


    }
}


