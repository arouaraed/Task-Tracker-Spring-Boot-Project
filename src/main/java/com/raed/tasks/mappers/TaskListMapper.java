package com.raed.tasks.mappers;

import com.raed.tasks.domain.dto.TaskListDto;
import com.raed.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto (TaskListDto taskListDto);
    TaskListDto toDto (TaskList taskList);
}
