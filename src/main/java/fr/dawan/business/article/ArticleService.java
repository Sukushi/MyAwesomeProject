package fr.dawan.business.article;

import fr.dawan.business.generic.GenericService;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface ArticleService extends GenericService<Article> {
	
	List<Article> findByTitle(String title, Pageable pageable);
	
}
