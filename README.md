# DropWizard-Hello

A DropWizard project with 3 routes

How to:
1. Download project as a zip
2. Unzip file
3. Navigate to the project in terminal
4. CD into project
5. Run "java -jar target/hello-world-0.0.1-SNAPSHOT.jar server hello-world.yml" to start project
6. Terminal comand options
   
   a. "curl http://localhost:8080/hello-world" - returns "Hello! How are you today?"
   b. "curl http://localhost:8080/plain-text" - returns "Hello! How are you today?" 
   c. "curl http://localhost:8080/hello-world-json" - returns JSON object {"id":number - number of times run,"content":"Hello! How are you today?"}