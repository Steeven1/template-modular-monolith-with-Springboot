package template_modular_monolith;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import template_modular_monolith.template_modular_monolith.customer.infra.CustomerConfig;

import javax.sql.DataSource;

@Configuration
@Import({CustomerConfig.class})
public class AppConfig {
    @Value("${spring.datasource.driver}")
    private String driver;

    @Value("${spring.datasource.db.url}")
    private String url;

    @Value("${spring.datasource.db.username}")
    private String username;

    @Value("${spring.datasource.db.password}")
    private String password;

    @Bean
    public DataSource dbdataSrc() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate dbJdbcTemplate(DataSource dbdataSrc) {
        return new JdbcTemplate(dbdataSrc);
    }


}
