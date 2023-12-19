package fr.dawan.business.article;

import fr.dawan.business.generic.GenericController;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("articles")
public class ArticleController extends GenericController<Article, ArticleService> {
	
	public ArticleController(ArticleService service) {
		super(service);
	}
	
	@GetMapping("byTitle/{title}")
	/* en POST
	création
	{
		"id":0,
		"title":"bogoss de fou",
	}
	
	modification
	{
		"id":1,
		"category":{
			"id":1
		}
	}
	*/
	// http://localhost:8080/articles/byTitle/bogoss
	// http://localhost:8080/articles/byTitle/bogoss?page=0&size=10&sort=id,desc
	Page<Article> findByTitle(@PathVariable String title, Pageable pageable) {
		return service.findByTitle(title, pageable);
	}
	
	@GetMapping("byCategory/{name}")
	// http://localhost:8080/articles/byCategory/news
	public Page<Article> findByCategory_NameIgnoreCase(@PathVariable String name, Pageable pageable) {
		return service.findByCategory_NameIgnoreCase(name,pageable);
	}
	
}
