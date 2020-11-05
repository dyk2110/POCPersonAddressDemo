# PersonAddressDemo 
<br>

## Prerequisites <br><br>

- JDK 1.7 or later <br><br>
- Maven 3 or later <br><br>
- STS  <br><br>

## Details <br><br>
<br>
Person contains Id,fristName,lastName and address. <br>
Address contains Id,street,city,postalCode. <br>
Implemening of CRUD operations using springboot,JPA.

<br/>

##How to run: </br>
Download the project from github and extract to your local <br>

To make request Run the following command in the project folder as shown below: <br/>

C:\Users\[Computer Name]\Downloads\personAddressDemo\personAddressDemo>mvnmvn exec:java -Dexec.mainClass="com.person.demo.personAddressDemo.PersonAddressDemoApplication" <br />

Check Database url is running properly in browser make the request: <br/>

You can see Person and Address Tables here <br />

http://localhost:8082//h2-console <br />

To send request in SwaggerUI in browser enter the url : <br />

http://localhost:8082/swagger-ui.html  <br />

Expand person-controll Tab: <br />

Insert the data by using POST request and enter the "firstName" and "lastName" in the json request : <br/>

url: POST /api/person in swagger: <br />

Input Json data:  <br />
```json
{
  "firstName": "abc",
  "lastName": "zzz"
}
```
<br />

Check the data is inserted in DB.  <br />

Like that we can make request for Edit, delete , and Address data also.












