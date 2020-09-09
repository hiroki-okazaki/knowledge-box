package api.dto;

import lombok.Data;

@Data
public class ResponseContainer {

    //private Status status; 
	private Data data;
	private Error error;
}
