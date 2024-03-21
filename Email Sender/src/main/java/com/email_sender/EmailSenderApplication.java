package com.email_sender;

import com.email_sender.EmailSenderService.SendEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailSenderApplication implements ApplicationRunner {

	@Autowired
	private SendEmail sendEmail;

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		for(int i = 0; i < 1000; i++) {
			this.sendEmail.sendSimpleEmail("paswanvimlesh481@gmail.com", "Demo Subject", "Dummy Body");
		}
	}

}
