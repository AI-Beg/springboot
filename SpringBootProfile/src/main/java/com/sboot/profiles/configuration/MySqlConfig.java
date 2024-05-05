package com.sboot.profiles.configuration;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MySqlConfig {

//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource.mysql")
//	public DataSource mysqlDataSource() {
//		return DataSourceBuilder.create().build();
//	}

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.mysql")
	DataSourceProperties mySqldataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	DataSource mySqlDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(mySqldataSourceProperties().getUrl());
		driverManagerDataSource.setUsername(mySqldataSourceProperties().getUsername());
		driverManagerDataSource.setPassword(mySqldataSourceProperties().getPassword());
		driverManagerDataSource.setDriverClassName(mySqldataSourceProperties().getDriverClassName());
		return driverManagerDataSource;

	}

//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource.mysql")
//	public DataSource mysqlDataSource(DataSourceProperties dataSourceProperties) {
//		return dataSourceProperties.initializeDataSourceBuilder().build();
//	}

}
