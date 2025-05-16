package com.TDProject.JournalApplication.Repository;

import com.TDProject.JournalApplication.Entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document
public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {


}
