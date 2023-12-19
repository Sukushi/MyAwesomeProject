package fr.dawan.business.article;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article,Long> {
	
	Page<Article> findByTitleLike(String title, Pageable pageable);
	
}
