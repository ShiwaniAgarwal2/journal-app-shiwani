package com.shiwani.journalApp.repository;

import com.shiwani.journalApp.controller.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId>{

}
