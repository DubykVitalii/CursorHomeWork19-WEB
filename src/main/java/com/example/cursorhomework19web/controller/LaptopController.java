package com.example.cursorhomework19web.controller;

import com.example.cursorhomework19web.model.Laptop;
import com.example.cursorhomework19web.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
public class LaptopController {
    private LaptopService laptopService;

    @Autowired
    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("laptops", laptopService.getAllLaptops());
        return "main";
    }

    @GetMapping("/create")
    public String createLaptop(Model model) {
        model.addAttribute("laptop", new Laptop());
        return "create";
    }

    ;

    @PostMapping("/create")
    public String createLaptop(Model model, @ModelAttribute("laptop") Laptop laptop) {
        laptop.setDateOfIssue(LocalDate.now());
        laptop.setUsed(false);
        laptopService.save(laptop);
        return "main";
    }

    ;

    @GetMapping("/getAllSortedNameManufactures")
    public String getAllSortedNameManufactures(Model model) {
        model.addAttribute("laptops", laptopService.getAllSortedNameManufactures());
        return "main";
    }

    ;

    @GetMapping("/getLaptopsByMemory")
    public String getLaptopsByMemory(Model model) {
        model.addAttribute("laptops", laptopService.getLaptopsByMemory());
        return "main";
    }

    ;

    @GetMapping("/getLaptopsUsed")
    public String getLaptopsUsed(Model model) {
        model.addAttribute("laptops", laptopService.getLaptopsUsed());
        return "main";
    }

    ;
}
