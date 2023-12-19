package fr.dawan.business.article;

import fr.dawan.business.generic.GenericServiceBDD;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceBDD extends GenericServiceBDD<Article,ArticleRepository> implements ArticleService {
	
	public ArticleServiceBDD(ArticleRepository repository) {
		super(repository);
	}
	
}
