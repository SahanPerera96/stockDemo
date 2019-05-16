package com.sahan.demo.demosampleui.service;

import com.sahan.demo.demosampleui.modal.OpenStock;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StockService {

    OpenStock saveOpenStock(OpenStock openStock);
    List<OpenStock> fetchAllOpenStock();
}
