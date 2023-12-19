package fr.dawan.business.article;

import fr.dawan.business.generic.GenericService;

import java.util.List;

public interface ArticleService extends GenericService<Article> {
	
	List<Article> findByTitle(String title);
	
}
