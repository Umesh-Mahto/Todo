package com.geekster.TODO.controller;

import com.geekster.TODO.model.TodoModel;
import com.geekster.TODO.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    TodoService todoService;
    @PostMapping("/addTodo")
    public String addTodo(@RequestBody TodoModel todoModel){
        return todoService.addTodo(todoModel);
    }
    @GetMapping("/getAll")
    public List<TodoModel> getAll(){
        return todoService.getAll();
  }
  @PutMapping("/update")
    public String update(@RequestBody TodoModel todoModel){
      return todoService.update(todoModel);
  }
  @DeleteMapping("/{delete}")
    public String deleteTodo(@PathVariable Integer id){
        return todoService.deleteTodo(id);
  }
}
