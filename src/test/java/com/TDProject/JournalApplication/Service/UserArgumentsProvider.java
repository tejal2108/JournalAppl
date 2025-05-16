//package com.TDProject.JournalApplication.Service;
//
//import com.TDProject.JournalApplication.Entity.User;
//import org.junit.jupiter.api.extension.ExtensionContext;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.ArgumentsProvider;
//
//import java.util.stream.Stream;
//
//public class UserArgumentsProvider implements ArgumentsProvider {
//    @Override
//    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
//        return Stream.of(
//                Arguments.of(User.builder().userName("ddd").password("dd").build()),
//                Arguments.of(User.builder().userName("ttt").password("ttt").build())
//        );
//    }
//}
