package fr.dawan.business.category;

import fr.dawan.business.generic.GenericServiceBDD;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceBDD extends GenericServiceBDD<Category, CategoryRepository> implements CategoryService {
	
	public CategoryServiceBDD(CategoryRepository repository) {
		super(repository);
	}
	
}
