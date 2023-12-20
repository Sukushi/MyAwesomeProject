package fr.dawan.business.category;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class) // permet l'utilisation de Mocks
class CategoryServiceBDDTest {
	
	private CategoryServiceBDD service;
	
	@Mock // on crée une simulation de l'objet à utiliser
	private CategoryRepository repository;
	@Mock
	private CategoryMapper mapper;
	
	@BeforeEach // s'exécute AVANT chaque test
	void setup() {
		service = new CategoryServiceBDD(repository,mapper);
	}
	
	@Test
	void findAllTest() {
		// Arrange (initialise)
		// Act (test)
		// Assert (vérifier les résultats)
		
		// arrange
		Pageable pageable = Pageable.unpaged();
		
		Category category1 = new Category("Actus", new ArrayList<>());
		Category category2 = new Category("Jeux", new ArrayList<>());
		Page<Category> entities = new PageImpl<>(List.of(category1, category2));
		
		CategoryDto categoryDto1 = new CategoryDto(0L, 0, category1.getName(), null, 0);
		CategoryDto categoryDto2 = new CategoryDto(0L, 0, category1.getName(), null, 0);
		List<CategoryDto> expected = List.of(categoryDto1, categoryDto2);
		
		Mockito.when(repository.findAll(pageable)).thenReturn(entities);
		Mockito.when(mapper.toDto(category1)).thenReturn(categoryDto1);
		Mockito.when(mapper.toDto(category2)).thenReturn(categoryDto2);
		
		// act
		Page<CategoryDto> result = service.findAll(pageable);
		
		// assert
		// Vérifie que les résultats dans la page (content) sont bien ceux attendus
		assertTrue(result.getContent().containsAll(expected));
	}
	
}