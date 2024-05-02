package jebi.hendardi.student.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_jebi")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "studentID")
    private String StudentID;
    @Column(name = "email")
    private String email;
    @Column(name = "department")
    private String department;
    @Column(name = "imageUrl")
    private String ImageUrl;
}
