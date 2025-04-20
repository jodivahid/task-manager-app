package com.jodivahid.task_manager_backend.repository;

import com.jodivahid.task_manager_backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
