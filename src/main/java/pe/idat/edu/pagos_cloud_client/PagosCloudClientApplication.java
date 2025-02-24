package pe.idat.edu.pagos_cloud_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PagosCloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagosCloudClientApplication.class, args);
	}

}
