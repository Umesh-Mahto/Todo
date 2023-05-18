package com.geekster.TODO.service;

import com.geekster.TODO.model.TodoModel;
import com.geekster.TODO.repository.IRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    IRepo iRepo;

    public String addTodo(TodoModel todoModel) {
        iRepo.save(todoModel);
        return " todo Added Successfully";
    }

    public List<TodoModel> getAll() {
        return iRepo.findAll();
    }

    public String update(TodoModel todoModel) {
        iRepo.updateTodo(todoModel.getId(),todoModel.getTitle(), Boolean.valueOf(todoModel.getStatus()));
        return "Todo updated Successfully";
    }

    public String deleteTodo(Integer id) {
        iRepo.deleteById(id);
        return "deleted Successfully";
    }
}
