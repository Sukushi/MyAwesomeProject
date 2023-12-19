package fr.dawan.business.article;

import fr.dawan.business.generic.GenericController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RestController
@RequestMapping("articles")
public class ArticleController extends GenericController<Article, ArticleService> {
	
	public ArticleController(ArticleService service) {
		super(service);
	}
	
	@GetMapping("byTitle/{title}")
	//http://localhost:8080/articles/byTitle/bogoss?page=0?size=10
	List<Article> findByTitle(@PathVariable String title, Pageable pageable) {
		return service.findByTitle(title, pageable);
	}
	
}
