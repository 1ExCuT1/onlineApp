package com.app.onlineApp.controllers.OnlineStoreApplication;

import com.app.onlineApp.models.Category;
import com.app.onlineApp.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
@GetMapping
    public List<Category> getAllCategories(){
     return categoryService.getAllCategories();
    }
}
