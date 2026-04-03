package com.resttutorial.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id){
        studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id, Student updateStudent){
        Student existing = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
        existing.setName(updateStudent.getName());
        existing.setEmail(updateStudent.getEmail());
        existing.setBranch(updateStudent.getBranch());

        return studentRepository.save(existing);
    }

    public Student patchStudent(Long id, Student partialStudent){
        Student existing = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
        if (partialStudent.getName() != null)
            existing.setName(partialStudent.getName());
        if (partialStudent.getEmail() != null)
            existing.setEmail(partialStudent.getEmail());

        if (partialStudent.getBranch() != null)
            existing.setBranch(partialStudent.getBranch());

        return studentRepository.save(existing);
    }

    public List<Student> getStudentsByBranch(String branch) {
        return studentRepository.findByBranch(branch);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }

    public StudentDTO getStudentDTOById(Long id){
        Student student = studentRepository.findById(id).orElseThrow(()-> new StudentNotFoundException(id));
        return new StudentDTO(student.getId(), student.getName(), student.getEmail());
    }

    public List<StudentDTO> getAllStudentDTOs(){
        return studentRepository.findAll().stream().map(s -> new StudentDTO(s.getId(), s.getName(), s.getEmail())).collect(Collectors.toList());
    }
}
