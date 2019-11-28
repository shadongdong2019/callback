package com.unitrust.callback;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class CallbackController {
	private static final Logger logger = LoggerFactory.getLogger(CallbackController.class);
	
	/**
	 * 
	 * 
	 * @param partnerID
	 * @param partnerKey
	 * @param serialNo
	 * @param desc
	 * @return
	 */
	@PostMapping("callback")
	public Object callback(String serialNo, String desc, String salt) {
		logger.info("callback receiver serialNo: {}, desc: {}, salt: {}", serialNo, desc, salt);

		Map<String, Object> result = new HashMap<String, Object>();
		result.put("success", true);
		result.put("resultCode", "0204000");
		result.put("msg", "成功");
		result.put("serialNo", serialNo);
		result.put("desc", desc);
		return result;
	}
	
}
