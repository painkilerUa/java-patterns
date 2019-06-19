package com.compound;

public class GooseFactory {
    public GooseAdapter createGoose() {
        return new GooseAdapter(new Goose());
    }
}
