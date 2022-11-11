package com.jdc.mkk.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jdc.mkk.entity.Member;

public class UserTest {

	static EntityManagerFactory emf;
	EntityManager em;

	@BeforeAll
	static void createEntityManagerFactory() {
		emf = Persistence.createEntityManagerFactory("02-jpa-test");
	}

	@BeforeEach
	void createEntityManager() {
		em = emf.createEntityManager();
	}

	@Test
	void createMember() {
		Member m = new Member();
		m.setName("Aung Aung");
		m.setEmail("aungaung@gmail.com");
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
	}

	@AfterEach
	void closeEntityManager() {
		em.close();
	}

	@AfterAll
	static void closeEMF() {
		emf.close();
	}
}
