package net.gf.shoppingbackend.dao;

import java.util.List;

import net.gf.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();

	Category get(int id);
	
}
