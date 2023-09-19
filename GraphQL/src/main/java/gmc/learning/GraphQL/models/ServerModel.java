package gmc.learning.GraphQL.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class ServerModel implements Serializable {
	
	private static final long serialVersionUID = -2681103939183886031L;
	
	private String id;
	
	private String name;
	
	private String host;
	
	private String password;
	
	private String port;
	
	private Set<UtilizationModel> utiliZations = new HashSet<>();
	
	public ServerModel() {}
	
	public ServerModel(String id, String name, String host, String port, String password) {
        this.id = id;
        this.name = name;
        this.host = host;
        this.port = port;
        this.password = password;
    }

}
