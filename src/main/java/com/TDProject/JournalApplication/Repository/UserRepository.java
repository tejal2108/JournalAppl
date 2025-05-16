package com.TDProject.JournalApplication.Repository;

import com.TDProject.JournalApplication.Entity.JournalEntry;
import com.TDProject.JournalApplication.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document
public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String userName);

    void deleteByUserName(String userName);
}
