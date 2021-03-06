package data.post.register;

public class ResponseRegister {
    private Integer id;
    private String token;
    private String error;

    public ResponseRegister(){
        super();
    }

    public ResponseRegister(Integer id, String token) {
        this.id = id;
        this.token = token;
    }

    public ResponseRegister(String error) {
        this.error = error;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
