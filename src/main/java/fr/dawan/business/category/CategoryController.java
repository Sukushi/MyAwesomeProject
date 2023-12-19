package fr.dawan.business.category;

import fr.dawan.business.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
public class CategoryController extends GenericController<Category, CategoryService> {
	
	public CategoryController(CategoryService service) {
		super(service);
	}
	
}
