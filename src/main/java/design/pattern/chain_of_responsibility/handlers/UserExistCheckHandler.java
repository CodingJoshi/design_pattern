package design.pattern.chain_of_responsibility.handlers;

import design.pattern.chain_of_responsibility.AuthRequest;

public class UserExistCheckHandler extends AuthBaseHandler {
    @Override
    public boolean handle(AuthRequest request) {
        System.out.println("user existence check handler");
        if (isUserExists(request)) {
            if (nextHandler == null)
                return true;
            return nextHandler.handle(request);
        }
        return false;
    }

    private boolean isUserExists(AuthRequest request) {
        // Db Call returns usrInfo
        AuthRequest.UserInfo usrInfo = new AuthRequest.UserInfo();
        usrInfo.setUserName(request.getUserName());
        usrInfo.setPwd(request.getPassword());
        usrInfo.setRole("ROLE:USER");

        request.setUserInfo(usrInfo);
        return true;
    }
}
