# Structure 
This section will describe the structure of the project and the most important content for this assignment, the headers in this section will refer to the folders in the repo.
## model
The model folder contains the following files
#### study.ecore
This is the Ecore Model, it is focusing on how different progams of study contains semesters, courses and specializations.
* At the top of the model we find the department, which contains courses and programs.
  * The courses are registered here so that the same course object can be used in different semesters.
* A program can have both specializations and semesters without specializations. If there is a specialization it will contain the semesters, if there is no specialization the semesters will be contained by the programme.
* Each semester can have multiple SemesterCourse objects, the SemesterCourse is a connection between a course and a semester. The SemesterCourse determine if a course is mandatory for the semester, this is registered by setting a boolean value.
  * There is an OCL restriction in Semester, this restriction says that a semester cannot have mandatory courses with more 30 credits in total.
* There is a Java-restriction in Course, this restriction says that a course cannot have less than 5.0 credits.

#### study.genmodel
This is the EMF Generator Model made using the study.ecore Ecore Model. 

#### Department1.xmi
This is the Dynamic Instance used to test if the model is functioning as it should, this file contains testdata used to test the model.

## src
This folder containes the generated model code made using the study.genmodel file.
* In study.util/StudyValidator.java the implementation of the restriction for the Course is located. The method "validateCourse_courseCredits" is responsible for this restriction. 

# Constraints
There are two constraint in this model
* Semester (OCL): A semester cannot have more than 30 credits in total in mandatory courses. 
* Course (Java): A course cannot have less than 5.0 credits

# PlantUML Diagram
![PlantUML Diagram](https://github.com/matseda/TDT4250Assignment/blob/master/Assignment1.png)
