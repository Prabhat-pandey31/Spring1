package in.pp.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.pp.beans.Student;
public class StudentRowMappers implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setRollno(rs.getInt("std_rollno"));
        student.setName(rs.getString("std_name"));
        student.setMarks(rs.getInt("std_marks"));
        return student;
    }
}
