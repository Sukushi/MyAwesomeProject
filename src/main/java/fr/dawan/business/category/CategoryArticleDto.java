package fr.dawan.business.category;


import fr.dawan.business.article.ArticleCategoryDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryArticleDto {
	
	private long id;
	private int version;
	private String title;
	
}
