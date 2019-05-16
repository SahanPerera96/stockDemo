package com.sahan.demo.demosampleui.service;

import com.sahan.demo.demosampleui.modal.OpenStock;
import com.sahan.demo.demosampleui.modal.OpenStockDetails;
import com.sahan.demo.demosampleui.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl  implements StockService{

    @Autowired
    StockRepository stockRepository;

    @Override
    public OpenStock saveOpenStock(OpenStock openStock) {

        for(OpenStockDetails openStockDetails:openStock.getOpenStockDetails()) {
            openStockDetails.setOpenStock(openStock);
        }
        return stockRepository.save(openStock);
    }

    @Override
    public List<OpenStock> fetchAllOpenStock() {
        return stockRepository.findAll();
    }
}
