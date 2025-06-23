package design.pattern.chain_of_responsibility.handlers;

import design.pattern.chain_of_responsibility.AuthHandler;
import design.pattern.chain_of_responsibility.AuthRequest;

public abstract class AuthBaseHandler implements AuthHandler {
    AuthHandler nextHandler;

    @Override
    public AuthHandler setNext(AuthHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract boolean handle(AuthRequest request);
}
