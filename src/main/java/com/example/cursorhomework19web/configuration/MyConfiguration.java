package com.example.cursorhomework19web.configuration;

import com.example.cursorhomework19web.model.Laptop;
import com.example.cursorhomework19web.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class MyConfiguration {
    private LaptopService laptopService;

    @Autowired
    public MyConfiguration(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @Bean
    public void addLaptopDatabase() {
        laptopService.save(new Laptop("Asus", "China", "AMD Ryzen 5", 32, false, 1000, LocalDate.of(2020, 1, 11)));
        laptopService.save(new Laptop("Lenovo", "USA", "Intel Core i7", 64, false, 800, LocalDate.of(2019, 2, 21)));
        laptopService.save(new Laptop("Acer", "China", "Intel Core i5", 16, false, 850, LocalDate.of(2018, 1, 17)));
        laptopService.save(new Laptop("DELL", "USA", "AMD Ryzen 9", 8, false, 950, LocalDate.of(2020, 3, 11)));
        laptopService.save(new Laptop("HP", "USA", "Intel Core i7", 8, false, 850, LocalDate.of(2018, 1, 12)));
        laptopService.save(new Laptop("MacBook", "USA", "Intel Core i7", 8, false, 1000, LocalDate.of(2020, 5, 8)));
        laptopService.save(new Laptop("Asus", "China", "AMD Ryzen 7", 32, true, 700, LocalDate.of(2020, 1, 1)));
        laptopService.save(new Laptop("Asus", "China", "AMD Ryzen 9", 32, false, 1000, LocalDate.of(2019, 4, 6)));
        laptopService.save(new Laptop("Acer", "China", "Intel Core i3", 8, true, 700, LocalDate.of(2018, 8, 1)));
        laptopService.save(new Laptop("MacBook", "USA", "Intel Core i3", 8, true, 700, LocalDate.of(2020, 1, 12)));
        laptopService.save(new Laptop("Lenovo", "USA", "Intel Core i9", 8, false, 1000, LocalDate.of(2019, 3, 1)));
        laptopService.save(new Laptop("Acer", "China", "Intel Core i9", 16, false, 1000, LocalDate.of(2020, 1, 21)));
        laptopService.save(new Laptop("DELL", "USA", "AMD Ryzen 7", 4, true, 700, LocalDate.of(2020, 1, 3)));
        laptopService.save(new Laptop("Lenovo", "USA", "Intel Core i5", 32, true, 700, LocalDate.of(2018, 1, 1)));
        laptopService.save(new Laptop("HP", "USA", "Intel Core i9", 32, false, 1000, LocalDate.of(2020, 2, 1)));
        laptopService.save(new Laptop("Acer", "China", "Intel Core i7", 8, true, 700, LocalDate.of(2018, 1, 15)));
        laptopService.save(new Laptop("DELL", "USA", "AMD Ryzen 3", 32, true, 700, LocalDate.of(2019, 4, 16)));
        laptopService.save(new Laptop("DELL", "USA", "AMD Ryzen 5", 16, false, 950, LocalDate.of(2020, 1, 6)));
        laptopService.save(new Laptop("Lenovo", "USA", "Intel Core i3", 32, true, 1700, LocalDate.of(2019, 2, 4)));
        laptopService.save(new Laptop("MacBook", "USA", "Intel Core i5", 8, true, 700, LocalDate.of(2018, 1, 14)));
    }
}
