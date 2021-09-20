package zura.pustota.valuteparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import zura.pustota.valuteparser.service.Converter;

@SpringBootApplication
@EnableCaching
public class ValuteparserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValuteparserApplication.class, args);

    }

}
