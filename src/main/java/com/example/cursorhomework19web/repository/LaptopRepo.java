package com.example.cursorhomework19web.repository;

import com.example.cursorhomework19web.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LaptopRepo extends JpaRepository<Laptop, Long> {
    List<Laptop> findLaptopByOrderByManufacturerDesc();

    List<Laptop> findLaptopByMemoryGreaterThanEqual(int memory);

    List<Laptop> findLaptopByUsedEquals(boolean used);

}
