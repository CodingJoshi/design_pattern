package design.pattern.behavioural.chain_of_responsibility.handlers;

import design.pattern.behavioural.chain_of_responsibility.AuthRequest;

public class PasswordAuthenticationHandler extends AuthBaseHandler {

    @Override
    public boolean handle(AuthRequest request) {
        System.out.println("Password authentication handler");
        if (isPasswordAuthenticated(request.getPassword(), request.getUserInfo().getPwd())) {
            if (nextHandler == null)
                return true;
            return nextHandler.handle(request);
        }
        return false;
    }

    private boolean isPasswordAuthenticated(String password, String pwd) {
        return password.equals(pwd);
    }
}
