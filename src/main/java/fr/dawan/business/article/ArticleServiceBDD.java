package fr.dawan.business.article;

import fr.dawan.business.generic.GenericServiceBDD;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class ArticleServiceBDD extends GenericServiceBDD<Article,ArticleRepository> implements ArticleService {
	
	public ArticleServiceBDD(ArticleRepository repository) {
		super(repository);
	}
	
	@Override
	public Page<Article> findByTitle(String title, Pageable pageable) {
		return repository.findByTitleLike("%" + title + "%", pageable);
	}
}
