package com.omegacrawling;
/**
 * @author Ahmed Sakr <prog/sakr@gmail.com>
 */
class UserEntity implements UserPrototype {

    private int id;
    private String name;
    private String email;
    private int age;

    public UserEntity() {
        System.out.println("Class Loaded");
    }

    public UserEntity(int id, String name, String email, int age) {
        this();
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }


    public void showRecord(){
        System.out.println(id+"\t"+name+"\t"+email+"\t"+age+"\t");
    }

    @Override
    public UserPrototype getClone() {
        return new UserEntity(id,name,email,age);
    }
}
