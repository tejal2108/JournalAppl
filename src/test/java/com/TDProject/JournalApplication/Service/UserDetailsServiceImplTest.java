//package com.TDProject.JournalApplication.Service;
//
//import com.TDProject.JournalApplication.Entity.User;
//import com.TDProject.JournalApplication.Repository.UserRepository;
//import lombok.val;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.test.context.ActiveProfiles;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static java.util.List.*;
//import static org.mockito.Mockito.*;
//
////@ActiveProfiles("dev")
//@ExtendWith(MockitoExtension.class)
//public class UserDetailsServiceImplTest {
//
////    @InjectMocks
////    private UserDetailsServiceImpl userDetailsService;
////
////    @Mock
////    private UserRepository userRepository;
////
////    @BeforeEach
////    void setUp(){
////        MockitoAnnotations.initMocks(this);
////    }
//
////    @Test
////    void loadUserNameByTest(){
////        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(
////                User.builder()
////                        .userName("Ram")
////                        .password("ttt")
////                        .roles()
////                        .build()
////        );
////        UserDetails user = userDetailsService.loadUserByUsername("Ram");
////        Assertions.assertNotNull(user);
//
//        @InjectMocks
//        private UserDetailsServiceImpl userDetailsService;
//
//        @Mock
//        private UserRepository userRepository;
//
//        @BeforeEach
//        void setUp(){
//            MockitoAnnotations.initMocks(this);
//        }
//
////        @Disabled
//
//        @Test
//        void loadUserByUsernameTest(){
//            when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("ram").password("inrinrick").roles(new ArrayList<>()).build());
//            UserDetails user = userDetailsService.loadUserByUsername("ram");
//            Assertions.assertNotNull(user);
//        }
//    }
////}
