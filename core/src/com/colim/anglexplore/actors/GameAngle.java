package com.colim.anglexplore.actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Group;

/*
 * Created by Hadrian Paulo Lim on 2015.
 *
 * Copyright (c) Usbong Social Systems, Inc. All rights reserved.
 */

public class GameAngle extends Group {

    private Point point;
    private Arm arm, arm2;
    private float randomAngle =  ((float) Math.random() * 360f);

    public GameAngle(Texture pointTexture, Texture armTexture, Vector2 position, float angle){ //Vector2 vertex, float angle
        // create angle here
        point = new Point(pointTexture, position);
        arm = new Arm(armTexture, randomAngle);
        arm2 = new Arm(armTexture, randomAngle+angle);

        addActor(point);
        addActor(arm);
        addActor(arm2);
    }

    @Override
    public void act(float delta) {
        float armPosX = point.getX() + point.getWidth() / 2;
        float armPosY = point.getY() + point.getHeight() / 2;
        super.act(delta);
        arm.setPosition(armPosX, armPosY);
        arm2.setPosition(armPosX, armPosY);
        
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
    }
}
