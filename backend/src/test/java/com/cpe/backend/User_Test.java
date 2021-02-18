// package com.project.backend;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertThrows;

// import com.project.backend.User.Entity.User;
// import com.project.backend.User.Repository.UserRepository;
// import java.util.Optional;
// import java.util.Set;
// import javax.validation.ConstraintViolation;
// import javax.validation.Validation;
// import javax.validation.Validator;
// import javax.validation.ValidatorFactory;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.dao.DataIntegrityViolationException;

// @DataJpaTest
// public class User_Test {

//   private Validator validator;

//   @Autowired
//   private UserRepository UserRepository;

//   @BeforeEach
//   public void setup() {
//     ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//     validator = factory.getValidator();
//   }

//   @Test
//   void Test_UserIsOK() {
//     User User = new User();
//     User.setName("Nattapol Panta");
//     User.setUsername("namenp2707");
//     User.setPassword("27072541");
//     User.setEmail("namenp2707@hotmail.com");

//     User = UserRepository.saveAndFlush(User);

//     Optional<User> found = UserRepository.findById(User.getId());
//     assertEquals("Nattapol Panta", found.get().getName());
//     assertEquals("namenp2707", found.get().getUsername());
//     assertEquals("27072541", found.get().getPassword());
//     assertEquals("namenp2707@hotmail.com", found.get().getEmail());
//   }

//   //==============================================================================
//   //==============================================================================
//   // ============================== Test for Name ================================
//   @Test
//   void Test_NameMustNotBeNull() {
//     User User = new User();
//     User.setName(null);
//     User.setUsername("namenp2707");
//     User.setPassword("27072541");
//     User.setEmail("namenp2707@hotmail.com");

//     Set<ConstraintViolation<User>> result = validator.validate(User);

//     // result ต้องมี error 1 ค่าเท่านั้น
//     assertEquals(1, result.size());

//     // error message ตรงชนิด และถูก field
//     ConstraintViolation<User> v = result.iterator().next();
//     assertEquals("must not be null", v.getMessage());
//     assertEquals("name", v.getPropertyPath().toString());
//   }

//   //==============================================================================
//   //==============================================================================
//   // ============================== Test for Username ================================
//   @Test
//   void Test_UsernameMustNotBeNull() {
//     User User = new User();
//     User.setName("Nattapol Panta");
//     User.setUsername(null);
//     User.setPassword("27072541");
//     User.setEmail("namenp2707@hotmail.com");

//     Set<ConstraintViolation<User>> result = validator.validate(User);

//     // result ต้องมี error 1 ค่าเท่านั้น
//     assertEquals(1, result.size());

//     // error message ตรงชนิด และถูก field
//     ConstraintViolation<User> v = result.iterator().next();
//     assertEquals("must not be null", v.getMessage());
//     assertEquals("username", v.getPropertyPath().toString());
//   }

//   //==============================================================================
//   //==============================================================================
//   // ============================== Test for Password ================================
//   @Test
//   void Test_PasswordMustNotBeNull() {
//     User User = new User();
//     User.setName("Nattapol Panta");
//     User.setUsername("namenp2707");
//     User.setPassword(null);
//     User.setEmail("namenp2707@hotmail.com");

//     Set<ConstraintViolation<User>> result = validator.validate(User);

//     // result ต้องมี error 1 ค่าเท่านั้น
//     assertEquals(1, result.size());

//     // error message ตรงชนิด และถูก field
//     ConstraintViolation<User> v = result.iterator().next();
//     assertEquals("must not be null", v.getMessage());
//     assertEquals("password", v.getPropertyPath().toString());
//   }

//   //==============================================================================
//   //==============================================================================
//   // ============================== Test for Email ================================
//   @Test
//   void Test_EmailMustNotBeNull() {
//     User User = new User();
//     User.setName("Nattapol Panta");
//     User.setUsername("namenp2707");
//     User.setPassword("27072541");
//     User.setEmail(null);

//     Set<ConstraintViolation<User>> result = validator.validate(User);

//     // result ต้องมี error 1 ค่าเท่านั้น
//     assertEquals(1, result.size());

//     // error message ตรงชนิด และถูก field
//     ConstraintViolation<User> v = result.iterator().next();
//     assertEquals("must not be null", v.getMessage());
//     assertEquals("email", v.getPropertyPath().toString());
//   }
// }
