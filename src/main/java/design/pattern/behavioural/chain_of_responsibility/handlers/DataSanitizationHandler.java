package design.pattern.behavioural.chain_of_responsibility.handlers;

import design.pattern.behavioural.chain_of_responsibility.AuthRequest;

public class DataSanitizationHandler extends AuthBaseHandler {
    @Override
    public boolean handle(AuthRequest request) {
        // sanitize the data
        // decrypt the password
        System.out.println("Data sanitization and decryption Handler");
        request.setPassword(sanitize(request.getPassword()));

        // call the next handle in chain
        if (nextHandler == null)
            return true;
        return nextHandler.handle(request);
    }

    private String sanitize(String password) {
        return password;
    }
}
