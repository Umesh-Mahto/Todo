package com.geekster.TODO.repository;

import com.geekster.TODO.model.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepo extends JpaRepository<TodoModel,Integer> {


    @Modifying
    @Query(value ="update set title=:title,status=:status where id=:id" ,nativeQuery = true)
    void updateTodo(Integer id, String title, Boolean status);
}
