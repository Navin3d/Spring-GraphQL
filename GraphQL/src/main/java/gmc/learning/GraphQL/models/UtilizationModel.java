package gmc.learning.GraphQL.models;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class UtilizationModel implements Serializable {
	
	private static final long serialVersionUID = 1654740385365440991L;
	
	private String id;
	
	private Long ramUsed;
	
	private Long ramFree;
	
	private Long cpuUsed;
	
	private LocalDate capturedAt;
	
	public UtilizationModel(String id, Long ramUsed, Long ramFree, Long cpuUsed, LocalDate capturedAt) {
        this.id = id;
        this.ramUsed = ramUsed;
        this.ramFree = ramFree;
        this.cpuUsed = cpuUsed;
        this.capturedAt = capturedAt;
    }

}
