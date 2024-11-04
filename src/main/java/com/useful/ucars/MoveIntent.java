package com.useful.ucars;

public class MoveIntent {
    public float forward;
    public float sideways;
    public boolean jumping;

    public MoveIntent(float forward, float sideways, boolean jumping) {
        this.forward = forward;
        this.sideways = sideways;
        this.jumping = jumping;
    }

    public void update(float forward, float sideways, boolean jumping) {
        this.forward = forward;
        this.sideways = sideways;
        this.jumping = jumping;
    }
}
