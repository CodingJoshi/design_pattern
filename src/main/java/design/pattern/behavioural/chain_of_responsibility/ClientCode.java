package design.pattern.behavioural.chain_of_responsibility;

import design.pattern.behavioural.chain_of_responsibility.handlers.DataSanitizationHandler;
import design.pattern.behavioural.chain_of_responsibility.handlers.PasswordAuthenticationHandler;
import design.pattern.behavioural.chain_of_responsibility.handlers.UserExistCheckHandler;

public class ClientCode {
    public static void main(String[] args) {
        AuthHandler dsh = new DataSanitizationHandler();
        AuthHandler uxch = new UserExistCheckHandler();
        AuthHandler pah = new PasswordAuthenticationHandler();
        dsh.setNext(uxch);
        uxch.setNext(pah);

        AuthRequest request = new AuthRequest("joshi", "myHashPwd");
        dsh.handle(request);

    }
}
