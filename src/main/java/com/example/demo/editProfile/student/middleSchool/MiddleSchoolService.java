package com.example.demo.editProfile.student.middleSchool;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class MiddleSchoolService {

    public static List<MiddleSchool> getMiddleSchoolStudents(){
        return List.of(new MiddleSchool(
                99867L,
                "John",
                "Doe",
                "john.doe@gmail.com",
                LocalDate.of(2009, Month.JUNE, 1),
                13
        ));
    }

    public static List<MiddleSchool> getMS_Honors_Clubs(){
        return List.of(new MiddleSchool(
                99867L,
                "John",
                "Doe",
                "john.doe@gmail.com",
                LocalDate.of(2008, Month.JUNE, 1),
                14,
                List.of("Honors Math", "Honors Chemistry"),
                List.of("Science Club", "Engineering Club")
        ));
    }
}
