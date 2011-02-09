/*
 * Copyright 2011 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.gwt.gwtcanvasdemo.client;

import com.google.gwt.canvas.dom.client.Context2d;

import java.util.ArrayList;

public class BallGroup {
  final double width;
  final double height;
  Ball[] balls;
  
  public BallGroup(double width, double height) {
    this.width = width;
    this.height = height;
    ArrayList<Ball> ballsArrayList = new ArrayList<Ball>(0);
    
    // init balls (values from Google's homepage)
    ballsArrayList.add(new Ball(202, 78, 0, 9, "#ed9d33"));
    ballsArrayList.add(new Ball(348, 83, 0, 9, "#d44d61"));
    ballsArrayList.add(new Ball(256, 69, 0, 9, "#4f7af2"));
    ballsArrayList.add(new Ball(214, 59, 0, 9, "#ef9a1e"));
    ballsArrayList.add(new Ball(265, 36, 0, 9, "#4976f3"));
    ballsArrayList.add(new Ball(300, 78, 0, 9, "#269230"));
    ballsArrayList.add(new Ball(294, 59, 0, 9, "#1f9e2c"));
    ballsArrayList.add(new Ball(45, 88, 0, 9, "#1c48dd"));
    ballsArrayList.add(new Ball(268, 52, 0, 9, "#2a56ea"));
    ballsArrayList.add(new Ball(73, 83, 0, 9, "#3355d8"));
    ballsArrayList.add(new Ball(294, 6, 0, 9, "#36b641"));
    ballsArrayList.add(new Ball(235, 62, 0, 9, "#2e5def"));
    ballsArrayList.add(new Ball(353, 42, 0, 8, "#d53747"));
    ballsArrayList.add(new Ball(336, 52, 0, 8, "#eb676f"));
    ballsArrayList.add(new Ball(208, 41, 0, 8, "#f9b125"));
    ballsArrayList.add(new Ball(321, 70, 0, 8, "#de3646"));
    ballsArrayList.add(new Ball(8, 60, 0, 8, "#2a59f0"));
    ballsArrayList.add(new Ball(180, 81, 0, 8, "#eb9c31"));
    ballsArrayList.add(new Ball(146, 65, 0, 8, "#c41731"));
    ballsArrayList.add(new Ball(145, 49, 0, 8, "#d82038"));
    ballsArrayList.add(new Ball(246, 34, 0, 8, "#5f8af8"));
    ballsArrayList.add(new Ball(169, 69, 0, 8, "#efa11e"));
    ballsArrayList.add(new Ball(273, 99, 0, 8, "#2e55e2"));
    ballsArrayList.add(new Ball(248, 120, 0, 8, "#4167e4"));
    ballsArrayList.add(new Ball(294, 41, 0, 8, "#0b991a"));
    ballsArrayList.add(new Ball(267, 114, 0, 8, "#4869e3"));
    ballsArrayList.add(new Ball(78, 67, 0, 8, "#3059e3"));
    ballsArrayList.add(new Ball(294, 23, 0, 8, "#10a11d"));
    ballsArrayList.add(new Ball(117, 83, 0, 8, "#cf4055"));
    ballsArrayList.add(new Ball(137, 80, 0, 8, "#cd4359"));
    ballsArrayList.add(new Ball(14, 71, 0, 8, "#2855ea"));
    ballsArrayList.add(new Ball(331, 80, 0, 8, "#ca273c"));
    ballsArrayList.add(new Ball(25, 82, 0, 8, "#2650e1"));
    ballsArrayList.add(new Ball(233, 46, 0, 8, "#4a7bf9"));
    ballsArrayList.add(new Ball(73, 13, 0, 8, "#3d65e7"));
    ballsArrayList.add(new Ball(327, 35, 0, 6, "#f47875"));
    ballsArrayList.add(new Ball(319, 46, 0, 6, "#f36764"));
    ballsArrayList.add(new Ball(256, 81, 0, 6, "#1d4eeb"));
    ballsArrayList.add(new Ball(244, 88, 0, 6, "#698bf1"));
    ballsArrayList.add(new Ball(194, 32, 0, 6, "#fac652"));
    ballsArrayList.add(new Ball(97, 56, 0, 6, "#ee5257"));
    ballsArrayList.add(new Ball(105, 75, 0, 6, "#cf2a3f"));
    ballsArrayList.add(new Ball(42, 4, 0, 6, "#5681f5"));
    ballsArrayList.add(new Ball(10, 27, 0, 6, "#4577f6"));
    ballsArrayList.add(new Ball(166, 55, 0, 6, "#f7b326"));
    ballsArrayList.add(new Ball(266, 88, 0, 6, "#2b58e8"));
    ballsArrayList.add(new Ball(178, 34, 0, 6, "#facb5e"));
    ballsArrayList.add(new Ball(100, 65, 0, 6, "#e02e3d"));
    ballsArrayList.add(new Ball(343, 32, 0, 6, "#f16d6f"));
    ballsArrayList.add(new Ball(59, 5, 0, 6, "#507bf2"));
    ballsArrayList.add(new Ball(27, 9, 0, 6, "#5683f7"));
    ballsArrayList.add(new Ball(233, 116, 0, 6, "#3158e2"));
    ballsArrayList.add(new Ball(123, 32, 0, 6, "#f0696c"));
    ballsArrayList.add(new Ball(6, 38, 0, 6, "#3769f6"));
    ballsArrayList.add(new Ball(63, 62, 0, 6, "#6084ef"));
    ballsArrayList.add(new Ball(6, 49, 0, 6, "#2a5cf4"));
    ballsArrayList.add(new Ball(108, 36, 0, 6, "#f4716e"));
    ballsArrayList.add(new Ball(169, 43, 0, 6, "#f8c247"));
    ballsArrayList.add(new Ball(137, 37, 0, 6, "#e74653"));
    ballsArrayList.add(new Ball(318, 58, 0, 6, "#ec4147"));
    ballsArrayList.add(new Ball(226, 100, 0, 5, "#4876f1"));
    ballsArrayList.add(new Ball(101, 46, 0, 5, "#ef5c5c"));
    ballsArrayList.add(new Ball(226, 108, 0, 5, "#2552ea"));
    ballsArrayList.add(new Ball(17, 17, 0, 5, "#4779f7"));
    ballsArrayList.add(new Ball(232, 93, 0, 5, "#4b78f1"));
    
    // adjust sizes for this demo
    double scale = 0.70f;
    for (int i = ballsArrayList.size() - 1; i >= 0; i--) {
      Ball ball = ballsArrayList.get(i);
      ball.pos.x = width / 2 - scale * 180 + scale * ball.pos.x;
      ball.pos.y = height / 2 - scale * 65 + scale * ball.pos.y;
      ball.radius = scale * ball.radius;
      ball.startRadius = scale * ball.startRadius;
      ball.startPos.x = ball.pos.x;
      ball.startPos.y = ball.pos.y;
    }
    
    // add balls to array
    balls = new Ball[ballsArrayList.size()];
    for (int i = ballsArrayList.size() - 1; i >= 0; i--) {
      Ball ball = ballsArrayList.get(i);
      balls[i] = ball;
    }
  }
  
  public void update(double mouseX, double mouseY) {
    Vector d = new Vector(0, 0);
    for (int i = balls.length - 1; i >= 0; i--) {
      Ball ball = balls[i];
      d.x = mouseX - ball.pos.x;
      d.y = mouseY - ball.pos.y;
      if (d.magSquared() < 100*100) {
        ball.goal = Vector.sub(ball.pos, d);
      } else {
        ball.goal.set(ball.startPos);
      }
      
      ball.update();
    }
  }
  
  public void draw(Context2d context) {
    for(int i = balls.length - 1; i >= 0; i--) {
      balls[i].draw(context);
    }
  }
}
