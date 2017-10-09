package com.ejemplo.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value="/welcome", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> welcome(){
		Map<String, Object> response = new HashMap<String,Object>();
		response.put("mensaje", "Hola Mundo!!");
		return response; 
	}

}
