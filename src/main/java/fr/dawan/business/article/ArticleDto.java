package fr.dawan.business.article;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto {
	
	private long id;
	private int version;
	private String title;
	private String categoryName;
	
}
