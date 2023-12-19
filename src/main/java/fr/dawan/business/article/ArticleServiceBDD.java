package fr.dawan.business.article;

import fr.dawan.business.generic.GenericServiceBDD;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

@Service
public class ArticleServiceBDD extends GenericServiceBDD<Article,ArticleRepository,ArticleDto,ArticleMapper> implements ArticleService {
	
	public ArticleServiceBDD(ArticleRepository repository, ArticleMapper mapper) {
		super(repository, mapper);
	}
	
	@Override
	public Page<Article> findByTitle(String title, Pageable pageable) {
		return repository.findByTitleLike("%" + title + "%", pageable);
	}
	
	@Override
	public Page<Article> findByCategory_NameIgnoreCase(String name, Pageable pageable) {
		return repository.findByCategory_NameIgnoreCase(name,pageable);
	}
	
}
