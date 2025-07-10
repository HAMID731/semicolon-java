package com.spring_boot.project_spring_boot.data.repositories;

import com.spring_boot.project_spring_boot.data.models.Story;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository // This tells Spring this is a repository
public interface StoryRepository extends MongoRepository<Story, String> {
}
