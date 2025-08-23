package com.app.onlineApp.controllers.ToDoApplication;


import org.springframework.ui.Model;
import com.app.onlineApp.models.Task;
import com.app.onlineApp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/todoapp")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
@GetMapping()
    public String getTasks(final Model model){

        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";

    }
    @PostMapping()
    public  String createTask(@RequestParam String title){

      taskService.createTask(title);
        return "redirect:/todoapp";

    }
    @GetMapping("/{id}/delete")
    public String deleteTasks(@PathVariable Long id){
        taskService.deleteTask(id);
        return "redirect:/todoapp";
    }
    @GetMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable Long id){
        taskService.toggleTask(id);
        return "redirect:/todoapp";
    }
}
