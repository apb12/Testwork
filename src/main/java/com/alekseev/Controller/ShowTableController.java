package com.alekseev.Controller;

import com.alekseev.Service.ItemDaoService;
import com.alekseev.Service.PurchaseDaoServiсe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for find and show all purchase and items
 */
@Controller
@RequestMapping("/show")
public class ShowTableController {

    @Autowired
    private PurchaseDaoServiсe purchaseDaoServise;
    @Autowired
    private ItemDaoService itemDaoService;

    /**
     * Method find and show all items from table item
     * @param model
     * @return
     */
    @GetMapping("/item")
    public String showItem(Model model){
        model.addAttribute("item",itemDaoService.findAll());
        return "showtable";
    }

    /**
     * Method find and show all purchases from table purchase
     * @param model
     * @return
     */
    @GetMapping("/purchase")
    public String showPurchase(Model model){
        model.addAttribute("purchase",purchaseDaoServise.findAll());
        return "showtable";
    }
}
