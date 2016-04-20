package share;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.weego.main.dto.POIDetailCommentsDto;
import com.weego.main.model.BasePOITag;
import com.weego.main.util.HttpUtil;

public class HttpUtilTest extends BaseTest {
	
	@Test
	public void testPOI() {
	
		String url = "http://www.weegotr.com/api/v2/pgcDetail";
		String pgcId = "56ebea959a13859217000365";
		JSONObject result =  JSONObject.parseObject(HttpUtil.sendGet(url, "pgcId=" + pgcId, "other"));
		JSONObject json = result.getJSONObject("result");
		List<Map<String, Object>> poiList = (List<Map<String, Object>>) json.get("pgc_poi");
		for(int i=0;i<poiList.size();i++) {
			Map<String, Object>	detail = (Map<String, Object>) poiList.get(i).get("detail");
			
			if(detail != null && detail.size() != 0) {
//				System.out.println(detail);
				if(detail.containsKey("subLabelNew")) {
					System.out.println(detail.get("subLabelNew"));
				}
			}
			
		}
	
		
	}
	
	
}
