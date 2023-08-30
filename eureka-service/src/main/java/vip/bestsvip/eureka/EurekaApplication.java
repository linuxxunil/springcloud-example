package vip.bestsvip.eureka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication implements CommandLineRunner {
	
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		
	}
}
