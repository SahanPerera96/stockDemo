package com.sahan.demo.demosampleui.repository;

import com.sahan.demo.demosampleui.modal.OpenStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<OpenStock, Integer> {
}
