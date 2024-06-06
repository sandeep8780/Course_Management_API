
#Course Management API
The Course Management API is a simple, RESTful web service built with Spring Boot, designed to manage educational courses efficiently without relying on a database. This API allows users to perform basic CRUD (Create, Read, Update, Delete) operations on course entities stored in memory. Each course has a unique identifier, a name, and a description. The API provides endpoints to retrieve all courses, get details of a specific course by its ID, create new courses, update existing courses, and delete courses by ID. This approach ensures easy setup and testing, making it ideal for development, educational purposes, or scenarios where persistent storage is not required. By utilizing this API, developers can seamlessly integrate course management features into their applications, ensuring a smooth and efficient workflow for handling course data.


### Using Postman to Test the Course Management API

Postman is an invaluable tool for developers and testers to interact with APIs. It provides a user-friendly interface to perform and automate HTTP requests, making it ideal for testing and debugging RESTful services like the Course Management API. With Postman, you can easily configure and send requests to your API endpoints and analyze the responses.

For instance, you can use Postman to create a new course by sending a `POST` request to `http://localhost:9999/courses` with a JSON body that includes the course name and description. Postman will display the response, showing the newly created course with its unique ID. To verify the course was added, you can send a `GET` request to `http://localhost:9999/courses` and see the list of all courses, including the one you just created.

You can also test updating a course by sending a `PUT` request to `http://localhost:9999/courses/{id}` with the updated course details in the request body. Deleting a course is just as straightforward with a `DELETE` request to `http://localhost:9999/courses/{id}`. Postman’s detailed response section, including status codes and returned data, helps you ensure that your API behaves as expected.

Overall, Postman simplifies the process of testing and validating API endpoints, ensuring that your Course Management API functions correctly before integrating it into your application. Its ease of use and comprehensive features make it an essential tool for any API development workflow.





## Endpoints

### Get All Courses

**URL**: `/courses`  
**Method**: `GET`  
**Description**: Retrieve a list of all courses.  
**Response**:
[
  {
    "id": 145,
    "name": "java core",
    "description": "this course contains basic java"
  },
  {
    "id": 151,
    "name": "Spring_BOOT",
    "description": "this Course Contain REST API"
  }
]

Get Course by ID
URL: courses/{id}
Method: GET
Description: Retrieve a course by its ID.
Response:
{
  "id": 1,
  "name": "Course Name",
  "description": "Course Description"
}

Create a Course
URL: /api/courses
Method: POST
Description: Create a new course.
Request Body:
{
  "name": "New Course",
  "description": "New Description"
}
{
  "id": 3,
  "name": "New Course",
  "description": "New Description"
}
Update a Course
URL: /api/courses/{id}
Method: PUT
Description: Update an existing course.
Request Body:

