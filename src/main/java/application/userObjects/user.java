package application.userObjects;

public class User {

    private String  apiKey;
   private String token;

    public User() {
    }

    User(String apiKey, String token){
       this.apiKey=apiKey;
       this.token=token;
   }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getToken(String token){
       return token;
    }
    public void  setToken(String token){
       this.token=token;
    }

    @Override
    public String toString() {
        return "User{" +
                "apiKey='" + apiKey + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

}
