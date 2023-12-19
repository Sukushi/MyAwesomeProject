package fr.dawan.business.article;

import fr.dawan.business.generic.GenericServiceBDD;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceBDD extends GenericServiceBDD<Article,ArticleRepository> implements ArticleService {
	
	public ArticleServiceBDD(ArticleRepository repository) {
		super(repository);
	}
	
	@Override
	public List<Article> findByTitle(String title) {
		return repository.findByTitleLike("%" + title + "%");
	}
}
