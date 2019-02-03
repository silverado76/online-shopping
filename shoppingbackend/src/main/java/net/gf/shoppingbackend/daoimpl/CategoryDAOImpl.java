package net.gf.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.gf.shoppingbackend.dao.CategoryDAO;
import net.gf.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static{
		Category c0=new Category();
		c0.setId(1);
		c0.setName("Television");
		c0.setDescription("Television");
		c0.setImageUrl("CAT_1.png");
		
		categories.add(c0);

		Category c1=new Category();
		
		c1.setId(2);
		c1.setName("Mobile");
		c1.setDescription("Mobile");
		c1.setImageUrl("CAT_2.png");
		
		categories.add(c1);
		
		Category c2=new Category();
		c2.setId(3);
		c2.setName("Laptop");
		c2.setDescription("Laptop");
		c2.setImageUrl("CAT_3.png");
		
		categories.add(c2);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	
	public static void main(String[] argv){
		CategoryDAOImpl cdi = new CategoryDAOImpl();
		
		List<Category> cc = cdi.list();
		
		for(Category cat:cc){
			System.out.println(cat.getName());
		}
	}

	@Override
	public Category get(int id) {
		
		for(Category cat:categories){
			if (cat.getId()==id){
				return cat;
			}
		}

		return null;
	}
	

}
