# Priority Subscribe Users Service

<br>

## Overview
Using <strong>RScoredSortedSetReactive</strong> in a Redis-backed application is crucial for efficiently managing and accessing elements based on priority or sorted order.
This data structure allows you to <strong>assign a score to each element</strong>, enabling quick retrieval of items based on their <strong>priority.</strong> 
It is particularly useful in scenarios like <strong>task scheduling</strong>, <strong>leaderboard management</strong>, or any <strong>application requiring ranked</strong> or <strong>prioritized access to data.</strong><br><br>
In this project, we will see how to <mark>prioritize orders for subscribed users from the prime, standard, and guest categories.</mark>
  
 <br>
 
## Usages
- Spring WebFlux
- Redisson "Redis"  
- Lombok
    
<br> 

## Architecture of the Project

 ### 1-src folder
   - Configration
   - Controller
   - Enum
   - Model
   - Service
   
### 2-Maven pom.xml
<br> 
    
```
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-webflux</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.projectreactor</groupId>
			<artifactId>reactor-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.redisson</groupId>
			<artifactId>redisson-spring-boot-starter</artifactId>
			<version>3.16.6</version>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.18.30</version>
			<scope>provided</scope>
		</dependency>
	</dependencies>
 ```

<br>

###### Output :star_struck:

##### :pencil2: `Users are prioritized based on their subscription level.` 

<img width="1307" alt="Screenshot 1446-01-09 at 12 57 06 PM" src="https://github.com/user-attachments/assets/c5b4d1ab-2af8-44f7-88fb-dd1d5d70c3e3">

---

### Good Luck <img src="https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif" width="30px"> 
