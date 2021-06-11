package za.ac.cput.Entity;
/* Abdul Quddoos Sunge
 * 216118905
 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.RegistrationFactory;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {

    @Test
    void build() {
        Registration registration1 = new Registration.RegistrationBuilder().setCourseCode("ADP2415")
                .setCourseName("Applications Development")
                .setStudNumber("216118905")
                .setRegId("202119234")
                .build();
        //Factory
        Registration registration2 = RegistrationFactory.build("Applications Development","ADP2415","216118905","202119234");
        Registration registration3 = registration2;
        assertEquals(registration3, registration2);
        System.out.println("reg2:"+registration2);
        System.out.println("reg3:"+registration3);
    }

    @Test void testIdentity() {
        Registration registration1 = new Registration.RegistrationBuilder().setCourseCode("ADP2415")
                .setCourseName("Applications Development")
                .setStudNumber("216118905")
                .setRegId("202119234")
                .build();
        //Factory
        Registration registration2 = RegistrationFactory.build("Applications Development","ADP2415","216118905","202119234");
        Registration registration3 = registration2;
        assertEquals(registration3, registration2);
        System.out.println("reg2:"+registration2);
        System.out.println("reg3:"+registration3);
    }

    @Disabled
    @Test void testTimeout(){
        assertTimeout(Duration.ofMillis(100),() ->{
            Thread.sleep(5000);
            System.out.println("Timed out");
        });
    }

    @Disabled
    @Test void testFactory(){
        Registration reg = RegistrationFactory.build("Applications Development","ADP2415","216118905","202119234");
        System.out.println(reg);
        assertNotNull(reg);
    }

}