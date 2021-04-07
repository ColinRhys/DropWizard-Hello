# DropWizard-Hello

A DropWizard project with 3 routes

How to:
1. Download project as a zip and unzip it OR clone repo from terminal
2. Navigate to the project in terminal
3. CD into project
4. Run "java -jar target/hello-world-0.0.1-SNAPSHOT.jar server hello-world.yml" to start project
5. Terminal command options
   
   a. "curl http://localhost:8080/hello-world" - returns "Hello! How are you today?"
   
   b. "curl http://localhost:8080/plain-text" - returns "Hello! How are you today?"
   
   c. "curl http://localhost:8080/hello-world-json" - returns JSON object {"id":number - number of times run,"content":"Hello! How are you today?"}