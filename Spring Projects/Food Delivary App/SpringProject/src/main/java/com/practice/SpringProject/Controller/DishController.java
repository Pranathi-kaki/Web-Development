package com.practice.SpringProject.Controller;
import java.util.*;

import com.practice.SpringProject.Model.Dish;
import com.practice.SpringProject.Service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class DishController {
    @Autowired
    DishService dishService;

    //CRUD - Create, Read, Update, Delete.

    //Read
    @RequestMapping("/dish/status")
    //whenever we get request as status it returns
    public String status(){
        System.out.println(dishService.status());
        return "Dish Controller is Active..!!!";
    }
    @RequestMapping("/dish/{id}")
    public Dish getDish(@PathVariable int id){
        return dishService.getDish(id);
    }

    @RequestMapping("/dishes/{category}")
    public List<Dish> getDishByCategory(@PathVariable String category){
        return dishService.getDishesByCategory(category);
    }

    @RequestMapping("/dishes")
    public List<Dish> getAllDishes(){
        return dishService.getAllDishes();
    }

    //Create
    @PostMapping("/dish/add")                     //post mapping will add data to db
//    @RequestMapping("/dish/add")
    public void addDish(@RequestBody Dish dish)
    {
        System.out.println(dish.toString());
        dishService.addDish(dish);
    }

    //Update
    @PutMapping("/dish/update")                  //  put mapping is used to update
    public Dish UpdateDish(@RequestBody Dish dish)
    {
       return dishService.updateDish(dish);
    }

    //Delete
    @DeleteMapping("dish/delete")
    public void deleteDishById(@RequestBody Dish dish){
        dishService.deleteDishById(dish.getId());
    }

}
