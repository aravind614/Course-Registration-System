function showCourse() {

    fetch("http://localhost:8080/course")

    .then((response) => response.json())

    .then((courses) => {

        const data = document.getElementById("coursetable");

        courses.forEach(course => {

            var row = `<tr>
                <td>${course.courseid}</td>
                <td>${course.courseName}</td>
                <td>${course.trainer}</td>
                <td>${course.durationInWeek}</td>
            </tr>`;

            data.innerHTML += row;

        });

    });
}
function showentrollStudent() {

    fetch("http://localhost:8080/courses/entrolled")

    .then((response) => response.json())

    .then((entrolls) => {

        const data = document.getElementById("entrolltable");

        entrolls.forEach(entroll => {

            var row = `<tr>
                <td>${entroll.name}</td>
                <td>${entroll.emailid}</td>
                <td>${entroll.courseName}</td>
            </tr>`;

            data.innerHTML += row;

        });

    });
}