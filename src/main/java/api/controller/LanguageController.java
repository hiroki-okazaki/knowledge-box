package api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.domain.Language;
import api.service.LanguageService;

@RestController
@RequestMapping("/language")
public class LanguageController {

	@Autowired
	private LanguageService languageService;

//	  @ApiOperation(value = "ASPの登録", notes = "ASPを登録します。")
//	  @ApiResponses(value = {
//	      @ApiResponse(code = 201, message = "ASPの登録が完了", response = AspContainer.class),
//	      @ApiResponse(code = 400, message = "ASPの登録に失敗", response = ResponseContainer.class)
//	  })
	@GetMapping()
	public ResponseEntity<Object> getAll() {

		List<Language> resultList = languageService.getAll();

		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("MyResponseHeader", "MyValue");
		return new ResponseEntity<>(resultList, responseHeaders, HttpStatus.CREATED);
	}
}