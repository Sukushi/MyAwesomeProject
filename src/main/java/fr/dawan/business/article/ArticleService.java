package fr.dawan.business.article;

import fr.dawan.business.generic.GenericService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ArticleService extends GenericService<ArticleDto> {
	
	Page<ArticleDto> findByTitle(String title, Pageable pageable);
	
	Page<ArticleDto> findByCategory_NameIgnoreCase(String name, Pageable pageable);
	
}
