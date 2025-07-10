package com.spring_boot.project_spring_boot.services;

import com.spring_boot.project_spring_boot.data.models.Story;
import com.spring_boot.project_spring_boot.data.repositories.StoryRepository; // Import our new repository
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {

    private final StoryRepository storyRepository; // We'll use this to talk to MongoDB

    // Spring will automatically give us a StoryRepository when it creates a StoryService
    public StoryService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public void createStory(String title, String content) {
        Story newStory = new Story();
        newStory.setTitle(title);
        newStory.setContent(content);
        storyRepository.save(newStory); // Now we use the repository to save to MongoDB
        System.out.println("Story created and saved to MongoDB with title: " + title);
    }

    public List<Story> getAllStories() {
        return storyRepository.findAll(); // Now we use the repository to get all stories from MongoDB
    }
}