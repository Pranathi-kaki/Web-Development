package com.practice.SpringProject.Repository;

import com.practice.SpringProject.Model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface DishRepo extends JpaRepository<Dish,Integer> {

    @Query("SELECT p FROM Dish p WHERE LOWER(p.category) = LOWER(:category)")
    public List<Dish> getDishesByCategory(@Param("category") String category);
}
