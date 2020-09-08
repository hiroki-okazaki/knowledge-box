package api.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="language")
public class Language {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer LanguageId;
	
	private String name;
	
	private String note;

}