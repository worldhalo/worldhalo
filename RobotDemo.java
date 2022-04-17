package demo;

import java.awt.*;
import java.awt.event.KeyEvent;

class RobotDemo {

    private Robot robot = null;

    public RobotDemo() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * 模拟键盘输入abc
     */

    public void keyput(String str) throws AWTException {
        Keyboard keyboard = new Keyboard();
        if(str!=null){
            for(char c : str.toCharArray()){
               keyboard.type(c);
               delay(1);
            }
        }


    }


    public void delay(int milliseconds) {
        robot.delay(milliseconds);
    }

    public static void main(String[] args) throws AWTException {
        RobotDemo demo = new RobotDemo();
//        demo.delay(2000);
        //demo.mouseDemo();
        demo.keyput("create table t_emp (id int,\n" +
                "name varchar(32),\n" +
                "deptId int,\n" +
                "salary float)");

        //demo.keyBoardDemo();

    }
}