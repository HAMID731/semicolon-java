package com.spring_boot.project_spring_boot.controllers;

import com.spring_boot.project_spring_boot.data.models.Story;
import com.spring_boot.project_spring_boot.services.StoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // This tells Spring that this class is a controller
public class StoryController {

    private final StoryService storyService; // We bring in the StoryService so we can use its functions

    // Spring will automatically create an instance of StoryService and give it to our controller
    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }

    @GetMapping("/create") // When someone goes to /create in their browser (using GET method)
    public String showCreateForm() {
        return "create-story"; // Show the create-story.html page
    }

    @PostMapping("/create") // When someone submits the form on /create (using POST method)
    public String createNewStory(@RequestParam("title") String title, @RequestParam("content") String content) {
        storyService.createStory(title, content); // Call the service to create the story
        return "redirect:/stories"; // After creating, redirect the user to the /stories page
    }

    @GetMapping("/stories")
    public String viewAllStories(Model model) {
        List<Story> allStories = storyService.getAllStories();
        model.addAttribute("stories", allStories);
        return "view-stories";
    }
}
