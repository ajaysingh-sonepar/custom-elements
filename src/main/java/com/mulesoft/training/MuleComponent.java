package com.mulesoft.training;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mule.api.annotations.param.InboundHeaders;
import org.mule.api.annotations.param.Payload;

public class MuleComponent {
	
	int count;
	
	public MuleComponent(){
		count = 1;
	}

	public Map<String, String> processMap(Map<String, String> input) {
		// processMap implementation
		input.put("processed by", "processMap");
		return input;
	}

	public Map<String, String> processArray(List<String> input) {
		// processArray implementation
		Map<String, String> output = new HashMap<String, String>();
		output.put("message", input.get(0));
		output.put("processed by", "processArray");
		return output;
	}

	public Map<String, String> processString(String input) {
		Map<String, String> output = new HashMap<String, String>();
		output.put("message", input);
		output.put("processed by", "processString");
		return output;
	}

	public Map<String, String> processAll(@Payload Object input, @InboundHeaders("http.method") String method) {
		Map<String, String> output = new HashMap<String, String>();
		output.put("message", input.toString());
		output.put("http.method", method);
		output.put("processed by", "processAll");
		output.put("currentCount", count + "");
		count++;
		return output;
	}

	public Map<String, String> processString2() {
		// processString2 implementation
		return null;
	}

}
