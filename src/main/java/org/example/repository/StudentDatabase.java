package org.example.repository;
import org.example.model.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDatabase implements StudentRepository {
        private List<Student> students = new ArrayList<>();

        @Override
        public void saveStudent(Student student) {
            students.add(student);
            System.out.println("Student saved: " + student.getName());
        }

        public List<Student> getAllStudents() {
            return students;
        }
}
