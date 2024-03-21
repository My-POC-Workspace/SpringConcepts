package com.many2many.demo.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	// If we dont want to use both @Qualifier or @Primary, we can use Autowiring by name...
	//@Qualifier("bike")
	//@Autowired // ByDefault all autowired annotation are required true...
	//private Speed bike;    // Autowiring by name --> name should be in smallcase...
	//private Speeed car;// Autowiring by name --> name should be in smallcase...
	
	private Speed speed;
	
	// Via setter 
//	@Autowired(required = false)
//	public void setSpeed(@Qualifier("car") Speed speed) {
//		this.speed = speed;
//	}
	
	
	@Autowired(required = false)
	public Controller(@Qualifier("car") Speed speed) { // --> Here I have removed @service annotation from the car so that it's bean object will not get created...
		this.speed = speed;
	}
	
	// If we are trying to inject the bean but if the bean is not present then constructor injection will not start the server and then terminate the server whereas setter injection will start the server but will not terminate the server...

	@GetMapping("/speed")
	public String getSpeedOfVehicle() {
		return speed.getSpeed();
	}

	
}
