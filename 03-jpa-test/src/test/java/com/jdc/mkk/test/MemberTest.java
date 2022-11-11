package com.jdc.mkk.test;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkk.entity.Member;
import com.jdc.mkk.entity.PSize;
import com.jdc.mkk.entity.Product;

class MemberTest {
	static EntityManagerFactory emf;
	EntityManager em;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("03-jpa-test");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
	}

	@ParameterizedTest
	@CsvSource(value = { "aung aung,aung@gmail.com,19st,mdy,mahar aung myay,Orange,2300",
			"maung maung,mung@gmail.com,22st,mdy,aung myay thar san,Apple,1400" })
	void testMember(String name, String email, String st, String city, String township, String p_name, int p_price) {
		Member m = new Member(name, email, name, township, city);
		List<String> list = List.of("Hello", "Hi");
		Product p = new Product(p_name, p_price, LocalDate.now(), PSize.MEDIUM, list);
		em.getTransaction().begin();
		em.persist(m);
		em.persist(p);
		em.getTransaction().commit();
	}

}
