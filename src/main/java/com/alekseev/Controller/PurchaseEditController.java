package com.alekseev.Controller;

import com.alekseev.Entity.Purchase;
import com.alekseev.Service.ItemDaoService;
import com.alekseev.Service.PurchaseDaoServiсe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Controller for editig Purchase and present crud operation
 */
@Controller
@RequestMapping("/crud")
public class PurchaseEditController {
    @Autowired
    private PurchaseDaoServiсe purchaseDaoServiсe;
    @Autowired
    private ItemDaoService itemDaoService;

    /**
     * Method that get Purchase and show it in template and find all items from item table and show it too
     * @param p Purchase find by id
     * @param model mvc model
     * @return
     */
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

    /**
     * Method find Purchase by id and updating all these params and save ii in data base
     * @param id Purhase id
     * @param item Item name
     * @param name Purchase name
     * @param lastName Purchase last name
     * @param age Purchase age
     * @param count Purchase count
     * @param amount Purchase amount
     * @return
     */
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
