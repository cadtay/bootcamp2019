package commanchesterdigital;

public class SpotifyAccountService {
    private AuthenticationService authenticationService;

    public SpotifyAccountService(AuthenticationService authenticateService){
        this.authenticationService = authenticateService;
    }


    public SpotifyAccount verify(String username, String password) {
        if (!authenticationService.authenticate(username, password)){
            throw new SpotifyAccountNotValidException();
    }
            else {
            return new SpotifyAccount(username, password);
        }


    }
}
