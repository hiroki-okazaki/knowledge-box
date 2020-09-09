package api.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;

import api.dto.ResponseContainer;
import lombok.Data;

public class ResponseUtil {

	
	public static <T> ResponseEntity<ResponseContainer> successFormat(HttpStatus status, @Nullable T body){
		final ResponseContainer responseContainer = new ResponseContainer();
		return ResponseEntity(status, body);
	}
}
