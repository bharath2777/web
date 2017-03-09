import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class Rest {

	private List<String> datalist = new ArrayList<String>(Arrays.asList("report","summary")); 		
	
	@RequestMapping("/getData")
	public Data getData(@RequestParam(value="id, defaultValue="0")Integer id)"{
		return new Data(id, datalist.get(id));
	}

}
