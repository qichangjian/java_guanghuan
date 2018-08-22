package Test.enums;

public enum Man {
    MALE,FEMALE;

    private String name;

    Man() {
    }

    Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
