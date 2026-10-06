package com.romeryto.workshopmongodb.repository;

import com.romeryto.workshopmongodb.domain.Post;
import com.romeryto.workshopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
