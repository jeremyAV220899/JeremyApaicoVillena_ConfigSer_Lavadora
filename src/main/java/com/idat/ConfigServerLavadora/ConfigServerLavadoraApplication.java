package com.idat.ConfigServerLavadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerLavadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerLavadoraApplication.class, args);
	}

}
