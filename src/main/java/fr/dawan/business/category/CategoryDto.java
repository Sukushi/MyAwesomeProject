package fr.dawan.business.category;

import fr.dawan.business.article.ArticleDto;

import java.util.List;

public class CategoryDto {
	
	private long id;
	private int version;
	private String name;
	private List<ArticleDto> articles;
	
}
