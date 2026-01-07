package com.raed.tasks.sevices;

import com.raed.tasks.domain.entities.TaskList;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskListService {
    List<TaskList> ListTaskLists();
    TaskList createTaskList(TaskList taskList);
    Optional<TaskList> getTaskListById(UUID id);
    TaskList updateTaskList(UUID taskListId, TaskList taskList);
    void deleteTaskList(UUID taskListId);



}
