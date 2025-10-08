package com.ecom.ecommerce.config;

import com.ecom.ecommerce.utility.AESGCMUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Configuration for DB layer encryption/decryption
 */
@Configuration
public class DataSourceConfig {

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.driver-class-name}")
    private String driver;

//    @Value("${db.username.encrypted}")
//    private String encryptedUsername;
//
//    @Value("${db.password.encrypted}")
//    private String encryptedPassword;

    @Autowired
    AESGCMUtil aesgcmUtil;

    @Bean
    public DataSource dataSource() throws Exception {
        String encryptedUsername = readSecretFromFile(System.getenv("SPRING_DATASOURCE_USERNAME_FILE"));
        String encryptedPassword = readSecretFromFile(System.getenv("SPRING_DATASOURCE_PASSWORD_FILE"));
        String username = AESGCMUtil.decrypt(encryptedUsername);
        String password = AESGCMUtil.decrypt(encryptedPassword);

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(dbUrl);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }

    private String readSecretFromFile(String path) throws Exception {
        if (path == null || path.isBlank()) {
            throw new IllegalStateException("Secret file path not provided.");
        }
        return Files.readString(Path.of(path)).trim();
    }
}

