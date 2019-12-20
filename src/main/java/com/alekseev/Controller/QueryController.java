package com.alekseev.Controller;

import com.alekseev.Entity.Purchase;

import com.alekseev.Service.ItemDaoService;
import com.alekseev.Service.PurchaseDaoServiсe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/analytics")
public class QueryController {
    @Autowired
    private PurchaseDaoServiсe purchaseDaoService;
    @Autowired
    private ItemDaoService itemDaoService;

    @GetMapping
    public String anl() {
        return "/analytics";
    }

    @GetMapping("/allweek")
    public String showWeeklyPurchase(Model model) {
        List<Purchase> list = purchaseDaoService.purchaseListBetweenDates(Timestamp.valueOf(LocalDateTime.now().minusDays(7)),Timestamp.valueOf(LocalDateTime.now()) );
        model.addAttribute("purchaselist", list);
        return "/analytics";
    }

    @GetMapping("/purch")
    public String showBestByer(Model model) {
        List<String> list= purchaseDaoService.bestBuyer(Timestamp.valueOf(LocalDateTime.now().minusMonths(6)),Timestamp.valueOf(LocalDateTime.now()));
        model.addAttribute("purch",list.get(0));
        return "/analytics";
    }
    @GetMapping("/bestitem")
    public String showBestItem(Model model) {
        List<String> list= purchaseDaoService.bestItemfromMounth(Timestamp.valueOf(LocalDateTime.now().minusMonths(1)),Timestamp.valueOf(LocalDateTime.now()));
        String itemName=itemDaoService.findById(Long.valueOf(list.get(0))).getName();
        model.addAttribute("item",itemName);
        return "/analytics";
    }
    @GetMapping("/best18")
    public String show18years(Model model){
        List<String>list= purchaseDaoService.bestItem18year(18);
        String itemName=itemDaoService.findById(Long.valueOf(list.get(0))).getName();
        model.addAttribute("item18",itemName);
        return "/analytics";
    }
}
