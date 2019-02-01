package com.singular.TodoTask.TodoTask.service;

import com.singular.TodoTask.TodoTask.domain.Todo_task;
import com.singular.TodoTask.TodoTask.repository.Todo_TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class Todo_taskService {
    private final Todo_TaskRepository todo_taskRepository;

    public Todo_taskService(Todo_TaskRepository todo_taskRepository) {
        this.todo_taskRepository = todo_taskRepository;
    }

    public Todo_task save(Todo_task todo_task){
        return todo_taskRepository.saveAndFlush(todo_task);
    }

    @Transactional(readOnly = true)
    public List<Todo_task> findAll() {
        return todo_taskRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Todo_task> findById(Long id) {
        return todo_taskRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Todo_task> findByStatus(String status) {
        return todo_taskRepository.findByStatus(status);
    }

}
