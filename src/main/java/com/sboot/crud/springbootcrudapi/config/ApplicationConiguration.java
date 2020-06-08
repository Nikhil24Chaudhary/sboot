package com.sboot.crud.springbootcrudapi.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConiguration {
	@Value("${spring.profiles.active}")
	String activeProfile;
	
	public String getActiveProfile() {
		return activeProfile;
	}

	public void setActiveProfile(String activeProfile) {
		this.activeProfile = activeProfile;
	}
	
	 @Bean(name = "db1")
	 @ConfigurationProperties(prefix = "spring.datasource")
	 public DataSource dataSource1() {
	  return DataSourceBuilder.create().build();
	 }
	 
	

}
