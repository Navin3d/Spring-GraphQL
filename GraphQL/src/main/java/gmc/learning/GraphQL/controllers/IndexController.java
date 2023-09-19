package gmc.learning.GraphQL.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import gmc.learning.GraphQL.models.ServerModel;

@RestController
public class IndexController {
	
	@Autowired
	private Map<String, ServerModel> servers;
	
	@QueryMapping
    public List<ServerModel> servers() {
		List<ServerModel> foundServers = new ArrayList<>();
		servers.forEach((id, server) -> {
			foundServers.add(server);
		});
        return foundServers;
    }

	@QueryMapping
    public ServerModel server(@Argument String uniqueid) {
		ServerModel foundServers = new ServerModel();
		for(var entry : servers.entrySet()) {
			if(entry.getValue().getHost().equals(uniqueid))
				foundServers = entry.getValue();
			if(entry.getValue().getName().equals(uniqueid))
				foundServers = entry.getValue();
			
		}
        return foundServers;
    }
    
}
