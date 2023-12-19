package fr.dawan.business.category;

import fr.dawan.business.article.Article;
import fr.dawan.business.generic.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Category extends BaseEntity {
	
	private String name;
	@OneToMany(mappedBy = "category")
	private List<Article> articles;
	
}
