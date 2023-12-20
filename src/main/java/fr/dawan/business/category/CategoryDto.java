package fr.dawan.business.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
	
	private long id;
	private int version;
	private String name;
	private List<CategoryDto> articles;
	private long articleCount;
	
}
