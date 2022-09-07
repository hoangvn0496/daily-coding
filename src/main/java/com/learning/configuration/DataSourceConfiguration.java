package com.learning.configuration;

//package com.faber.training.flightmanagement.configuration;
//
////<editor-fold defaultstate="collapsed" desc="IMPORT">
//import com.zaxxer.hikari.HikariDataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
////</editor-fold>
//
///**
// * @author VuNgocHoang
// */
//@Configuration
//public class DataSourceConfiguration {
//
//    @Value("${spring.datasource.url}")
//    private String jdbcURl;
//    @Value("${spring.datasource.username}")
//    private String dbUsername;
//    @Value("${spring.datasource.password}")
//    private String dbPassword;
//    @Value("${spring.datasource.driverClassName}")
//    private String dataSourceClassName;
//
//    private HikariDataSource dataSource;
//
//    @Bean
//    public HikariDataSource dataSource() {
//        dataSource = new HikariDataSource();
//        dataSource.setJdbcUrl(jdbcURl);
//        dataSource.setDataSourceClassName(dataSourceClassName);
//        dataSource.setUsername(dbUsername);
//        dataSource.setPassword(dbPassword);
//        dataSource.addDataSourceProperty("cachePrepStmts", "true");
//        dataSource.addDataSourceProperty("prepStmtCacheSize", "250");
//        dataSource.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
////        dataSource.setMaximumPoolSize(50);
//        return dataSource;
//    }
//
//    public Connection getConnection() throws SQLException {
//        return dataSource.getConnection();
//    }
//
//}
