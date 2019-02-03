package net.gf.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.gf.shoppingbackend.dao.CategoryDAO;
import net.gf.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value={"/", "/home", "/index"})
	public ModelAndView index(){
		
		ModelAndView mv  = new ModelAndView("page");
		mv.addObject("title","Home");
		
		//add Categories
		mv.addObject("categories",categoryDAO.list());
		List<Category> cc= categoryDAO.list();
		mv.addObject("userClickHome",true);
		return mv;
		
	}

	@RequestMapping(value="/about")
	public ModelAndView about(){
		ModelAndView mv  = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact(){
		ModelAndView mv  = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	
	//Show All Products
	@RequestMapping(value={"/show/all/products"})
	public ModelAndView showAllProducts(){
		
		ModelAndView mv  = new ModelAndView("page");
		mv.addObject("title","All Products");
		
		//add Categories
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		return mv;
		
	}
	
	//Show Category Products
	@RequestMapping(value={"/show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id){
		
		Category category= null;
		category= categoryDAO.get(id);
		
		ModelAndView mv  = new ModelAndView("page");
		mv.addObject("title",category.getName());
		
		//add Categories
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("category",category);
		mv.addObject("userClickCategoryProducts",true);
		return mv;
		
	}
	
}
