package com.singular.TodoTask.TodoTask.repository;

import com.singular.TodoTask.TodoTask.domain.Todo_task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Todo_TaskRepository extends JpaRepository<Todo_task, Long> {
    List<Todo_task> findByStatus(String status);
}
