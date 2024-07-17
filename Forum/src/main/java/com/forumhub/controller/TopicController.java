package com.forumhub.controller;
import com.forumhub.model.Topic;
import com.forumhub.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/topics")
public class TopicController {
    @Autowired
    private TopicService topicService;
    @GetMapping
        return topicService.findAll();
    }
    @GetMapping("/{id}")
        return topic.map(ResponseEntity::ok)
                    .orElseGet(() -
    }
    @PostMapping
    public Topic createTopic(@RequestBody Topic topic) {
        return topicService.save(topic);
    }
    @PutMapping("/{id}")
        if (existingTopic.isPresent()) {
            Topic topic = existingTopic.get();
            topic.setTitle(updatedTopic.getTitle());
            topic.setContent(updatedTopic.getContent());
            return ResponseEntity.ok(topicService.save(topic));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
        if (topicService.findById(id).isPresent()) {
            topicService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
