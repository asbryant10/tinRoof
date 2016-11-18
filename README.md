# tinRoof
Coding assessment 

What the program does:
Read in the data from the two urls using  buffered reader. Read in lines and save them to variable object until a closing bracket is read. Set that object to a JSON object. Save the value of the 'id' key. That id value becomes the key for the hashmap and the entire object is the value associated with that key. 

Reapeat this process for the comments and store the comments data in a seperate hashmap. 
Create a Scanner to read in the id given by a user and save it.

What I would have added:
Because I was over my time, I was not able to code the part of the program that would have printed out the post and the comments. I would have called the get method on the hashmaps passing in the id given by the user  (perhaps add in validation of the id given). Then use the System.out.println to print out the results of get for both hashmaps. 
I also would have properly added the JSON plug-in or jar to the project or classpath.
Since I used Eclipse, for testing I would have created JUnit test cases. 
