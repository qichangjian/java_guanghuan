package day5.task1;

public class Mouse {
    private String name;
    private String hobby;

    public void Talk(){
        System.out.println("我叫" + this.name + ",我爱好" + this.hobby + ".一只小猫，有啥可怕的！");
    }

    public Mouse(){
        super();
    }

    public Mouse(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
