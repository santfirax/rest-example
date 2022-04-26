import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.when;

public class ShouldGetAllPokemons {
    @Test
    public void shouldGetDittoPokemon() {
        when()
                .get("https://pokeapi.co/api/v2/pokemon/ditto")
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

}
