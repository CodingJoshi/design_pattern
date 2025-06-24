package design.pattern.behavioural.chain_of_responsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {
    private String userName;
    private String password;
    private UserInfo userInfo;

    public AuthRequest(String usrName, String pwd) {
        this.userName = usrName;
        this.password = pwd;
    }


    @Getter
    @Setter
    static public class UserInfo {
        private String userName;
        private String pwd;
        String role;
        boolean isActive;
    }
}
