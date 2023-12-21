package fr.dawan.business.article;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest({ArticleController.class, ArticleService.class /*ou directement ArticleServiceBDD.class*/, ArticleRepository.class, ArticleMapper.class})
@ActiveProfiles("test")
class ArticleControllerTest {
	
	@Autowired
	private MockMvc mockMvc; // simuler une requête HTTP vers votre application
	@MockBean // crée un mock dans le contexte de Spring (pour un test d'intégration)
	private ArticleRepository repository;
	
	@Test
	void findByTitle() throws Exception {
		// arrange
		String title = "bogoss";
		Pageable pageable = PageRequest.of(0,20);
		
		Article article1 = new Article("article de bogoss", null);
		Article article2 = new Article("article de giga bogoss", null);
		// Article article3 = new Article("article pas ouf", null); // ne pas ajouter dans la List car il ne contient pas ce qu'on recherche (title)
		Page<Article> entities = new PageImpl<>(List.of(article1,article2), pageable, 2);
		
		Mockito.when(repository.findByTitleLike("%" + title + "%",pageable)).thenReturn(entities);
		
		// act
		mockMvc.perform( // lancer une requête
				MockMvcRequestBuilders.get("/articles/byTitle/" + title)
		
		).andDo(print()) // affiche ce qui se passe dans le test
		// assert
		.andExpect( // correspond à un "Assert"
				status().isOk()
		).andExpect( // vous pouvez enchainer de 'andExpect' que vous souhaitez pour vérifier différents éléments
				jsonPath("$") // correspond au body de la réponse HTTP
						.isNotEmpty()
			).andExpect(
					jsonPath("$.numberOfElements").value(2) // vérifie qu'on récupère deux éléments dans le '$.content'
			);
	}
}