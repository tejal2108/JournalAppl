//package com.TDProject.JournalApplication.Controller;
//
//import com.TDProject.JournalApplication.Entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
//@RestController
//@RequestMapping("/_journal")       // add mapping on class
//public class JournalEntryController {
//    private Map<Long, JournalEntry> JournalEntries = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(JournalEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//        JournalEntries.put(myEntry.getId(),myEntry);
//        return true;
//    }
//
//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myId){
//        return JournalEntries.get(myId);
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteJournalEntryById(@PathVariable Long myId){
//        return JournalEntries.remove(myId);
//    }
//
//    @PutMapping("id/{id}")
//    public JournalEntry updateJournalEntryById(@PathVariable Long id,@RequestBody JournalEntry myEntry){
//        return JournalEntries.put(id,myEntry);
//    }
//
//
//
//}
