package sweeps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String [] args){
        Map.init();
        SpringApplication.run(Main.class, args);
    }

}