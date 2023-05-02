package kz.springboot.springbootdemo.controllers;

import kz.springboot.springbootdemo.db.DBManager;
import kz.springboot.springbootdemo.db.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value="/")
    public String index(Model model){
        ArrayList<Items> items = DBManager.getItems();
        model.addAttribute("items",items);
        return "index";
    }

//    @RequestMapping(method= RequestMethod.POST)
//    @PostMapping(value = "/addItem")
//    public String addItem(@RequestParam(name="item_name", defaultValue = "No item") String name,
//                          @RequestParam(name="item_price",defaultValue = "0") int price){
//        DBManager.addItem(new Items(null,name,price));
//        return "redirect:/";
//    }

//    @GetMapping(value="/details/{idshka}")
//    public String details(Model model, @PathVariable(name="idshka") Long id){
//        Items item = DBManager.getItem(id);
//        model.addAttribute("item",item);
//        return "details";
//    }

}
