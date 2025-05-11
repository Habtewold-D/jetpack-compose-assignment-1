package com.example.jetpack_compose_assignment_1.data

object SampleData {
    val courses = listOf(
        Course(
            title = "Introduction to Computer Science",
            code = "CS101",
            creditHours = 3,
            description = "An introductory course covering fundamental concepts of computer science, including programming basics, algorithms, and data structures.",
            prerequisites = "None"
        ),
        Course(
            title = "Data Structures and Algorithms",
            code = "CS201",
            creditHours = 4,
            description = "Advanced study of data structures and algorithms, including trees, graphs, sorting, and searching techniques.",
            prerequisites = "CS101"
        ),
        Course(
            title = "Database Systems",
            code = "CS301",
            creditHours = 3,
            description = "Comprehensive study of database design, implementation, and management, including SQL and NoSQL databases.",
            prerequisites = "CS201"
        ),
        Course(
            title = "Mobile App Development",
            code = "CS401",
            creditHours = 4,
            description = "Learn to develop mobile applications using modern frameworks and tools, with focus on user interface design and user experience.",
            prerequisites = "CS201"
        ),
        Course(
            title = "Software Engineering",
            code = "CS501",
            creditHours = 3,
            description = "Study of software development methodologies, design patterns, and best practices in software engineering.",
            prerequisites = "CS301, CS401"
        )
    )
} 