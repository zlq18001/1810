package zlq.world;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("zlq.world.dao")
public class WorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorldApplication.class, args);
    }

}
