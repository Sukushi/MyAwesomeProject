package fr.dawan.business.article;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article,Long> {
	
	List<Article> findByTitleLike(String title);
	
}
