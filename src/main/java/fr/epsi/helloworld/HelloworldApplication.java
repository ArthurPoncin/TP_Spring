package fr.epsi.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	@GetMapping("hello")
	public String hello(@RequestParam String param) {
		return "Hello, " + param;
	}

	@Autowired
	private fr.epsi.helloworld.service.BavardService bavardService;

	@GetMapping("bavard")
	public String getMethodName() {
		return bavardService.parler();

	}

	@Autowired
	private fr.epsi.helloworld.bo.NotificationService notificationService;

	@GetMapping("notif")
	public String getNotifString() {
		return notificationService.sendNotification();
	}

}
