package ru.artbmstu.geekmarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.artbmstu.geekmarket.entities.Product;
import ru.artbmstu.geekmarket.services.ProductService;

import java.util.List;

@Controller
public class MainController {

    private ProductService productService;

    @Autowired
    public MainController(ProductService productService){
        this.productService = productService;
    }

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("favicon.ico")
    String favicon() {
        return "forward:/resources/favicon.ico";
    }

    @RequestMapping("/catalog")
    public String catalog(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "catalog";
    }
}