package com.app.Todo.repositry;

import com.app.Todo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepositry extends JpaRepository<Task, Long> {



}
