package org.springFramework.first_rest_Id;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@RestController
public class GreetingController {

	private static final String template="Hello %s!";
	
	@RequestMapping("/greet")
	public Greeting greet(@RequestParam(value="name" ,defaultValue="Jane Doe") String name,@RequestParam(value="location",defaultValue="India") String loc)	{
	
		return new Greeting(String.format(template,name),loc);
	}
	
	
	
}
