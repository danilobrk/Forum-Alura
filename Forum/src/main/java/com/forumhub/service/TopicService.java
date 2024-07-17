package com.forumhub.service;
import com.forumhub.model.Topic;
import com.forumhub.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
        return topicRepository.findAll();
    }
        return topicRepository.findById(id);
    }
    public Topic save(Topic topic) {
        return topicRepository.save(topic);
    }
    public void deleteById(Long id) {
        topicRepository.deleteById(id);
    }
}
