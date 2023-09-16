package com.mateus.erp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CadastroClienteApplicationTests {

	@Test
	void contextLoads() {
		String firstName = "Mateus";
		String lastName = "Andrade";

		System.out.println("Ola eu sou o : " + firstName);
		System.out.println("ACABOU");
	}

}
