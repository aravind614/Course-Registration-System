    package com.example.Course.Registration.System.model;

    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class CourseRegistry {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String name;
        private String emailid;
        private String courseName;

        public CourseRegistry(String name, String emailid, String courseName) {
            this.name=name;
            this.emailid=emailid;
            this.courseName=courseName;
        }
    }
