# Record Project
## Technology Stack

<li>Java 1.8</li>
<li>Spring Boot</li>
<li>Maven</li>

## Prerequisites to run the application

You must have the following to run the application:
<li><a href="http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html">JDK 1.8</a></li>
<li><a href="https://maven.apache.org/">Maven</a></li>

(Make sure you have them installed on your computer before you run the application)

## Run the application

Start the application
<ol>
<li>Open your terminal or cmd</li>
<li>Choose any path you like to clone the project</li>
<li>Check out the project on github: <code>git clone https://github.com/lichao0817/record.git</code></li>
<li>Change your working directory to the root of the project: <code>cd record</code></li>
<li>To build the application: <code>mvn package</code></li>
<li>To start up the application: <code>java -jar target/record-1.0-SNAPSHOT.jar</code></li>
<li>You should be able to see the message like this: <b>"Started Application in 12.957 seconds (JVM running for 13.446)"</b></li>
<li>Now the app is up and running! You can test the api now!</li>
</ol>

Notice: make sure you have Java 1.8 and Maven installed correctly and port 8080 on your local machine is available.

## Test the application

Test get records sorted by gender:
<ol>
<li>Open any web browser you like</li>
<li>Type <code>localhost:8080/records/gender</code> in the address bar</li>
<li>You should be able see the prepopulated records sorted by gender in JSON</li>
</ol>

Test get records sorted by date of birth:
<ol>
<li>Open any web browser you like</li>
<li>Type <code>localhost:8080/records/birthdate</code> in the address bar</li>
</ol>

Test get records sorted by last name in descending order:
<ol>
<li>Open any web browser you like</li>
<li>Type <code>localhost:8080/records/name</code> in the address bar</li>
</ol>

## Test coverage

|Package|Class, %|Method, %|Line, %|
|-------|--------|---------|-------|
|app    |  0     | 0       |  0    |
|dao    |100     |100      |100    |
|model  |100     |100      |100    |
|util   |100     |95.5     |87.1   |

More details are in record/coverage
