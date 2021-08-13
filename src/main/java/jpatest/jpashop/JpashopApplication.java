package jpatest.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		Test test = new Test();
		test.setData("dd");
		String data = test.getData();
		System.out.println(data);
		SpringApplication.run(JpashopApplication.class, args);
	}

}
