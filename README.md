Webpage Ranking Search Engine With Seo Suggester
In order to launch the application:
Firstly, create websites instances with the following arguments: 
String nameOfWebsite, String url, List keywords.
 Example:
var website = new Website("vk", "vk.com", new ArrayList<>(List.of("social", "entertainment", "friends")));

Create and initalize a new variable with CRUD<Website> as a type
Create and initalize a new variable with Server type and CRUD<Website> crud as parameter
Example:  
CRUD<Website> crud = new WebsiteCRUD();
Server server = new Server(crud);

Add Website's to the server
Example: server.createWebsite(website1);

Create variable with Seo type and server as parameter
Example: Seo seo = new Seo(server);

Create a list of websites equal to seo.suggester()
Print this list
Example:
List<Website> websites = seo.suggester();
System.out.println(websites);