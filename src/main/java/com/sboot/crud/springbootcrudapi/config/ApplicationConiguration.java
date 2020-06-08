package com.sboot.crud.springbootcrudapi.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
public class ApplicationConiguration {
	@Value("${spring.profiles.active}")
	String activeProfile;
	
	@Autowired 
	DataSource dataSource;

	@Autowired
	JpaVendorAdapter jpaVendorAdapter;
	
	public String getActiveProfile() {
		return activeProfile;
	}

	public void setActiveProfile(String activeProfile) {
		this.activeProfile = activeProfile;
	}
	
	
	

	@Bean
	@Primary
	public EntityManagerFactory entityManagerFactory() {
	    LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
	    emf.setDataSource(dataSource);
	    emf.setJpaVendorAdapter(jpaVendorAdapter);
	    emf.setPackagesToScan("com.sboot.crud");
	    emf.setPersistenceUnitName("default");
	    emf.afterPropertiesSet();
	    return emf.getObject();
	}

	

}
