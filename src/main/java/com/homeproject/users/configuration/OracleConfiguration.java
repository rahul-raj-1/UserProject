package com.homeproject.users.configuration;

import oracle.jdbc.pool.OracleDataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;
import java.sql.SQLException;

@Configuration
//@ConfigurationProperties("oracle")
@PropertySource("classpath:dev.properties")
public class OracleConfiguration {
	

    @NotNull  
    @Value( "${oracle.username}" )
    private String username;// we can remove value injection and just use 
                            //@ConfigurationProperties("oracle") in the class

    @NotNull
    @Value( "${oracle.password}" )
    private String password;
 
    @NotNull
    @Value( "${oracle.url}" )
    private String url;
    
    @NotNull
    @Value( "${oracle.driverType}" )
    private String driverType;
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public void setUrl(String url) {
        this.url = url;
    }
 
    
    public String getDriverType() {
		return driverType;
	}

	public void setDriverType(String driverType) {
		this.driverType = driverType;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}

	@Bean
    DataSource dataSource() throws SQLException {
 
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setDriverType(driverType);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setURL(url);
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setFastConnectionFailoverEnabled(true);
        return dataSource;
    }
}