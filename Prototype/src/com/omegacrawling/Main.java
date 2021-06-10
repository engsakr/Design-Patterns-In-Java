package com.omegacrawling;

/**
 * @author Ahmed Sakr <prog/sakr@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        UserEntity u1 = new UserEntity(1,"Ahmed Sakr","prog.sakr@gmail.com",26);
        u1.showRecord();

        System.out.println("=====================================");

        UserEntity u2 = (UserEntity) u1.getClone();
        u2.showRecord();

    }
}
