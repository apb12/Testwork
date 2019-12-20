package com.alekseev.Controller;

import com.alekseev.Entity.Purchase;
import com.alekseev.Service.ItemDaoService;
import com.alekseev.Service.PurchaseDaoServiсe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

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
    public String deletePurch(@RequestParam("id")Purchase p){
        purchaseDaoServiсe.delete(p);
        return "redirect:/greeting";
    }
    @PostMapping("/save")
    public  String savePurch(@RequestParam ("id")Long id,
                             @RequestParam("item")String item,
                             @RequestParam("name")String name,
                             @RequestParam("lastName")String lastName,
                             @RequestParam("age")String age,
                             @RequestParam("count")String count,
                             @RequestParam("amount")String amount){
        Purchase p=purchaseDaoServiсe.findById(id);
        p.setPurchaseItem(itemDaoService.findByName(item));
        p.setName(name);
        p.setLastName(lastName);
        p.setAge(Integer.valueOf(age));
        p.setCount(Integer.valueOf(count));
        p.setAmount(new BigDecimal(Integer.valueOf(amount)));
        purchaseDaoServiсe.save(p);
        return "redirect:/greeting";
    }
}
