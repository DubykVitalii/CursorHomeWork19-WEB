package com.example.cursorhomework19web.service;

import com.example.cursorhomework19web.model.Laptop;
import com.example.cursorhomework19web.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    private LaptopRepo laptopRepo;

    @Autowired
    public LaptopService(LaptopRepo laptopRepo) {
        this.laptopRepo = laptopRepo;
    }

    public List<Laptop> getAllSortedNameManufactures() {
        return laptopRepo.findLaptopByOrderByManufacturerDesc();
    }

    public List<Laptop> getLaptopsByMemory() {
        return laptopRepo.findLaptopByMemoryGreaterThanEqual(16);
    }

    public List<Laptop> getLaptopsUsed() {
        return laptopRepo.findLaptopByUsedEquals(true);
    }

    public void save(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }
}
