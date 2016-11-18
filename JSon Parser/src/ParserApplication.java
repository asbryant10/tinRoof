import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.Object;
import java.lang.String;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ParserApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		URL posts = new URL("https://jsonplaceholder.typicode.com/posts");
		URL comments = new URL("https://jsonplaceholder.typicode.com/comments");

		BufferedReader in = new BufferedReader(new InputStreamReader(posts.openStream()));
		BufferedReader in2 = new BufferedReader(new InputStreamReader(comments.openStream()));

		String line;

		// holds one object
		String object = "";
		String object2 = "";

		// hashmap to hold id and posts
		HashMap<Integer, JSONObject> postsMap = new HashMap<Integer, JSONObject>();
		HashMap<Integer, JSONObject> commentsMap = new HashMap<Integer, JSONObject>();

		//while loop for posts
		while ((line = in.readLine()) != null) {

			if (line == "}") {

				// a full object now has been read
				object += line;

				// find the post id
				JSONObject obj = new JSONObject(object);
				int id = obj.getInt("id");

				// set it as the key of the hashmap
				// set the entire object as the value
				postsMap.put(id, obj);

				// set the object variable back to an empty string
				object = "";
			} else {
				object += line;
			}
		}

		// while loop for comments
		while ((line = in2.readLine()) != null) {

			if (line == "}") {

				// a full object now has been read
				object2 += line;

				// find the post id
				JSONObject obj = new JSONObject(object2);
				int id = obj.getInt("id");

				// set it as the key of the hashmap
				// set the entire object as the value
				commentsMap.put(id, obj);

				// set the object variable back to an empty string
				object2 = "";
			} else {
				object2 += line;
			}
		}
		
		//prompt user for id
		Scanner input = new Scanner(System.in);
		String id;
		id = input.next();

	}

}
