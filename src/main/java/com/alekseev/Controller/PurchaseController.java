package com.alekseev.Controller;

import com.alekseev.Entity.Item;
import com.alekseev.Entity.Purchase;
import com.alekseev.Service.PurchaseDaoServiсe;
import com.alekseev.Service.PurchaseValidationExeption;
import com.alekseev.Service.ValidationService;
import com.alekseev.Service.XmlToObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Restcontroller that generate test xml docs and getting and validate them and save to database
 */
@RestController
public class PurchaseController {
    @Autowired
    private PurchaseDaoServiсe purchaseDaoServise;

    /**
     * Method for save valid xml doc to database
     */
    @PostMapping("/save")
    public boolean savePurchase(
            @RequestBody String xml
    ) throws IOException {

        if (!ValidationService.validXml(xml, "shema.xsd")) {
            throw new PurchaseValidationExeption();
        }
        purchaseDaoServise.save(XmlToObjectService.convert(xml));
        return true;

    }

    /**
     * Метод ,генерирующий xml для тестов,будет удален в продакшене
     */
    @RequestMapping("/purchase")
    public Purchase getPurhase() {
        Purchase p = new Purchase();
        p.setCount(10);
        p.setName("stas");
        p.setLastName("fidulin");
        p.setAge(40);
        p.setAmount(new BigDecimal(3));
        p.setPurchaseDate(new Timestamp(System.currentTimeMillis()));
        p.setPurchaseItem(new Item(2L));
        return p;
    }
}
