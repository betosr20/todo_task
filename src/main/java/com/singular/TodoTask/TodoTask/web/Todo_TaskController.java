package com.singular.TodoTask.TodoTask.web;

import com.singular.TodoTask.TodoTask.domain.Todo_task;
import com.singular.TodoTask.TodoTask.service.Todo_taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Todo_TaskController {
    private final Todo_taskService todo_taskService;

    public Todo_TaskController(Todo_taskService todo_taskService) {
        this.todo_taskService = todo_taskService;
    }

    @PostMapping()
    public Todo_task save(@RequestBody Todo_task todo_task){
        return todo_taskService.save(todo_task);
    }

    @PutMapping()
    public Todo_task update(@RequestBody Todo_task todo_task){
        return todo_taskService.save(todo_task);
    }

    @GetMapping()
    public List<Todo_task> getString() {
        return  todo_taskService.findAll();
    }

    @GetMapping("/find-by-id/{id}")
    public Optional<Todo_task> getById(@PathVariable Long id) {
        return  todo_taskService.findById(id);
    }

    @GetMapping("/find-by-status/{status}")
    public List<Todo_task> getByStatus(@PathVariable String status) {
        return  todo_taskService.findByStatus(status);
    }

}
