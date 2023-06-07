import org.example.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    @Test
    void isPasswordAtLeast8_pwEquals7(){
        assertFalse(PasswordValidator.passwordLength("pw34567"));
    }
    @Test
    void isPasswordAtLeast8_pwEquals8(){
        assertTrue(PasswordValidator.passwordLength("pw345678"));
    }
    @Test
    void containsDigit_withDigit(){
        assertFalse(PasswordValidator.passwordContainsDigits("password123"));
    }
    @Test
    void containsDigit_withoutDigit(){
        assertFalse(PasswordValidator.passwordContainsDigits("password"));
    }
    @Test
    void containsUpperCase_withUpperCase(){
        assertTrue(PasswordValidator.passwordUpperCaseLetters("Password"));
    }
    @Test
    void containsUpperCase_withoutUpperCase(){
        assertFalse(PasswordValidator.passwordUpperCaseLetters("password"));
    }
    @Test
    void isPasswordEasy_pwIsEasy(){
        assertFalse(PasswordValidator.passwordDoNotUse("Password123"));
    }
    @Test
    void isPasswordEasy_pwIsNotEasy(){
        assertTrue(PasswordValidator.passwordDoNotUse("Password12"));
    }
}
