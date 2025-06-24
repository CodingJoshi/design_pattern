package design.pattern.behavioural.chain_of_responsibility;

public interface AuthHandler {
    boolean handle(AuthRequest request);

    AuthHandler setNext(AuthHandler nextHandler);
}
