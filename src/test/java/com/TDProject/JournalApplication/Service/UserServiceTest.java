//package com.TDProject.JournalApplication.Service;
//
//import com.TDProject.JournalApplication.Entity.User;
//import com.TDProject.JournalApplication.Repository.UserRepository;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ArgumentsSource;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.ValueSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class UserServiceTest {
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private UserService userService;
//
//    @BeforeEach
//    void setUp(){
//
//    }
//
//    @AfterAll
//    void setAfter(){
//
//    }
//
////    @Disabled
////    @ParameterizedTest
////    @ValueSource(strings = {
////            "Ram",
////            "Sita",
////            "Admin",
////            "Tejal"
////    })
////    public void testFindByUserName(String userName){
////        assertNotNull(userRepository.findByUserName(userName));
////    }
//
//    @ParameterizedTest
//    @ArgumentsSource(UserArgumentsProvider.class)
//    public void testSaveNewUser(User user){
//        assertTrue(userService.saveNewEntry(user));
//    }
//
//    @ParameterizedTest
//    @CsvSource({
//            "1,1,2",
//            "2,10,12",
//            "3,3,9"
//    })
//    public void test(int a,int b,int expected){
//        assertEquals(expected,a+b);
//    }
//}
