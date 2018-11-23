package ru.artbmstu.geekmarket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("cart")
public class CartController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addToCart(@RequestParam(value = "id") String productId) {
        //добавление товара в корзину
        return "index";
    }
}