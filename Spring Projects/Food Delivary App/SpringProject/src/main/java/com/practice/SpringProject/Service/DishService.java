package com.practice.SpringProject.Service;
import java.util.*;

import com.practice.SpringProject.Model.Dish;
import com.practice.SpringProject.Repository.DishRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishService {

    @Autowired
    DishRepo dishRepo;
    public String status(){
        return "Dish Service is Active..!!!";
    }

    public Dish getDish(int id)
    {
        Dish dish = dishRepo.findById(id).orElse(null);
        return dish;
    }

    public List<Dish> getAllDishes(){

        List<Dish> dishes = dishRepo.findAll();
        return dishes;
    }
    public Dish addDish(Dish dish)
    {
        return dishRepo.save(dish);
    }

    public List<Dish> getDishesByCategory(String category){
//        List<Dish> list= getAllDishes();
//        List<Dish> dishes = new ArrayList<>();
//        category = category.toLowerCase();
//        for(Dish d :list){
//            if(d.getCategory().toLowerCase().equals(category)){
//                dishes.add(d);
//            }
//        }
        return dishRepo.getDishesByCategory(category);
    }

    public Dish updateDish(Dish dish){
        //updation login is given in repository
//        Dish dish = getDish(4);
//        dish.setName("Chocolate cake");
        return dishRepo.save(dish); //this helps data to get update in the database
    }
    public void deleteDishById(int id){
        dishRepo.deleteById(id);
    }
}
