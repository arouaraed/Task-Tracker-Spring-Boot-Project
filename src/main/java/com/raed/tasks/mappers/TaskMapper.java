package com.raed.tasks.mappers;

import com.raed.tasks.domain.dto.TaskDto;
import com.raed.tasks.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}
