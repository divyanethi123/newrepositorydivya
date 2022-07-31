package org.example;
import java.util.*;
public class Persistance {
    @Bean
    public LocalContainerEntityManagerFactoryBean emf(){

        properties.put("javax.persistence.jdbc.driver", value="org.postgresql.Driver");
        properties.put("javax.persistence.jdbc.url", value="jdbc:postgresql://localhost:5432/onlineshopping");
        properties.put("javax.persistence.jdbc.user", "postgres");

        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setPersistenceProviderClass(org.example.Student.class);
        emf.setPersistenceUnitName(SysConstants.SysConfigPU);
        emf.setJpaPropertyMap(properties);
        emf.setLoadTimeWeaver(new ReflectiveLoadTimeWeaver());
        return emf;
    }
}
