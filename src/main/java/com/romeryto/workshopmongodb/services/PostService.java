package com.romeryto.workshopmongodb.services;

import com.romeryto.workshopmongodb.domain.Post;
import com.romeryto.workshopmongodb.repository.PostRepository;
import com.romeryto.workshopmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
