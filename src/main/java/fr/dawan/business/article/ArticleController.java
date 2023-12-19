package fr.dawan.business.article;

import fr.dawan.business.generic.GenericController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("articles")
public class ArticleController extends GenericController<Article, ArticleService> {
	
	public ArticleController(ArticleService service) {
		super(service);
	}
	
	@GetMapping("byTitle/{title}")
	List<Article> findByTitle(@PathVariable String title) {
		return service.findByTitle(title);
	}
	
}
