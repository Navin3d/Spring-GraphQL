package gmc.learning.GraphQL;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import gmc.learning.GraphQL.models.ServerModel;
import gmc.learning.GraphQL.models.UtilizationModel;

@Component
@Configuration
public class BootstrapComponent {
	
	@Bean
	Map<String, ServerModel> servers() {
		Map<String, ServerModel> servers = new HashMap<>();
		
		ServerModel server = new ServerModel("1", "Server1", "localhost", "8080", "password");
		
		UtilizationModel utilization1 = new UtilizationModel("1", 2048L, 4096L, 50L, LocalDate.of(2023, 9, 19));
        UtilizationModel utilization2 = new UtilizationModel("2", 3072L, 3072L, 75L, LocalDate.of(2023, 9, 19));
        UtilizationModel utilization3 = new UtilizationModel("3", 1024L, 8192L, 40L, LocalDate.of(2023, 9, 19));
        UtilizationModel utilization4 = new UtilizationModel("4", 4096L, 2048L, 60L, LocalDate.of(2023, 9, 19));
        UtilizationModel utilization5 = new UtilizationModel("5", 2560L, 3584L, 80L, LocalDate.of(2023, 9, 19));
		
        server.getUtiliZations().add(utilization1);
        server.getUtiliZations().add(utilization2);
        server.getUtiliZations().add(utilization3);
        server.getUtiliZations().add(utilization4);
        server.getUtiliZations().add(utilization5);
        
        servers.put(server.getId(), server);
        
		return servers;
	}

}
