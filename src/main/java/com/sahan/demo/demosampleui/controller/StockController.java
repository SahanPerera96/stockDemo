package com.sahan.demo.demosampleui.controller;

import com.sahan.demo.demosampleui.modal.OpenStock;
import com.sahan.demo.demosampleui.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/demo")
public class StockController {

    @Autowired
    StockService stockService;

    @RequestMapping(value = "/openStock", method = RequestMethod.POST)
    public OpenStock saveOpenStock(@RequestBody OpenStock openStock) {

        return stockService.saveOpenStock(openStock);
    }

    @RequestMapping(value = "/openStock", method = RequestMethod.GET)
    public List<OpenStock> fetchAllOpenStock() {

        return stockService.fetchAllOpenStock();
    }
}
