package study.msa.msadesigntaskeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 유레카 서버의 역할을 수행한다.
public class MsaDesignTaskEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaDesignTaskEurekaApplication.class, args);
    }

}
