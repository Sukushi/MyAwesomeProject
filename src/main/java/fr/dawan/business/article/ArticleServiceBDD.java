package fr.dawan.business.article;

import fr.dawan.business.generic.GenericServiceBDD;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

@Service
@Slf4j // crée un logger pour la classe
public class ArticleServiceBDD extends GenericServiceBDD<Article,ArticleRepository,ArticleDto,ArticleMapper> implements ArticleService {
	
	public ArticleServiceBDD(ArticleRepository repository, ArticleMapper mapper) {
		super(repository, mapper);
		hereALog();
	}
	
	@Override
	public Page<ArticleDto> findByTitle(String title, Pageable pageable) {
		return repository.findByTitleLike("%" + title + "%", pageable).map(mapper::toDto);
	}
	
	@Override
	public Page<ArticleDto> findByCategory_NameIgnoreCase(String name, Pageable pageable) {
		return repository.findByCategory_NameIgnoreCase(name,pageable).map(mapper::toDto);
	}
	
	public void hereALog() {
		log.info("I'm here !");
	}
	
}
