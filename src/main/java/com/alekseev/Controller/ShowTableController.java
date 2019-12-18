package com.alekseev.Controller;

import com.alekseev.Service.ItemDaoService;
import com.alekseev.Service.PurchaseDaoServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/show")
public class ShowTableController {

    @Autowired
    private PurchaseDaoServise purchaseDaoServise;
    @Autowired
    private ItemDaoService itemDaoService;

    @GetMapping("/item")
    public String showItem(Model model){
        model.addAttribute("item",itemDaoService.findAll());
        return "showtable";
    }
    @GetMapping("/purchase")
    public String showPurchase(Model model){
        model.addAttribute("purchase",purchaseDaoServise.findAll());
        return "showtable";
    }
}
