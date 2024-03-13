package junit5test;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Helps to mark the cleanup methods as not static
public class FirstTestCLass {

    @BeforeAll
    void beforeAll(){
        System.out.println("This is expected to execute before other methods");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("This executes before each specified method");
    }

    @AfterAll
    void afterAll(){
        System.out.println("This is to execute after all method");
    }

    @AfterEach
    void afterEach(){
        System.out.println("This is to execute after each method");
    }

    @Test
    void firstMethod(){
        System.out.println("This is first test method");
    }

    @Test
    @DisplayName("Use to describe the tested test case") // The String will display instead of the method name
    void second(){
        System.out.println("This is the second test method");
    }
}
