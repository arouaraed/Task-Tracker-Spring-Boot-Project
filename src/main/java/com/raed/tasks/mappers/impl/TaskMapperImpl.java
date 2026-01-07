package com.raed.tasks.mappers.impl;

import com.raed.tasks.domain.dto.TaskDto;
import com.raed.tasks.domain.entities.Task;
import com.raed.tasks.mappers.TaskMapper;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(
            taskDto.id(),taskDto.title(),taskDto.description(),
                taskDto.dueDate(),
                taskDto.status(),
                taskDto.priority(),
                null,
                null,
                null
        );
    }


    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
