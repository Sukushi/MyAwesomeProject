package fr.dawan.business.category;

import fr.dawan.business.generic.GenericServiceBDD;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceBDD extends GenericServiceBDD<Category, CategoryRepository, CategoryDto, CategoryMapper> implements CategoryService {
	
	public CategoryServiceBDD(CategoryRepository repository, CategoryMapper mapper) {
		super(repository, mapper);
	}
	
	
}
