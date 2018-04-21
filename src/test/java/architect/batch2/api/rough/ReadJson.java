package architect.batch2.api.rough;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import architect.batch2.api.POJO.Sample;

public class ReadJson {

	public static void main(String[] args) throws IOException {
		Map<String,Object> map=new HashMap<String, Object>();
		byte[] jsondata = Files.readAllBytes(
				Paths.get("D:\\JavaDemo\\architect.batch2.api\\src\\test\\resources\\jsonFiles\\Sample.json"));

		ObjectMapper mapper = new ObjectMapper();
		//Sample sample = mapper.readValue(jsondata, Sample.class);
		
		JsonNode rootNode=mapper.readTree(jsondata);
		
		System.out.println(rootNode.isArray());
		System.out.println(rootNode.size());
		int count=1;
		if(rootNode.isArray()){
		for(JsonNode childNode:rootNode)
		{
			//System.out.println(childNode);
			Sample sample=mapper.convertValue(childNode, Sample.class);
			//System.out.println(sample.getFirstname());
			Iterator<String> itr=childNode.fieldNames();
			while(itr.hasNext())
			{
				String key=itr.next();
				JsonNode value=childNode.findValue(key);
				//key=key+"_"+count;
				//System.out.println("Key: "+key+" value: "+childNode.findValue(key));
				map.put(key+"_"+count, value);
			}
			count=count+1;
		}
		
		//System.out.println(sampl);
		/*System.out.println(sample);
		System.out.println(sample.getFirstname());
		System.out.println(sample.getAddress().getStreet());
		System.out.println(sample.getPhoneNumbers().get(1));*/
		}
		else
		{
			Sample sample=mapper.convertValue(rootNode, Sample.class);
			System.out.println(sample);
		}
		
		System.out.println(map);
		
	}

}
