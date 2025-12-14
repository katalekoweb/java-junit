import com.techvalon.dao.Course;
import com.techvalon.dao.JavaCourse;
import com.techvalon.services.PurchaseCourse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoursePurchaseTest {

    @Test
    public void testProceedWithCourse () {
        PurchaseCourse purchaseCourse = new PurchaseCourse();

        boolean status = purchaseCourse.proceedWithCourse(new JavaCourse());
        assertTrue(status);

        String str = "Junit 5";
        assertFalse(status, "Its failed bcz unit is results in true");
    }
}
