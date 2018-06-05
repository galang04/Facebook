import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

public class PostsFromPageExtractor {

/**
 * A simple Facebook4J client which
 * illustrates how to access group feeds / posts / comments.
 * 
 * @param args
 * @throws FacebookException 
 */
public static void main(String[] args) throws FacebookException {

    // Generate facebook instance.
    Facebook facebook = new FacebookFactory().getInstance();
    // Use default values for oauth app id.
    facebook.setOAuthAppId("169532477219523", "ebdd1a2b690a27655155c6ea8b06bcd0");
    // Get an access token from: 
    // https://developers.facebook.com/tools/explorer
    // Copy and paste it below.
    String accessTokenString = "EAACEdEose0cBAIQfTQWJOjyZBdGcJRnx4LTZAkUdPdJBZA86CMUozGtFu75X77zS186DU2EMl0lpetjgAXVZCTkniZCeXIZCXgxPCyY3ibkZCTlMG202uj7d8vk2KL8i8rQC7YKBupA8KDfHjFFEzBkK12Oz1hGUm9ChIq6raSibZCXsKAyeEQhLuHZCABliZBqtgyvHZAi0LNzIwZDZD";
    AccessToken at = new AccessToken(accessTokenString);
    // Set access token.
    facebook.setOAuthAccessToken(at);

  
            
            facebook.postStatusMessage("Hello World from Facebook4J.");
        }           
    
}