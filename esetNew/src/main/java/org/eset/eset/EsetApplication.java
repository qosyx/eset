package org.eset.eset;

import java.util.Properties;
import javax.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EsetApplication {

    public static void main(String[] args) {
        Persistence.generateSchema("org.eset_eset_jar_0.0.1-SNAPSHOTPU", new Properties());
        SpringApplication.run(EsetApplication.class, args);
    }
}
