package api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.domain.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, String> {

	List<Language> findAll();
}