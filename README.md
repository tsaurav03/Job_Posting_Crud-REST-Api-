Develop RESTful web service for managing job postings . Recruiter should be able to post new job, update job details & delete postings. 
Entity JobPosting can have attributes like Job title, company name, location, description, requirements, salary, and posting date.

Endpoints:
1.	Posting new Job:
•	Endpoint: POST /jobPostings
•	Request: JSON payload containing job details.
•	Response: Confirmation of the created job posting.

2.	Update Job Posting:
•	Endpoint: PUT /jobPostings/{jobId}
•	Request: Update an existing job posting by providing its unique identifier and the updated information.
•	Response: Confirmation of the updated job posting.

3.	Delete Job Posting:
•	Endpoint: DELETE /jobPostings/{jobId}
•	Request:Delete a job posting by providing its unique identifier.
•	Response:Confirmation of the deleted job posting.

4.	Get all Job Postings:
•	Endpoint: GET /jobPostings
•	Request: Retrieve a list of all available job postings.
•	Response: JSON array containing job details
Notes:
•	Response codes should be as per REST guidelines.
•	Error handling in case of failures.
