//package com.TDProject.JournalApplication.Controller;
//
//import com.TDProject.JournalApplication.Entity.JournalEntry;
//import com.TDProject.JournalApplication.Service.JournalEntryService;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/journal")       // add mapping on class
//public class JournalEntryControllerV1 {
//    @Autowired
//    private JournalEntryService journalEntryService;
//
//    @GetMapping()
//    public ResponseEntity<?> getAll() {
//        List<JournalEntry> all = journalEntryService.getAllEntry();
//        if (all != null && !all.isEmpty()){
//            return new ResponseEntity<>(all,HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @PostMapping
//    public ResponseEntity<JournalEntry> createEntry(@RequestBody JournalEntry myEntry){
//        try {
////            myEntry.setDate(LocalDateTime.now());
//            journalEntryService.saveEntry(myEntry);
//            return new ResponseEntity<>(myEntry, HttpStatus.CREATED);
//        }
//        catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    @GetMapping("id/{myId}")
//    public ResponseEntity<JournalEntry> getJournalEntryById(@PathVariable ObjectId myId){
//       Optional<JournalEntry> journalEntry = journalEntryService.getEntryById(myId);
//       if (journalEntry.isPresent()){
//           return new ResponseEntity<>(journalEntry.get(), HttpStatus.OK);
//       }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @DeleteMapping("id/{myId}")
////    wild card
//    public ResponseEntity<?> deleteJournalEntryById(@PathVariable ObjectId myId){
//        journalEntryService.deleteById(myId);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @PutMapping("id/{id}")
//    public ResponseEntity<?> updateJournalEntryById(@PathVariable ObjectId id,@RequestBody JournalEntry newEntry){
//        JournalEntry oldEntry = journalEntryService.getEntryById(id).orElse(null);
//        if(oldEntry != null){
//            oldEntry.setName(newEntry.getName() != null && !newEntry.getName().equals("") ? newEntry.getName() : oldEntry.getName());
//            oldEntry.setContent(newEntry.getContent() != null && !newEntry.equals("") ? newEntry.getContent() : oldEntry.getName());
//            journalEntryService.saveEntry(oldEntry);
//            return new ResponseEntity<>(oldEntry,HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//
//
//}
