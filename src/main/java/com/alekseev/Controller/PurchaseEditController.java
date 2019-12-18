package com.alekseev.Controller;

import com.alekseev.Entity.Purchase;
import com.alekseev.Service.ItemDaoService;
import com.alekseev.Service.PurchaseDaoServiсe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/crud")
public class PurchaseEditController {
    @Autowired
    private PurchaseDaoServiсe purchaseDaoServiсe;
    @Autowired
    private ItemDaoService itemDaoService;

    @GetMapping("/{id}")
    public String editPurch(@PathVariable("id")Purchase p, Model model){
        model.addAttribute("purchase",p);
        model.addAttribute("item",itemDaoService.findAll());
        return "purchaseedit";
    }
    @PostMapping("/delete")
    public String deletePurch(@PathVariable("id")Purchase p){
        purchaseDaoServiсe.delete(p);
        return "redirect:/show";
    }
    @PostMapping("/save")
    public  @ResponseBody String savePurch(Purchase p){
        purchaseDaoServiсe.save(p);
        return "redirect:/show";
    }
}
